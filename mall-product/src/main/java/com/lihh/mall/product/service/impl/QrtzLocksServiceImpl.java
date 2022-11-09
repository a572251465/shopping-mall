package com.lihh.mall.product.service.impl;

import com.lihh.mall.product.dao.QrtzLocksDao;
import com.lihh.mall.product.entity.QrtzLocksEntity;
import com.lihh.mall.product.service.QrtzLocksService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.Query;


@Service("qrtzLocksService")
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksDao, QrtzLocksEntity> implements QrtzLocksService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzLocksEntity> page = this.page(
                new Query<QrtzLocksEntity>().getPage(params),
                new QueryWrapper<QrtzLocksEntity>()
        );

        return new PageUtils(page);
    }

}