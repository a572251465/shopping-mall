package com.lihh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:03:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

