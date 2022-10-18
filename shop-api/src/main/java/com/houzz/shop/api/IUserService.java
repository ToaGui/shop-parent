package com.houzz.shop.api;

import com.houzz.shop.entity.Result;
import com.houzz.shop.pojo.ShopUser;
import com.houzz.shop.pojo.ShopUserMoneyLog;

public interface IUserService {
    ShopUser findOne(Long userId);

    Result updateMoneyPaid(ShopUserMoneyLog userMoneyLog);
}
