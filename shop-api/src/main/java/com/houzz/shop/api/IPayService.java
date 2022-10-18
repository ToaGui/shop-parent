package com.houzz.shop.api;


import com.alibaba.dubbo.remoting.RemotingException;
import com.houzz.shop.entity.Result;
import com.houzz.shop.pojo.ShopPay;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;

public interface IPayService {

    public Result createPayment(ShopPay tradePay);

    public Result callbackPayment(ShopPay tradePay) throws InterruptedException, RemotingException, MQClientException, MQBrokerException;

}
