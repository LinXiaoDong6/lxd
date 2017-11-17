package com.wuliu.daoImpl;

import java.util.List;

import com.wuliu.dao.CustomerDao;
import com.wuliu.models.Customer;
import com.wuliu.tools.BeanHandler;
import com.wuliu.tools.BeanListHandler;
import com.wuliu.tools.DBAssist;

public class CustomerDaoImpl implements CustomerDao {
	private DBAssist ass=new DBAssist();
	
	
	@Override
	public boolean addCustomer(String name, String password, String phone, String email,String sex,String question,String result,String issueDate) {
		// TODO Auto-generated method stub
		String sql="insert into customer(name,password,email,sex,phone,question,result,issueDate) values(?,?,?,?,?,?,?,?)";
		boolean err=ass.update(sql, name,password,email,sex,phone,question,result,issueDate);
		return err;
	}

	@Override
	public Customer findCustomer(String name) {
		// TODO Auto-generated method stub
		String sql="select name,password from customer where name=?";
		List list=(List) ass.query(sql,new BeanListHandler(Customer.class),name);	
		if(list.size()!=0){
			return (Customer) list.get(0);
		}
		//Manager mana=(Manager) ass.query(sql, new BeanHandler(Manager.class), name);		else{
		else{
			return null;
		}
		}
	

}
