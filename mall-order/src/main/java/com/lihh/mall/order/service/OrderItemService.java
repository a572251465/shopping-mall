package com.lihh.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:11:33
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

