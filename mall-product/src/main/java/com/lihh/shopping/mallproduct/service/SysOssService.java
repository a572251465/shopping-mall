package com.lihh.shopping.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.common.utils.PageUtils;
import com.lihh.shopping.mallproduct.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

