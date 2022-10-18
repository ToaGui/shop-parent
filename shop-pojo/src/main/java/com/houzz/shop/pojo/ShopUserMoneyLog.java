package com.houzz.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ShopUserMoneyLog extends ShopUserMoneyLogKey {
    private BigDecimal useMoney;

    private Date createTime;

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}