package com.rocketmq.test;

import com.rocketmq.AppClientTest;
import com.rocketmq.enums.ShopCode;
import com.rocketmq.pojo.TradePay;
import com.rocketmq.result.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppClientTest.class)
public class PayWebTest {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${shop.pay.baseURI}")
    private String baseURI;

    @Value("${shop.pay.createPayment}")
    private String createPaymentPath;

    @Value("/pay/callBackPayment")
    private String callBackPaymentPath;

    @Test
    public void createPayment(){
        // order id 拿过来
        long orderId = 470666924246831104L;
        TradePay tradePay = new TradePay();
        tradePay.setOrderId(orderId);
        tradePay.setPayAmount(new BigDecimal(4880));

        Result result = restTemplate.postForEntity(baseURI + createPaymentPath, tradePay, Result.class).getBody();
        System.out.println(result);
    }

    @Test
    public void callBackPayment() throws IOException {
        // id 拿过来
        long payId = 470668643701755904L;
        long orderId = 470666924246831104L;

        TradePay tradePay = new TradePay();
        tradePay.setPayId(payId);
        tradePay.setOrderId(orderId);
        tradePay.setIsPaid(ShopCode.SHOP_ORDER_PAY_STATUS_IS_PAY.getCode());

        Result result = restTemplate.postForEntity(baseURI + callBackPaymentPath, tradePay, Result.class).getBody();
        System.out.println(result);

        System.in.read();
    }


}
