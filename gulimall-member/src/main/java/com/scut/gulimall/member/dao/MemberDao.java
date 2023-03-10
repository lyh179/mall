package com.scut.gulimall.member.dao;

import com.scut.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lyh
 * @email lyh@gmail.com
 * @date 2023-03-09 11:08:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
