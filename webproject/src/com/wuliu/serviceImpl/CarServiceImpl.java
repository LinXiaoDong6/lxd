package com.wuliu.serviceImpl;

import java.util.List;

import com.wuliu.dao.CarDao;
import com.wuliu.daoImpl.CarDaoImpl;
import com.wuliu.daoImpl.Page;
import com.wuliu.models.Carmessage;
import com.wuliu.service.CarService;

public class CarServiceImpl implements CarService {
	private CarDao cd=new CarDaoImpl();
	@Override
	public List<Carmessage> findCar() {
		// TODO Auto-generated method stub
		return cd.findCar();
	}

	@Override
	public Page findCar(int currentNum, int pagesize) {
		// TODO Auto-generated method stub
		Page page=new Page(currentNum, pagesize);
		List rs=cd.findCar(page.getStartIndex(), page.getPagesize());
		page.setList(rs);
		page.setTotal(cd.findCar().size());
		
		return page;
	}

	@Override
	public Carmessage findCarById(int id) {
		// TODO Auto-generated method stub
		return cd.findCarById(id);
	}

	@Override
	public boolean delCarById(int id) {
		// TODO Auto-generated method stub
		
		return cd.delCarById(id);
	}

}
