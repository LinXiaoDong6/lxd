package com.wuliu.daoImpl;

import java.util.List;

import com.wuliu.dao.CarDao;
import com.wuliu.models.Carmessage;
import com.wuliu.tools.BeanHandler;
import com.wuliu.tools.BeanListHandler;
import com.wuliu.tools.DBAssist;

public class CarDaoImpl implements CarDao {
	private DBAssist ass=new DBAssist();
	@Override
	public List<Carmessage> findCar() {
		// TODO Auto-generated method stub
		String sql="select * from carmessage";
		List<Carmessage> list=(List<Carmessage>) ass.query(sql, new BeanListHandler(Carmessage.class));
		
		return list;
	}

	@Override
	public List<Carmessage> findCar(int start, int count) {
		// TODO Auto-generated method stub
		String sql="select id,code,tradeMark,brand,style,remark,issueDate,carLoad,transpotStyle,usedTime,driverName,driverTime,licenceNumber,licenceStyle,linkMan,linkPhone,userName from carmessage limit ?,?";
		List<Carmessage> list=(List<Carmessage>) ass.query(sql, new BeanListHandler(Carmessage.class), start,count);
		return list;
	}

	@Override
	public Carmessage findCarById(int id) {
		// TODO Auto-generated method stub
		String sql="select id,code,tradeMark,brand,style,remark,issueDate,carLoad,transpotStyle,usedTime,driverName,driverTime,licenceNumber,licenceStyle,linkMan,linkPhone,userName from carmessage where id=?";
		Carmessage act=(Carmessage) ass.query(sql, new BeanHandler(Carmessage.class), id);
		return act;
	}

	@Override
	public boolean delCarById(int id) {
		// TODO Auto-generated method stub
		String sql="delete from carmessage where id=?";
		boolean b=ass.update(sql, id);
		
		return b;
	}

}
