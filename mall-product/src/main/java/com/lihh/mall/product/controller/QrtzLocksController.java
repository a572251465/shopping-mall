package com.lihh.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.R;
import com.lihh.mall.product.entity.QrtzLocksEntity;
import com.lihh.mall.product.service.QrtzLocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
@RestController
@RequestMapping("mallproduct/qrtzlocks")
public class QrtzLocksController {
    @Autowired
    private QrtzLocksService qrtzLocksService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzLocksService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzLocksEntity qrtzLocks = qrtzLocksService.getById(schedName);

        return R.ok().put("qrtzLocks", qrtzLocks);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzLocksEntity qrtzLocks){
		qrtzLocksService.save(qrtzLocks);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzLocksEntity qrtzLocks){
		qrtzLocksService.updateById(qrtzLocks);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzLocksService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
