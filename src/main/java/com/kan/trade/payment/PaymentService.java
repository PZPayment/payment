package com.kan.trade.payment;

import com.kan.trade.payment.BO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.trade.payment  <br>
 * 描      述: 交易                     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/28      <br>
 */
@Service
public class PaymentService {

    @Autowired
    TradeOrderDAO tradeOrderDAO;
    /**
     * 订单支付
     * @param paymentBO
     * @return
     * @throws Exception
     */
    public PaymentResultBO payment(PaymentBO paymentBO) throws Exception {
        PaymentResultBO paymentResultBO = new PaymentResultBO();
        tradeOrderDAO.selectByPrimaryKey(paymentBO.getOrderNo());
        return paymentResultBO;
    }

    /**
     * 交易退款
     * @param refundBO
     * @return
     * @throws Exception
     */
    public RefundResultBO refund(RefundBO refundBO) throws Exception {
        RefundResultBO refundResultBO = new RefundResultBO();

        return refundResultBO;
    }


    /**
     * 转账方法
     * @param transferBO
     * @return
     * @throws Exception
     */
    public TransferResultBO transfer(TransferBO transferBO) throws Exception {
        TransferResultBO transferResultBO = new TransferResultBO();
        return transferResultBO;
    }
}
