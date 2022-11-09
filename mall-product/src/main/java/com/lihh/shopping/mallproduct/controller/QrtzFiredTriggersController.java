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

import com.lihh.shopping.mallproduct.entity.QrtzFiredTriggersEntity;
import com.lihh.shopping.mallproduct.service.QrtzFiredTriggersService;
import com.lihh.common.utils.PageUtils;
import com.lihh.common.utils.R;



/**
 * 
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
@RestController
@RequestMapping("mallproduct/qrtzfiredtriggers")
public class QrtzFiredTriggersController {
    @Autowired
    private QrtzFiredTriggersService qrtzFiredTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallproduct:qrtzfiredtriggers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzFiredTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("mallproduct:qrtzfiredtriggers:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzFiredTriggersEntity qrtzFiredTriggers = qrtzFiredTriggersService.getById(schedName);

        return R.ok().put("qrtzFiredTriggers", qrtzFiredTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallproduct:qrtzfiredtriggers:save")
    public R save(@RequestBody QrtzFiredTriggersEntity qrtzFiredTriggers){
		qrtzFiredTriggersService.save(qrtzFiredTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallproduct:qrtzfiredtriggers:update")
    public R update(@RequestBody QrtzFiredTriggersEntity qrtzFiredTriggers){
		qrtzFiredTriggersService.updateById(qrtzFiredTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallproduct:qrtzfiredtriggers:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzFiredTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
