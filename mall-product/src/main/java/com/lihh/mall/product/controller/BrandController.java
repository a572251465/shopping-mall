package com.lihh.mall.product.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.lihh.mall.product.entity.BrandEntity;
import com.lihh.mall.product.service.BrandService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.R;



/**
 * 品牌
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:03:35
 */
@RefreshScope
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @Value("${user.userName}")
    private String userName;
    @Value("${user.age}")
    private Integer age;

    @RequestMapping(value = "/all")
    public R queryAllBrand() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        return R.ok().put("brands", brandEntity);
    }

    @GetMapping(value = "/queryUser")
    public R queryUser() {
        return R.ok().put("userName", userName).put("age", age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BrandEntity brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
