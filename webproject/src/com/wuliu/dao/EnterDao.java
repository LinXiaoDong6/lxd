package com.wuliu.dao;

import java.util.List;

import com.wuliu.models.Enterprise;

public interface EnterDao {
	public List<Enterprise> findEnter();
	public List<Enterprise> findEnter(int start,int count);
	public Enterprise findEnterById(int id);
	public boolean delEnterById(int id);
}
