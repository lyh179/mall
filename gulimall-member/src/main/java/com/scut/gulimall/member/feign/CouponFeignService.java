package com.scut.gulimall.member.feign;


import com.scut.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 */
//表示这个接口是个远程客户端

@FeignClient("gulimall-coupon") //告诉spring cloud这个接口是一个远程客户端，要调用coupon服务(nacos中找到)，具体是调用coupon服务的/coupon/coupon/member/list对应的方法
public interface CouponFeignService {


    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
