package com.rocketmq.service.impl;

import com.rocketmq.api.IGoodsService;
import com.rocketmq.enums.ShopCode;
import com.rocketmq.exception.CastException;
import com.rocketmq.mapper.TradeGoodsMapper;
import com.rocketmq.mapper.TradeGoodsNumberLogMapper;
import com.rocketmq.pojo.TradeGoods;
import com.rocketmq.pojo.TradeGoodsNumberLog;
import com.rocketmq.result.Result;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
@Service(interfaceClass = IGoodsService.class)
public class GoodsServiceImpl implements IGoodsService {

    @Resource
    private TradeGoodsMapper goodsMapper;

    @Resource
    private TradeGoodsNumberLogMapper goodsNumberLogMapper;

    @Override
    public TradeGoods findOne(Long goodsId) {
        if (goodsId == null) {
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public Result reduceGoodsNum(TradeGoodsNumberLog goodsNumberLog) {
        if (goodsNumberLog == null ||
                goodsNumberLog.getGoodsNumber() == null ||
                goodsNumberLog.getOrderId() == null ||
                goodsNumberLog.getGoodsNumber() == null ||
                goodsNumberLog.getGoodsNumber().intValue() <= 0) {
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        TradeGoods goods = goodsMapper.selectByPrimaryKey(goodsNumberLog.getGoodsId());
        if(goods.getGoodsNumber()<goodsNumberLog.getGoodsNumber()){
            //库存不足
            CastException.cast(ShopCode.SHOP_GOODS_NUM_NOT_ENOUGH);
        }
        //减库存
        goods.setGoodsNumber(goods.getGoodsNumber()-goodsNumberLog.getGoodsNumber());
        goodsMapper.updateByPrimaryKey(goods);


        //记录库存操作日志
        goodsNumberLog.setGoodsNumber(-(goodsNumberLog.getGoodsNumber()));
        goodsNumberLog.setLogTime(new Date());
        goodsNumberLogMapper.insert(goodsNumberLog);

        return new Result(ShopCode.SHOP_SUCCESS.getSuccess(),ShopCode.SHOP_SUCCESS.getMessage());
    }



}
