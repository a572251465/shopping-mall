package com.lihh.mall.product.dao;

import com.lihh.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:03:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
