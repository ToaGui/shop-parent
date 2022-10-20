package com.houzz.shop.api;


import com.houzz.shop.entity.Result;
import com.houzz.shop.pojo.ShopCoupon;

/**
 * 优惠券接口
 */
public interface ICouponService {


    /**
     * 根据ID查询优惠券对象
     * @param couponId
     * @return
     */
    public ShopCoupon findOne(Long couponId);

    /**
     * 更细优惠券状态
     * @param coupon
     * @return
     */
    Result updateCouponStatus(ShopCoupon coupon);
}
