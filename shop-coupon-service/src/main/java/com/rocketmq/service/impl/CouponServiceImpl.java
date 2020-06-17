package com.rocketmq.service.impl;

import com.rocketmq.api.ICouponService;
import com.rocketmq.enums.ShopCode;
import com.rocketmq.exception.CastException;
import com.rocketmq.mapper.TradeCouponMapper;
import com.rocketmq.pojo.TradeCoupon;
import com.rocketmq.result.Result;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = ICouponService.class)
public class CouponServiceImpl implements ICouponService{

    @Resource
    private TradeCouponMapper couponMapper;

    @Override
    public TradeCoupon findOne(Long coupouId) {
        if(coupouId==null){
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }

        return couponMapper.selectByPrimaryKey(coupouId);
    }

    @Override
    public Result updateCouponStatus(TradeCoupon coupon) {
        if(coupon==null||coupon.getCouponId()==null){
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        //更新优惠券状态
        couponMapper.updateByPrimaryKey(coupon);
        return new Result(ShopCode.SHOP_SUCCESS.getSuccess(),ShopCode.SHOP_SUCCESS.getMessage());
    }
}
