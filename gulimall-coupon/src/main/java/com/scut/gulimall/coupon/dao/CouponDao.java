package com.scut.gulimall.coupon.dao;

import com.scut.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lyh
 * @email lyh@gmail.com
 * @date 2023-03-09 10:29:16
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
