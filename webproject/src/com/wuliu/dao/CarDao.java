package com.wuliu.dao;

import java.util.List;

import com.wuliu.models.Carmessage;

public interface CarDao {
	public List<Carmessage> findCar();
	public List<Carmessage> findCar(int start,int count);
	public Carmessage findCarById(int id);
	public boolean delCarById(int id);
}
