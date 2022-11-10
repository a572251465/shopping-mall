package com.lihh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihh.mall.commons.utils.PageUtils;
import com.lihh.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * ��Ʒ����
 *
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 15:39:01
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

