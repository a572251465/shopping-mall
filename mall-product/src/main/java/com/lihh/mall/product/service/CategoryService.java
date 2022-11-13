package com.lihh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:03:35
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 按照Tree的格式 来查询品牌三级分类
     * @author lihh
     * @return list
     */
    List<CategoryEntity> queryPageWithTree();
}

