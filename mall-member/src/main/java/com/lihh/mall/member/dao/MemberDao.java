package com.lihh.mall.member.dao;

import com.lihh.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 17:14:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
