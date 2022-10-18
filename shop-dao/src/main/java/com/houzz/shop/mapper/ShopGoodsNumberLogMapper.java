package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopGoodsNumberLog;
import com.houzz.shop.pojo.ShopGoodsNumberLogExample;
import com.houzz.shop.pojo.ShopGoodsNumberLogKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsNumberLogMapper {
    int countByExample(ShopGoodsNumberLogExample example);

    int deleteByExample(ShopGoodsNumberLogExample example);

    int deleteByPrimaryKey(ShopGoodsNumberLogKey key);

    int insert(ShopGoodsNumberLog record);

    int insertSelective(ShopGoodsNumberLog record);

    List<ShopGoodsNumberLog> selectByExample(ShopGoodsNumberLogExample example);

    ShopGoodsNumberLog selectByPrimaryKey(ShopGoodsNumberLogKey key);

    int updateByExampleSelective(@Param("record") ShopGoodsNumberLog record, @Param("example") ShopGoodsNumberLogExample example);

    int updateByExample(@Param("record") ShopGoodsNumberLog record, @Param("example") ShopGoodsNumberLogExample example);

    int updateByPrimaryKeySelective(ShopGoodsNumberLog record);

    int updateByPrimaryKey(ShopGoodsNumberLog record);
}