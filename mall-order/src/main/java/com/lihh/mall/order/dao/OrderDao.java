package com.lihh.mall.order.dao;

import com.lihh.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:11:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
