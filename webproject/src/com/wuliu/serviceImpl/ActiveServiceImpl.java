package com.wuliu.serviceImpl;

import java.util.List;

import com.wuliu.dao.ActiveDao;
import com.wuliu.daoImpl.ActiveDaoImpl;
import com.wuliu.daoImpl.Page;
import com.wuliu.models.Active;
import com.wuliu.service.ActiveService;

public class ActiveServiceImpl implements ActiveService {
	private ActiveDao ad=new ActiveDaoImpl();
	@Override
	public List<Active> fingAllActive() {
		// TODO Auto-generated method stub
		
		
		return ad.findAllActive();
	}

	@Override
	public Page fingAllActive(int currentNum,int pagesize) {
		// TODO Auto-generated method stub
		Page page=new Page(currentNum,pagesize);
		List rs=ad.findAllActive(page.getStartIndex(),page.getPagesize());
		page.setList(rs);
		page.setTotal(ad.findAllActive().size());
		return page;
	}

	@Override
	public Active fingActiveById(int id) {
		// TODO Auto-generated method stub
		return ad.findActiveById(id);
	}

	@Override
	public boolean delActiveById(int id) {
		// TODO Auto-generated method stub
		return ad.delActiveById(id);
	}

}
