package com.website.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.Dao.OrderDao;
import com.website.Model.CustomerOrder;

@Service
public class OrderService {

	@Autowired
	private OrderDao order;
	
	public void saveorders(CustomerOrder cust)
	{
		order.save(cust);
	}
	
	public List<CustomerOrder> getOrdersByName(String name)
	{
		return  order.getOrderDetails(name);
	}
}
