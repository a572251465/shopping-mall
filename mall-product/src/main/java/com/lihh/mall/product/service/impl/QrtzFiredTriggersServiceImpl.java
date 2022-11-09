package com.lihh.mall.product.service.impl;

import com.lihh.mall.product.dao.QrtzFiredTriggersDao;
import com.lihh.mall.product.entity.QrtzFiredTriggersEntity;
import com.lihh.mall.product.service.QrtzFiredTriggersService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.Query;


@Service("qrtzFiredTriggersService")
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersDao, QrtzFiredTriggersEntity> implements QrtzFiredTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzFiredTriggersEntity> page = this.page(
                new Query<QrtzFiredTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzFiredTriggersEntity>()
        );

        return new PageUtils(page);
    }

}