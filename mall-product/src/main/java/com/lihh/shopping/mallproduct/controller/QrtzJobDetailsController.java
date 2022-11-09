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

import com.lihh.shopping.mallproduct.entity.QrtzJobDetailsEntity;
import com.lihh.shopping.mallproduct.service.QrtzJobDetailsService;
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
@RequestMapping("mallproduct/qrtzjobdetails")
public class QrtzJobDetailsController {
    @Autowired
    private QrtzJobDetailsService qrtzJobDetailsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mallproduct:qrtzjobdetails:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzJobDetailsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("mallproduct:qrtzjobdetails:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzJobDetailsEntity qrtzJobDetails = qrtzJobDetailsService.getById(schedName);

        return R.ok().put("qrtzJobDetails", qrtzJobDetails);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mallproduct:qrtzjobdetails:save")
    public R save(@RequestBody QrtzJobDetailsEntity qrtzJobDetails){
		qrtzJobDetailsService.save(qrtzJobDetails);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mallproduct:qrtzjobdetails:update")
    public R update(@RequestBody QrtzJobDetailsEntity qrtzJobDetails){
		qrtzJobDetailsService.updateById(qrtzJobDetails);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mallproduct:qrtzjobdetails:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzJobDetailsService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
