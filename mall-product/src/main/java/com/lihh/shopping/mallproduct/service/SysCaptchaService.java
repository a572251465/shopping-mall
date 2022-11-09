package com.lihh.shopping.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.common.utils.PageUtils;
import com.lihh.shopping.mallproduct.entity.SysCaptchaEntity;

import java.util.Map;

/**
 * 系统验证码
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
public interface SysCaptchaService extends IService<SysCaptchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

