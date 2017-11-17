package com.wuliu.serviceImpl;

import java.util.List;

import com.wuliu.dao.CustomerDao;
import com.wuliu.daoImpl.CustomerDaoImpl;
import com.wuliu.models.Customer;
import com.wuliu.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao md=new CustomerDaoImpl();
	@Override
	public Customer findCustomer(String name) {
		// TODO Auto-generated method stub
		
		return (Customer) md.findCustomer(name);
	}

	@Override
	public boolean addCustomer(String name, String password, String phone, String email,String sex,String question,String result,String issueDate) {
		// TODO Auto-generated method stub
		return md.addCustomer(name,password,email,sex,phone,question,result,issueDate);
		
	}

}
