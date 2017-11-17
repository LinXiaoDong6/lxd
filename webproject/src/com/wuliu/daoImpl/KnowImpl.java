package com.wuliu.daoImpl;

import java.util.List;

import com.wuliu.dao.KnowDao;
import com.wuliu.models.Active;
import com.wuliu.models.Knowledge;
import com.wuliu.tools.BeanHandler;
import com.wuliu.tools.BeanListHandler;
import com.wuliu.tools.DBAssist;

public class KnowImpl implements KnowDao {
	@Override
	public List<Knowledge> findKnow() {
		// TODO Auto-generated method stub
		String sql="select * from knowledge";
		List<Knowledge> list=(List<Knowledge>) ass.query(sql,new BeanListHandler(Knowledge.class));

		return list;
	}
	private DBAssist ass=new DBAssist();
	@Override
	public List<Knowledge> findKnow(int start, int count) {
		// TODO Auto-generated method stub
		String sql="select id,title,content,issueDate,reside from knowledge limit ?,?";
		List<Knowledge> list=(List<Knowledge>) ass.query(sql,new BeanListHandler(Knowledge.class), start,count);
		
		
		return list;
	}
	@Override
	public Knowledge findKnowById(int id) {
		// TODO Auto-generated method stub
		String sql="select id,title,content,issueDate,reside from knowledge where id=?";
		Knowledge act=(Knowledge) ass.query(sql, new BeanHandler(Knowledge.class), id);
		return act;
	}
	@Override
	public boolean delKnowById(int id) {
		// TODO Auto-generated method stub
		String sql="delete from knowledge where id=?";
		boolean b=ass.update(sql, id);
		return b;
	}



}
