package com.lihh.shopping.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.common.utils.PageUtils;
import com.lihh.shopping.mallproduct.entity.QrtzFiredTriggersEntity;

import java.util.Map;

/**
 * 
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface QrtzFiredTriggersService extends IService<QrtzFiredTriggersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

