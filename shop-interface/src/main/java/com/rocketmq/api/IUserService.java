package com.rocketmq.api;


import com.rocketmq.pojo.TradeUser;
import com.rocketmq.pojo.TradeUserMoneyLog;
import com.rocketmq.result.Result;

public interface IUserService {
    TradeUser findOne(Long userId);

    Result updateMoneyPaid(TradeUserMoneyLog userMoneyLog);
}
