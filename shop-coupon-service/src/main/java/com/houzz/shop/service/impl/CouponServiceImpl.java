package com.houzz.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.houzz.shop.api.ICouponService;
import com.houzz.shop.constant.ShopCode;
import com.houzz.shop.entity.Result;
import com.houzz.shop.exception.CastException;
import com.houzz.shop.mapper.ShopCouponMapper;
import com.houzz.shop.pojo.ShopCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author HouZZ
 **/
@Component
@Service(interfaceClass = ICouponService.class)
public class CouponServiceImpl implements ICouponService{

    @Autowired
    private ShopCouponMapper couponMapper;

    @Override
    public ShopCoupon findOne(Long couponId) {
        if (couponId==null){
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        return couponMapper.selectByPrimaryKey(couponId);
    }

    @Override
    public Result updateCouponStatus(ShopCoupon coupon) {
        if(coupon==null||coupon.getCouponId()==null){
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        //更新优惠券状态
        couponMapper.updateByPrimaryKey(coupon);
        return new Result(ShopCode.SHOP_SUCCESS.getSuccess(),ShopCode.SHOP_SUCCESS.getMessage());
    }
}
