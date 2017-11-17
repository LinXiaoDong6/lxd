package com.wuliu.serviceImpl;

import java.util.List;

import com.wuliu.dao.EnterDao;
import com.wuliu.daoImpl.EnterDaoImpl;
import com.wuliu.daoImpl.Page;
import com.wuliu.models.Enterprise;
import com.wuliu.service.EnterService;

public class EnterServiceImpl implements EnterService {
	private EnterDao ed=new EnterDaoImpl();
	@Override
	public List<Enterprise> findEnter() {
		// TODO Auto-generated method stub
		return ed.findEnter();
	}

	@Override
	public Page findEnter(int currPagenum, int pagesize) {
		// TODO Auto-generated method stub
		Page page =new Page(currPagenum, pagesize);
		List rs=ed.findEnter(page.getStartIndex(), page.getPagesize());
		page.setList(rs);
		page.setTotal(ed.findEnter().size());
		return page;
	}

	@Override
	public Enterprise findEnterById(int id) {
		// TODO Auto-generated method stub
		return ed.findEnterById(id);
	}

	@Override
	public boolean delEnterById(int id) {
		// TODO Auto-generated method stub
		
		return ed.delEnterById(id);
	}

}
