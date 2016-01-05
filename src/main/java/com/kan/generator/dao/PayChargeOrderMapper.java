package com.kan.generator.dao;

import com.kan.generator.domain.PayChargeOrder;
import com.kan.generator.domain.PayChargeOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PayChargeOrderMapper {
    int countByExample(PayChargeOrderCriteria example);

    int deleteByExample(PayChargeOrderCriteria example);

    int deleteByPrimaryKey(String chargeNo);

    int insert(PayChargeOrder record);

    int insertSelective(PayChargeOrder record);

    List<PayChargeOrder> selectByExampleWithRowbounds(PayChargeOrderCriteria example, RowBounds rowBounds);

    List<PayChargeOrder> selectByExample(PayChargeOrderCriteria example);

    PayChargeOrder selectByPrimaryKey(String chargeNo);

    int updateByExampleSelective(@Param("record") PayChargeOrder record, @Param("example") PayChargeOrderCriteria example);

    int updateByExample(@Param("record") PayChargeOrder record, @Param("example") PayChargeOrderCriteria example);

    int updateByPrimaryKeySelective(PayChargeOrder record);

    int updateByPrimaryKey(PayChargeOrder record);
}