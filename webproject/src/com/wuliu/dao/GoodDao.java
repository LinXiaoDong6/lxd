package com.wuliu.dao;

import java.util.List;

import com.wuliu.models.Goodsmeg;

public interface GoodDao {
	public List<Goodsmeg> findGoods();
	public List<Goodsmeg> findGoods(int start,int count);
	public Goodsmeg findGoodById(int id);
	public boolean delGoodById(int id);
	public boolean addGood(Goodsmeg gg);
}
