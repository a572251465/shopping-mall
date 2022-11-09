package com.lihh.shopping.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.common.utils.PageUtils;
import com.lihh.shopping.mallproduct.entity.SysMenuEntity;

import java.util.Map;

/**
 * 菜单管理
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface SysMenuService extends IService<SysMenuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

