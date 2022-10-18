package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopMqProducerTemp;
import com.houzz.shop.pojo.ShopMqProducerTempExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMqProducerTempMapper {
    int countByExample(ShopMqProducerTempExample example);

    int deleteByExample(ShopMqProducerTempExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopMqProducerTemp record);

    int insertSelective(ShopMqProducerTemp record);

    List<ShopMqProducerTemp> selectByExample(ShopMqProducerTempExample example);

    ShopMqProducerTemp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopMqProducerTemp record, @Param("example") ShopMqProducerTempExample example);

    int updateByExample(@Param("record") ShopMqProducerTemp record, @Param("example") ShopMqProducerTempExample example);

    int updateByPrimaryKeySelective(ShopMqProducerTemp record);

    int updateByPrimaryKey(ShopMqProducerTemp record);
}