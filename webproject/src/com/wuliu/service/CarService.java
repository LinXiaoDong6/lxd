package com.wuliu.service;

import java.util.List;

import com.wuliu.daoImpl.Page;
import com.wuliu.models.Carmessage;

public interface CarService {
	public List<Carmessage> findCar();
	public Page findCar(int currentNum,int pagesize);
	public Carmessage findCarById(int id);
	public boolean delCarById(int id);
}
