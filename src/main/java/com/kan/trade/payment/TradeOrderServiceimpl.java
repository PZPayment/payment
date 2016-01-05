package com.kan.trade.payment;

import com.kan.base.dao.BaseDao;
import com.kan.base.service.BaseService;
import com.kan.base.service.BaseServiceImpl;
import com.kan.generator.dao.PayTransferOrderMapper;
import com.kan.generator.domain.PayTradeOrder;
import com.kan.generator.domain.PayTradeOrderCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.trade.payment  <br>
 * 描      述:  订单相关操作                     <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29      <br>
 */
@Service
public class TradeOrderServiceImpl extends BaseServiceImpl<PayTradeOrder, PayTradeOrderCriteria>  implements TradeOrderService
 {

    @Autowired
    PayTransferOrderMapper payTransferOrderMapper;

    @Override
    protected BaseDao<PayTradeOrder, PayTradeOrderCriteria, String> getDao() {
        return null;
    }
}
