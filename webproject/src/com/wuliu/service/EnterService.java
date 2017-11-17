package com.wuliu.service;

import java.util.List;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Enterprise;

public interface EnterService {
	public  List<Enterprise> findEnter();
	public Page findEnter(int currPagenum,int pagesize);
	public Enterprise findEnterById(int id);
	public boolean delEnterById(int id);
}
