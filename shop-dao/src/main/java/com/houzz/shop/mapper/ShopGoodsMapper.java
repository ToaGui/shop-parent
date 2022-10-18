package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopGoods;
import com.houzz.shop.pojo.ShopGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsMapper {
    int countByExample(ShopGoodsExample example);

    int deleteByExample(ShopGoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(ShopGoods record);

    int insertSelective(ShopGoods record);

    List<ShopGoods> selectByExample(ShopGoodsExample example);

    ShopGoods selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByExample(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByPrimaryKeySelective(ShopGoods record);

    int updateByPrimaryKey(ShopGoods record);
}