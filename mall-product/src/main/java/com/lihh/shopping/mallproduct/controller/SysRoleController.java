package com.lihh.shopping.mallproduct.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lihh.shopping.mallproduct.entity.SysRoleEntity;
import com.lihh.shopping.mallproduct.service.SysRoleService;
import com.lihh.common.utils.PageUtils;
import com.lihh.common.utils.R;



/**
 * 角色
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
@RestController
@RequestMapping("mallproduct/sysrole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallproduct:sysrole:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysRoleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
    @RequiresPermissions("mallproduct:sysrole:info")
    public R info(@PathVariable("roleId") Long roleId){
		SysRoleEntity sysRole = sysRoleService.getById(roleId);

        return R.ok().put("sysRole", sysRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallproduct:sysrole:save")
    public R save(@RequestBody SysRoleEntity sysRole){
		sysRoleService.save(sysRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallproduct:sysrole:update")
    public R update(@RequestBody SysRoleEntity sysRole){
		sysRoleService.updateById(sysRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallproduct:sysrole:delete")
    public R delete(@RequestBody Long[] roleIds){
		sysRoleService.removeByIds(Arrays.asList(roleIds));

        return R.ok();
    }

}
