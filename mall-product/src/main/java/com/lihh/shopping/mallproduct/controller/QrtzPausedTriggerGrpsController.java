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

import com.lihh.shopping.mallproduct.entity.QrtzPausedTriggerGrpsEntity;
import com.lihh.shopping.mallproduct.service.QrtzPausedTriggerGrpsService;
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
@RequestMapping("mallproduct/qrtzpausedtriggergrps")
public class QrtzPausedTriggerGrpsController {
    @Autowired
    private QrtzPausedTriggerGrpsService qrtzPausedTriggerGrpsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallproduct:qrtzpausedtriggergrps:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzPausedTriggerGrpsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("mallproduct:qrtzpausedtriggergrps:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzPausedTriggerGrpsEntity qrtzPausedTriggerGrps = qrtzPausedTriggerGrpsService.getById(schedName);

        return R.ok().put("qrtzPausedTriggerGrps", qrtzPausedTriggerGrps);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallproduct:qrtzpausedtriggergrps:save")
    public R save(@RequestBody QrtzPausedTriggerGrpsEntity qrtzPausedTriggerGrps){
		qrtzPausedTriggerGrpsService.save(qrtzPausedTriggerGrps);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallproduct:qrtzpausedtriggergrps:update")
    public R update(@RequestBody QrtzPausedTriggerGrpsEntity qrtzPausedTriggerGrps){
		qrtzPausedTriggerGrpsService.updateById(qrtzPausedTriggerGrps);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallproduct:qrtzpausedtriggergrps:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzPausedTriggerGrpsService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
