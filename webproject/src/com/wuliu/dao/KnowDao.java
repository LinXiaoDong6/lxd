package com.wuliu.dao;

import java.util.List;

import com.wuliu.models.Knowledge;

public interface KnowDao {
	public List<Knowledge> findKnow();
	public List<Knowledge> findKnow(int start,int count);
	public Knowledge findKnowById(int id);
	public boolean delKnowById(int id);
 }
