package com.wuliu.dao;

import java.util.List;

import com.wuliu.models.Active;

public interface ActiveDao {
	public List<Active> findAllActive();
	public List<Active> findAllActive(int start,int count);
	public Active findActiveById(int id);
	public boolean delActiveById(int id);
}
