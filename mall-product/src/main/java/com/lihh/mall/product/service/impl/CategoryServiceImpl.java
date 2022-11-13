package com.lihh.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.Query;

import com.lihh.mall.product.dao.CategoryDao;
import com.lihh.mall.product.entity.CategoryEntity;
import com.lihh.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    /**
     * @author lihh
     * 将品牌转换为Tree
     * @param parentCategoryEntity 父类的品牌entity
     * @param totalCategoryEntity 表示查询所有的品牌entity
     */
    private List<CategoryEntity> categoryTransformVO(CategoryEntity parentCategoryEntity, List<CategoryEntity> totalCategoryEntity) {
        return totalCategoryEntity.stream()
                .filter(categoryEntity -> parentCategoryEntity.getCatId().equals(categoryEntity.getParentCid()))
                .peek(categoryEntity -> categoryEntity.setChildren(categoryTransformVO(categoryEntity, totalCategoryEntity)))
                .collect(Collectors.toList());
    }

    /**
     * @author lihh
     * @return list
     */
    @Override
    public List<CategoryEntity> queryPageWithTree() {
        // 1. 查询所有的商品的分类
        List<CategoryEntity> categoryEntities  = baseMapper.selectList(null);

        // 2. 开始将列表转换为Tree
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek(categoryEntity -> categoryEntity.setChildren(categoryTransformVO(categoryEntity, categoryEntities)))
                .collect(Collectors.toList());
    }

}