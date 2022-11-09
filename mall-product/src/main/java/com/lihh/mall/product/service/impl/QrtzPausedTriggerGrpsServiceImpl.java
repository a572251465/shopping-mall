package com.lihh.mall.product.service.impl;

import com.lihh.mall.product.dao.QrtzPausedTriggerGrpsDao;
import com.lihh.mall.product.entity.QrtzPausedTriggerGrpsEntity;
import com.lihh.mall.product.service.QrtzPausedTriggerGrpsService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.Query;


@Service("qrtzPausedTriggerGrpsService")
public class QrtzPausedTriggerGrpsServiceImpl extends ServiceImpl<QrtzPausedTriggerGrpsDao, QrtzPausedTriggerGrpsEntity> implements QrtzPausedTriggerGrpsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzPausedTriggerGrpsEntity> page = this.page(
                new Query<QrtzPausedTriggerGrpsEntity>().getPage(params),
                new QueryWrapper<QrtzPausedTriggerGrpsEntity>()
        );

        return new PageUtils(page);
    }

}