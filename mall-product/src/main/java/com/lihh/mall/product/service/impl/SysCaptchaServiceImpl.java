package com.lihh.mall.product.service.impl;

import com.lihh.mall.product.dao.SysCaptchaDao;
import com.lihh.mall.product.entity.SysCaptchaEntity;
import com.lihh.mall.product.service.SysCaptchaService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.Query;


@Service("sysCaptchaService")
public class SysCaptchaServiceImpl extends ServiceImpl<SysCaptchaDao, SysCaptchaEntity> implements SysCaptchaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysCaptchaEntity> page = this.page(
                new Query<SysCaptchaEntity>().getPage(params),
                new QueryWrapper<SysCaptchaEntity>()
        );

        return new PageUtils(page);
    }

}