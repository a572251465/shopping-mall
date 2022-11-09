package com.lihh.shopping.mallproduct.dao;

import com.lihh.shopping.mallproduct.entity.SysCaptchaEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统验证码
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {
	
}
