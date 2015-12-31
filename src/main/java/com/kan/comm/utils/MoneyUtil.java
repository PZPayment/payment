package com.kan.comm.utils;

import java.math.BigDecimal;

/**
 * 资金相关计算方法
 *
 * @author chenfayong
 */
public class MoneyUtil {

    /**
     * 元(精确到厘)精确到分
     *
     * @param amount - 金额（元）
     * @return - 金额（元）
     */
    public static BigDecimal yunToFen(BigDecimal amount) {
        if (amount == null) {
            return new BigDecimal(0);
        }

        BigDecimal result = amount.setScale(2, BigDecimal.ROUND_HALF_UP);
        return result;
    }

}
