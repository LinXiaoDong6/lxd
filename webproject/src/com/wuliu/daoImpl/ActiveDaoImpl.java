package com.wuliu.daoImpl;

import java.util.List;

import com.wuliu.dao.ActiveDao;
import com.wuliu.models.Active;
import com.wuliu.tools.BeanHandler;
import com.wuliu.tools.BeanListHandler;
import com.wuliu.tools.DBAssist;

public class ActiveDaoImpl implements ActiveDao {
	private DBAssist ass=new DBAssist();
	@Override
	public List<Active> findAllActive() {
		// TODO Auto-generated method stub
		String sql="select * from active";
		List<Active> list=(List<Active>) ass.query(sql, new BeanListHandler(Active.class));
		return list;
	}

	@Override
	public List<Active> findAllActive(int start, int count) {
		// TODO Auto-generated method stub
		String sql="select id,title,content,author,issueDate from active limit ?,?";
		List<Active> list=(List<Active>) ass.query(sql, new BeanListHandler(Active.class), start,count);
		return list;
	}

	@Override
	public Active findActiveById(int id) {
		// TODO Auto-generated method stub
		String sql="select id,title,content,author,issueDate from active where id=?";
		Active act=(Active) ass.query(sql, new BeanHandler(Active.class), id);
		return act;
	}

	@Override
	public boolean delActiveById(int id) {
		// TODO Auto-generated method stub
	String sql="delete from active where id=?";
	boolean b=ass.update(sql, id);
		return b;
	}

}
