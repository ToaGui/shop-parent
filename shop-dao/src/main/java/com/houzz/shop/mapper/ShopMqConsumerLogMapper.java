package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopMqConsumerLog;
import com.houzz.shop.pojo.ShopMqConsumerLogExample;
import com.houzz.shop.pojo.ShopMqConsumerLogKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMqConsumerLogMapper {
    int countByExample(ShopMqConsumerLogExample example);

    int deleteByExample(ShopMqConsumerLogExample example);

    int deleteByPrimaryKey(ShopMqConsumerLogKey key);

    int insert(ShopMqConsumerLog record);

    int insertSelective(ShopMqConsumerLog record);

    List<ShopMqConsumerLog> selectByExample(ShopMqConsumerLogExample example);

    ShopMqConsumerLog selectByPrimaryKey(ShopMqConsumerLogKey key);

    int updateByExampleSelective(@Param("record") ShopMqConsumerLog record, @Param("example") ShopMqConsumerLogExample example);

    int updateByExample(@Param("record") ShopMqConsumerLog record, @Param("example") ShopMqConsumerLogExample example);

    int updateByPrimaryKeySelective(ShopMqConsumerLog record);

    int updateByPrimaryKey(ShopMqConsumerLog record);
}