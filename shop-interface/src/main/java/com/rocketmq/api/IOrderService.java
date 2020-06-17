package com.rocketmq.api;


import com.rocketmq.pojo.TradeOrder;
import com.rocketmq.result.Result;

public interface IOrderService {

    /**
     * 下单接口
     * @param order
     * @return
     */
    public Result confirmOrder(TradeOrder order);

}
