package com.website.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.Dao.CustomerDao;
import com.website.Model.Customer;

@Service
public class ServiceClass {
	
	@Autowired
	private CustomerDao customer;
	public void saveCustomers(Customer cust)
	{
		System.out.println(cust.getCustomerName());
		customer.save(cust);
	}
	
	public Customer getCustomerByID(String CustomerName)
	{
		return customer.getOne(CustomerName);
	}
}
