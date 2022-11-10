package com.lihh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku��������&ֵ
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 15:39:01
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

