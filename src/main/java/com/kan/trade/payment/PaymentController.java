package com.kan.trade.payment;

import com.kan.trade.payment.BO.PaymentBO;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  支付接口请求                     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29      <br>
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private  PaymentService paymentService;

    @RequestMapping(value="/1",method = GET,produces = MediaType.APPLICATION_JSON_VALUE)
    String home() {
        PaymentBO paymentBO = new PaymentBO();
        paymentBO.setBuyerUserId("A882699");
        paymentBO.setBankCode("0990");
        paymentBO.setOrderNo("YT882699");
        paymentBO.setPaymount(new BigDecimal("10"));
        try {
            System.out.println(paymentService.payment(paymentBO));
        } catch (Exception e) {
            System.out.println(e);
        }
        return "hellow";
    }
}
