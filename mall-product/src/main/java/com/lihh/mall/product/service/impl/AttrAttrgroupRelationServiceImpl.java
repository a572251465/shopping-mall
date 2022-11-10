package com.lihh.mall.product.service.impl;

import com.lihh.mall.commons.utils.Query;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;

import com.lihh.mall.product.dao.AttrAttrgroupRelationDao;
import com.lihh.mall.product.entity.AttrAttrgroupRelationEntity;
import com.lihh.mall.product.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;


@Service
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

        return new PageUtils(page);
    }

}