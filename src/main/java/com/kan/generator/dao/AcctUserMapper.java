package com.kan.generator.dao;

import com.kan.generator.domain.AcctUser;
import com.kan.generator.domain.AcctUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AcctUserMapper {
    int countByExample(AcctUserCriteria example);

    int deleteByExample(AcctUserCriteria example);

    int deleteByPrimaryKey(String userId);

    int insert(AcctUser record);

    int insertSelective(AcctUser record);

    List<AcctUser> selectByExampleWithRowbounds(AcctUserCriteria example, RowBounds rowBounds);

    List<AcctUser> selectByExample(AcctUserCriteria example);

    AcctUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") AcctUser record, @Param("example") AcctUserCriteria example);

    int updateByExample(@Param("record") AcctUser record, @Param("example") AcctUserCriteria example);

    int updateByPrimaryKeySelective(AcctUser record);

    int updateByPrimaryKey(AcctUser record);
}