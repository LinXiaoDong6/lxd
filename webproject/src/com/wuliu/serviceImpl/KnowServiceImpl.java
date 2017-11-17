package com.wuliu.serviceImpl;

import java.util.List;

import com.wuliu.dao.KnowDao;
import com.wuliu.daoImpl.KnowImpl;
import com.wuliu.daoImpl.Page;
import com.wuliu.models.Knowledge;
import com.wuliu.service.KnowService;

public class KnowServiceImpl implements KnowService {
	private KnowDao kd= new KnowImpl();
	@Override
	public Page findKnow(int currPagenum, int pagesize) {
		// TODO Auto-generated method stub
		Page page=new Page(currPagenum, pagesize);
		List rs=kd.findKnow(page.getStartIndex(), page.getPagesize());
		page.setList(rs);
		page.setTotal(kd.findKnow().size());
		return page;
	}

	@Override
	public List<Knowledge> findKnow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Knowledge findKnowById(int id) {
		// TODO Auto-generated method stub
		return kd.findKnowById(id);
	}

	@Override
	public boolean delKnowById(int id) {
		// TODO Auto-generated method stub
		return kd.delKnowById(id);
	}

}
