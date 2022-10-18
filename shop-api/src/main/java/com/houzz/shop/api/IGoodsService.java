package com.houzz.shop.api;

import com.houzz.shop.entity.Result;
import com.houzz.shop.pojo.ShopGoods;
import com.houzz.shop.pojo.ShopGoodsNumberLog;

public interface IGoodsService {
    /**
     * 根据ID查询商品对象
     * @param goodsId
     * @return
     */
    ShopGoods findOne(Long goodsId);

    /**
     * 扣减库存
     * @param goodsNumberLog
     * @return
     */
    Result reduceGoodsNum(ShopGoodsNumberLog goodsNumberLog);
}
