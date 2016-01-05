package com.kan.generator.dao;

import com.kan.generator.domain.PayTransferOrder;
import com.kan.generator.domain.PayTransferOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service
public interface PayTransferOrderMapper {
    int countByExample(PayTransferOrderCriteria example);

    int deleteByExample(PayTransferOrderCriteria example);

    int deleteByPrimaryKey(String tradeNo);

    int insert(PayTransferOrder record);

    int insertSelective(PayTransferOrder record);

    List<PayTransferOrder> selectByExampleWithRowbounds(PayTransferOrderCriteria example, RowBounds rowBounds);

    List<PayTransferOrder> selectByExample(PayTransferOrderCriteria example);

    PayTransferOrder selectByPrimaryKey(String tradeNo);

    int updateByExampleSelective(@Param("record") PayTransferOrder record, @Param("example") PayTransferOrderCriteria example);

    int updateByExample(@Param("record") PayTransferOrder record, @Param("example") PayTransferOrderCriteria example);

    int updateByPrimaryKeySelective(PayTransferOrder record);

    int updateByPrimaryKey(PayTransferOrder record);
}