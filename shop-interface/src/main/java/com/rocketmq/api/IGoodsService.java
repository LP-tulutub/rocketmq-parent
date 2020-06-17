package com.rocketmq.api;


import com.rocketmq.pojo.TradeGoods;
import com.rocketmq.pojo.TradeGoodsNumberLog;
import com.rocketmq.result.Result;

public interface IGoodsService {
    /**
     * 根据ID查询商品对象
     * @param goodsId
     * @return
     */
    TradeGoods findOne(Long goodsId);

    /**
     * 扣减库存
     * @param goodsNumberLog
     * @return
     */
    Result reduceGoodsNum(TradeGoodsNumberLog goodsNumberLog);
}
