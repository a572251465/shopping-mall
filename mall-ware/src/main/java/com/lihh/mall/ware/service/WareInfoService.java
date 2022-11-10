package com.lihh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:16:17
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

