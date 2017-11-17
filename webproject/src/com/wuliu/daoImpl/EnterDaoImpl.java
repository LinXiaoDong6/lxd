package com.wuliu.daoImpl;

import java.util.List;

import com.wuliu.dao.EnterDao;
import com.wuliu.models.Enterprise;
import com.wuliu.tools.BeanHandler;
import com.wuliu.tools.BeanListHandler;
import com.wuliu.tools.DBAssist;

public class EnterDaoImpl implements EnterDao {
	private DBAssist ass=new DBAssist();
	@Override
	public List<Enterprise> findEnter() {
		// TODO Auto-generated method stub
		String sql="select * from enterprise";
		List<Enterprise> list=(List<Enterprise>) ass.query(sql, new BeanListHandler(Enterprise.class));
		return list;
	}

	@Override
	public List<Enterprise> findEnter(int start, int count) {
		// TODO Auto-generated method stub
		String sql="select enterpriseName,operation,workArea,address,phone,id,enterpriseSort,linkMan,handSet,fax,email,http,intro,issueDate,userName from enterprise limit ?,?";
		List<Enterprise> list=(List<Enterprise>) ass.query(sql, new BeanListHandler(Enterprise.class),start,count);
		return list;
	}

	@Override
	public Enterprise findEnterById(int id) {
		// TODO Auto-generated method stub
		String sql="select enterpriseName,operation,workArea,address,phone,id,enterpriseSort,linkMan,handSet,fax,email,http,intro,issueDate,userName from enterprise where id=?";
		Enterprise act=(Enterprise) ass.query(sql, new BeanHandler(Enterprise.class), id);
		return act;
	}

	@Override
	public boolean delEnterById(int id) {
		// TODO Auto-generated method stub
		String sql="delete from enterprise where id=?";
		boolean b=ass.update(sql, id);
		return b;
	}

}
