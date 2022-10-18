package com.houzz.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.houzz.shop.api.IUserService;
import com.houzz.shop.constant.ShopCode;
import com.houzz.shop.entity.Result;
import com.houzz.shop.exception.CastException;
import com.houzz.shop.mapper.ShopUserMapper;
import com.houzz.shop.pojo.ShopUser;
import com.houzz.shop.pojo.ShopUserMoneyLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author HouZZ
 **/
@Component
@Service(interfaceClass = IUserService.class)
public class ShopUserServiceImpl implements IUserService {

    @Autowired
    private ShopUserMapper userMapper;

    @Override
    public ShopUser findOne(Long userId) {
        if (userId==null){
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Result updateMoneyPaid(ShopUserMoneyLog userMoneyLog) {
        return null;
    }
}
