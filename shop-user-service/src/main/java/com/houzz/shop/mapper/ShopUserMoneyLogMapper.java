package com.houzz.shop.mapper;

import com.houzz.shop.pojo.ShopUserMoneyLog;
import com.houzz.shop.pojo.ShopUserMoneyLogExample;
import com.houzz.shop.pojo.ShopUserMoneyLogKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopUserMoneyLogMapper {
    int countByExample(ShopUserMoneyLogExample example);

    int deleteByExample(ShopUserMoneyLogExample example);

    int deleteByPrimaryKey(ShopUserMoneyLogKey key);

    int insert(ShopUserMoneyLog record);

    int insertSelective(ShopUserMoneyLog record);

    List<ShopUserMoneyLog> selectByExample(ShopUserMoneyLogExample example);

    ShopUserMoneyLog selectByPrimaryKey(ShopUserMoneyLogKey key);

    int updateByExampleSelective(@Param("record") ShopUserMoneyLog record, @Param("example") ShopUserMoneyLogExample example);

    int updateByExample(@Param("record") ShopUserMoneyLog record, @Param("example") ShopUserMoneyLogExample example);

    int updateByPrimaryKeySelective(ShopUserMoneyLog record);

    int updateByPrimaryKey(ShopUserMoneyLog record);
}