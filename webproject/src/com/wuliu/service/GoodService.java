package com.wuliu.service;

import java.util.List;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Goodsmeg;

public interface GoodService {
	public List<Goodsmeg> findGood();
	public Page findGood(int currPagenum,int pagesize);
	public Goodsmeg findGoodById(int id);
	public boolean delGoodById(int id);
	public boolean addGoodById(Goodsmeg gg);
}
