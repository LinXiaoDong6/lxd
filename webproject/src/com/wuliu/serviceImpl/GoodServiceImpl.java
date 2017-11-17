package com.wuliu.serviceImpl;

import java.util.List;

import com.wuliu.dao.GoodDao;
import com.wuliu.daoImpl.GoodDaoImpl;
import com.wuliu.daoImpl.Page;
import com.wuliu.models.Goodsmeg;
import com.wuliu.service.GoodService;

public class GoodServiceImpl implements GoodService {
	private GoodDao gd=new GoodDaoImpl();
	@Override
	public List<Goodsmeg> findGood() {
		// TODO Auto-generated method stub
		return gd.findGoods();
	}

	@Override
	public Page findGood(int currPagenum, int pagesize) {
		// TODO Auto-generated method stub
		Page page=new Page(currPagenum, pagesize);
		List rs=gd.findGoods(page.getStartIndex(), page.getPagesize());
		page.setList(rs);
		page.setTotal(gd.findGoods().size());
		return page;
	}

	@Override
	public Goodsmeg findGoodById(int id) {
		// TODO Auto-generated method stub
		return gd.findGoodById(id);
	}

	@Override
	public boolean delGoodById(int id) {
		// TODO Auto-generated method stub
		return gd.delGoodById(id);
	}

	@Override
	public boolean addGoodById(Goodsmeg gg) {
		// TODO Auto-generated method stub
		return gd.addGood(gg);
	}

}
