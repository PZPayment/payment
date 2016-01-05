package com.kan.generator.dao;

import com.kan.generator.domain.AcctFundsRecord;
import com.kan.generator.domain.AcctFundsRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AcctFundsRecordMapper {
    int countByExample(AcctFundsRecordCriteria example);

    int deleteByExample(AcctFundsRecordCriteria example);

    int insert(AcctFundsRecord record);

    int insertSelective(AcctFundsRecord record);

    List<AcctFundsRecord> selectByExampleWithRowbounds(AcctFundsRecordCriteria example, RowBounds rowBounds);

    List<AcctFundsRecord> selectByExample(AcctFundsRecordCriteria example);

    int updateByExampleSelective(@Param("record") AcctFundsRecord record, @Param("example") AcctFundsRecordCriteria example);

    int updateByExample(@Param("record") AcctFundsRecord record, @Param("example") AcctFundsRecordCriteria example);
}