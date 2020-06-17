package com.rocketmq.api;


import com.rocketmq.pojo.TradeCoupon;
import com.rocketmq.result.Result;

/**
 * 优惠券接口
 */
public interface ICouponService {


    /**
     * 根据ID查询优惠券对象
     * @param coupouId
     * @return
     */
    public TradeCoupon findOne(Long coupouId);

    /**
     * 更细优惠券状态
     * @param coupon
     * @return
     */
    Result updateCouponStatus(TradeCoupon coupon);
}
