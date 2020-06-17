package com.rocketmq.test;

import com.rocketmq.AppShopPayServiceProducer;
import com.rocketmq.api.IPayService;
import com.rocketmq.enums.ShopCode;
import com.rocketmq.pojo.TradePay;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppShopPayServiceProducer.class)
public class PayServiceTest {

    @Resource
    private IPayService payService;

    @Test
    public void createPayment(){
        // order id 拿过来
        long orderId = 470666924246831104L;
        TradePay tradePay = new TradePay();
        tradePay.setOrderId(orderId);
        tradePay.setPayAmount(new BigDecimal(4880));
        payService.createPayment(tradePay);
    }

    @Test
    public void callbackPayment() throws InterruptedException, RemotingException, MQClientException, MQBrokerException, IOException {
        // id 拿过来
        long payId = 470668643701755904L;
        long orderId = 470666924246831104L;

        TradePay tradePay = new TradePay();
        tradePay.setPayId(payId);
        tradePay.setOrderId(orderId);
        tradePay.setIsPaid(ShopCode.SHOP_ORDER_PAY_STATUS_IS_PAY.getCode());
        payService.callbackPayment(tradePay);

        System.in.read();

    }

}
