package com.lihh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.product.entity.QrtzPausedTriggerGrpsEntity;

import java.util.Map;

/**
 * 
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface QrtzPausedTriggerGrpsService extends IService<QrtzPausedTriggerGrpsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

