package com.lihh.shopping.mallproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.common.utils.PageUtils;
import com.lihh.common.utils.Query;

import com.lihh.shopping.mallproduct.dao.QrtzJobDetailsDao;
import com.lihh.shopping.mallproduct.entity.QrtzJobDetailsEntity;
import com.lihh.shopping.mallproduct.service.QrtzJobDetailsService;


@Service("qrtzJobDetailsService")
public class QrtzJobDetailsServiceImpl extends ServiceImpl<QrtzJobDetailsDao, QrtzJobDetailsEntity> implements QrtzJobDetailsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzJobDetailsEntity> page = this.page(
                new Query<QrtzJobDetailsEntity>().getPage(params),
                new QueryWrapper<QrtzJobDetailsEntity>()
        );

        return new PageUtils(page);
    }

}