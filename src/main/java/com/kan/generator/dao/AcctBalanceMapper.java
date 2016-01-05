package com.kan.generator.dao;

import com.kan.generator.domain.AcctBalance;
import com.kan.generator.domain.AcctBalanceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AcctBalanceMapper {
    int countByExample(AcctBalanceCriteria example);

    int deleteByExample(AcctBalanceCriteria example);

    int deleteByPrimaryKey(Long balanceId);

    int insert(AcctBalance record);

    int insertSelective(AcctBalance record);

    List<AcctBalance> selectByExampleWithRowbounds(AcctBalanceCriteria example, RowBounds rowBounds);

    List<AcctBalance> selectByExample(AcctBalanceCriteria example);

    AcctBalance selectByPrimaryKey(Long balanceId);

    int updateByExampleSelective(@Param("record") AcctBalance record, @Param("example") AcctBalanceCriteria example);

    int updateByExample(@Param("record") AcctBalance record, @Param("example") AcctBalanceCriteria example);

    int updateByPrimaryKeySelective(AcctBalance record);

    int updateByPrimaryKey(AcctBalance record);
}