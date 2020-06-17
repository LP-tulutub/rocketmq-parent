package com.rocketmq.mq;

import com.alibaba.fastjson.JSON;
import com.rocketmq.enums.ShopCode;
import com.rocketmq.mapper.TradeOrderMapper;
import com.rocketmq.pojo.TradeOrder;
import com.rocketmq.result.MQEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;


@Slf4j
@Component
@RocketMQMessageListener(topic = "${mq.order.topic}", consumerGroup = "${mq.order.consumer.group.name}", messageModel = MessageModel.BROADCASTING )
public class CancelMQListener implements RocketMQListener<MessageExt>{

    @Resource
    private TradeOrderMapper orderMapper;

    @Override
    public void onMessage(MessageExt messageExt) {

        try {
            //1. 解析消息内容
            String body = new String(messageExt.getBody(),"UTF-8");
            MQEntity mqEntity = JSON.parseObject(body, MQEntity.class);
            log.info("接受消息成功");
            //2. 查询订单
            TradeOrder order = orderMapper.selectByPrimaryKey(mqEntity.getOrderId());
            //3.更新订单状态为取消
            order.setOrderStatus(ShopCode.SHOP_ORDER_CANCEL.getCode());
            orderMapper.updateByPrimaryKey(order);
            log.info("订单状态设置为取消");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            log.info("订单取消失败");
        }
    }
}
