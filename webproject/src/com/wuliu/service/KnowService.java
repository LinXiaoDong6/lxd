package com.wuliu.service;

import java.util.List;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Knowledge;

public interface KnowService {
	public Page findKnow(int currPagenum,int pagesize);
	public List<Knowledge> findKnow();
	public Knowledge findKnowById(int id);
	public boolean delKnowById(int id);
}
