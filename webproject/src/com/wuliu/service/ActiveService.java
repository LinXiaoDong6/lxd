package com.wuliu.service;

import java.util.List;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Active;

public interface ActiveService {
	public List<Active> fingAllActive();
	public Page fingAllActive(int currentNum,int pagesize);
	public Active fingActiveById(int id);
	public boolean delActiveById(int id);
	
}
