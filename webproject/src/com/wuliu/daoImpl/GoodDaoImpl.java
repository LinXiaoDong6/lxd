package com.wuliu.daoImpl;

import java.util.List;

import com.wuliu.dao.GoodDao;
import com.wuliu.models.Active;
import com.wuliu.models.Goodsmeg;
import com.wuliu.tools.BeanHandler;
import com.wuliu.tools.BeanListHandler;
import com.wuliu.tools.DBAssist;

public class GoodDaoImpl implements GoodDao {
	private DBAssist ass=new DBAssist();
	@Override
	public List<Goodsmeg> findGoods() {
		// TODO Auto-generated method stub
		String sql="select * from goodsmeg";
		List<Goodsmeg> list=(List<Goodsmeg>) ass.query(sql, new BeanListHandler(Goodsmeg.class));
		return list;	
	}

	@Override
	public List<Goodsmeg> findGoods(int start, int count) {
		// TODO Auto-generated method stub
		String sql="select id,goodsStyle,goodsName,goodsNumber,goodsUnit,startOmit,startCity, endOmit,endCity,style,transportTime,phone,link,issueDate,remark,request,userName from goodsmeg limit ?,?";
		List<Goodsmeg> list =(List<Goodsmeg>) ass.query(sql,new BeanListHandler(Goodsmeg.class), start,count);
		return list;
	}

	@Override
	public Goodsmeg findGoodById(int id) {
		// TODO Auto-generated method stub
		String sql="select id,goodsStyle,goodsName,goodsNumber,goodsUnit,startOmit,startCity, endOmit,endCity,style,transportTime,phone,link,issueDate,remark,request,userName from goodsmeg where id=?";
		Goodsmeg act=(Goodsmeg) ass.query(sql, new BeanHandler(Goodsmeg.class), id);
		return act;
	}

	@Override
	public boolean delGoodById(int id) {
		// TODO Auto-generated method stub
		String sql="delete from goodsmeg where id=?";
		boolean b=ass.update(sql, id);
		return b;
	}

	@Override
	public boolean addGood(Goodsmeg gg) {
		// TODO Auto-generated method stub
		String sql="insert into goodsmeg values(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		boolean b= ass.update(sql, gg.getGoodsStyle(),gg.getGoodsName(),gg.getGoodsNumber(),gg.getGoodsUnit(),gg.getStartOmit(),gg.getStartCity(),gg.getEndOmit(),gg.getEndCity(),gg.getStyle(),gg.getTransportTime(),gg.getPhone(),gg.getLink(),gg.getIssueDate(),gg.getRemark(),gg.getRequest(),gg.getUserName());

		return b;
	}

}
