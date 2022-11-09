package com.lihh.shopping.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.common.utils.PageUtils;
import com.lihh.shopping.mallproduct.entity.SysRoleEntity;

import java.util.Map;

/**
 * 角色
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

