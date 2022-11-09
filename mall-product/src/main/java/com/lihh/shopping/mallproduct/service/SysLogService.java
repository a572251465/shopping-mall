package com.lihh.shopping.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.common.utils.PageUtils;
import com.lihh.shopping.mallproduct.entity.SysLogEntity;

import java.util.Map;

/**
 * 系统日志
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

