package com.kan.generator.dao;

import com.kan.generator.domain.PayMerchantOrder;
import com.kan.generator.domain.PayMerchantOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PayMerchantOrderMapper {
    int countByExample(PayMerchantOrderCriteria example);

    int deleteByExample(PayMerchantOrderCriteria example);

    int deleteByPrimaryKey(String payNo);

    int insert(PayMerchantOrder record);

    int insertSelective(PayMerchantOrder record);

    List<PayMerchantOrder> selectByExampleWithRowbounds(PayMerchantOrderCriteria example, RowBounds rowBounds);

    List<PayMerchantOrder> selectByExample(PayMerchantOrderCriteria example);

    PayMerchantOrder selectByPrimaryKey(String payNo);

    int updateByExampleSelective(@Param("record") PayMerchantOrder record, @Param("example") PayMerchantOrderCriteria example);

    int updateByExample(@Param("record") PayMerchantOrder record, @Param("example") PayMerchantOrderCriteria example);

    int updateByPrimaryKeySelective(PayMerchantOrder record);

    int updateByPrimaryKey(PayMerchantOrder record);
}