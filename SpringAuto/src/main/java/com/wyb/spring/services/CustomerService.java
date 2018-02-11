package com.wyb.spring.services;

import com.wyb.spring.dao.CustomerDao;

public class CustomerService {

	CustomerDao customerDao;
	
	public void setCustomerDao (CustomerDao customerDao){
		this.customerDao = customerDao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
