package com.lihh.mall.product.service.impl;

import com.lihh.mall.product.dao.SysMenuDao;
import com.lihh.mall.product.entity.SysMenuEntity;
import com.lihh.mall.product.service.SysMenuService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.commons.utils.Query;


@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysMenuEntity> page = this.page(
                new Query<SysMenuEntity>().getPage(params),
                new QueryWrapper<SysMenuEntity>()
        );

        return new PageUtils(page);
    }

}