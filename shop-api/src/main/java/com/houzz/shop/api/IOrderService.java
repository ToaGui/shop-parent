package com.houzz.shop.api;


import com.houzz.shop.entity.Result;
import com.houzz.shop.pojo.ShopOrder;

public interface IOrderService {

    /**
     * 下单接口
     * @param order
     * @return
     */
    public Result confirmOrder(ShopOrder order);

}
