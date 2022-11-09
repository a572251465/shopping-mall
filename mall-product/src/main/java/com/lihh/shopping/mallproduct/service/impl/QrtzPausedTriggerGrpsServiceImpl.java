package com.lihh.shopping.mallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.common.utils.PageUtils;
import com.lihh.common.utils.Query;

import com.lihh.shopping.mallproduct.dao.QrtzPausedTriggerGrpsDao;
import com.lihh.shopping.mallproduct.entity.QrtzPausedTriggerGrpsEntity;
import com.lihh.shopping.mallproduct.service.QrtzPausedTriggerGrpsService;


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