package com.kan.base.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseDao<T extends Serializable , ID extends Serializable> {

	int deleteByPrimaryKey(ID id);
	
	int insert(T record);
	
	int insertSelective(T record);
	
	T selectByPrimaryKey(ID id);
	
	int updateByPrimaryKeySelective(T record);
	
	int updateByPrimaryKey(T record);
}
