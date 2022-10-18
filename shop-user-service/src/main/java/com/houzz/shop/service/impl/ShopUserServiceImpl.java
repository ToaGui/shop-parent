package com.houzz.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.houzz.shop.api.IUserService;
import com.houzz.shop.entity.Result;
import com.houzz.shop.pojo.ShopUser;
import com.houzz.shop.pojo.ShopUserMoneyLog;
import org.springframework.stereotype.Component;

/**
 * @author HouZZ
 **/
@Component
@Service(interfaceClass = IUserService.class)
public class ShopUserServiceImpl implements IUserService {
    @Override
    public ShopUser findOne(Long userId) {
        return null;
    }

    @Override
    public Result updateMoneyPaid(ShopUserMoneyLog userMoneyLog) {
        return null;
    }
}
