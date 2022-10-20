package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopCoupon;
import com.houzz.shop.pojo.ShopCouponExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopCouponMapper {
    int countByExample(ShopCouponExample example);

    int deleteByExample(ShopCouponExample example);

    int deleteByPrimaryKey(Long couponId);

    int insert(ShopCoupon record);

    int insertSelective(ShopCoupon record);

    List<ShopCoupon> selectByExample(ShopCouponExample example);

    ShopCoupon selectByPrimaryKey(Long couponId);

    int updateByExampleSelective(@Param("record") ShopCoupon record, @Param("example") ShopCouponExample example);

    int updateByExample(@Param("record") ShopCoupon record, @Param("example") ShopCouponExample example);

    int updateByPrimaryKeySelective(ShopCoupon record);

    int updateByPrimaryKey(ShopCoupon record);
}