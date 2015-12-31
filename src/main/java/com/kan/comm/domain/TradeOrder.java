package com.kan.comm.domain;

import com.kan.base.domain.AbstractAuditingEntity;
import lombok.Data;

import javax.persistence.Entity;

import java.io.Serializable;

/**
 * 版      权:  江苏千米网络科技有限公司  <br>
 * 包      名: com.kan.trade.payment.BO  <br>
 * 描      述:                       <br>
 * 创 建 人 : 方超(OF716)  <br>
 * 修改时间:  15/12/29      <br>
 */
@Data
@Entity
public class TradeOrder extends AbstractAuditingEntity implements Serializable {
    private static final long serialVersionUID = -6802294359117284956L;

    private String payUserId;


    @Override
    public String getId() {
        return getOrderNo();
    }
}
