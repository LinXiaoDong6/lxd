package com.wuliu.service;

import java.util.List;

import com.wuliu.models.Customer;

public interface CustomerService {
	public Customer findCustomer(String name);
	public boolean addCustomer(String name, String password, String phone, String email,String sex,String question,String result,String issueDate);
}
