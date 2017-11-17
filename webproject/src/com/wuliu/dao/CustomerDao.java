package com.wuliu.dao;

import java.util.List;

import com.wuliu.models.Customer;

public interface CustomerDao {
	public boolean addCustomer(String name, String password, String phone, String email,String sex,String question,String result,String issueDate);
	public Customer findCustomer(String name);
}
