package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopPay;
import com.houzz.shop.pojo.ShopPayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopPayMapper {
    int countByExample(ShopPayExample example);

    int deleteByExample(ShopPayExample example);

    int deleteByPrimaryKey(Long payId);

    int insert(ShopPay record);

    int insertSelective(ShopPay record);

    List<ShopPay> selectByExample(ShopPayExample example);

    ShopPay selectByPrimaryKey(Long payId);

    int updateByExampleSelective(@Param("record") ShopPay record, @Param("example") ShopPayExample example);

    int updateByExample(@Param("record") ShopPay record, @Param("example") ShopPayExample example);

    int updateByPrimaryKeySelective(ShopPay record);

    int updateByPrimaryKey(ShopPay record);
}