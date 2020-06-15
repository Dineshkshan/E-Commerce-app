package com.website.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Customer_No;
	
	@Column(name="CustomerName")
	private String UserName;
	private String OrderDetails;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getOrderDetails() {
		return OrderDetails;
	}
	public int getCustomer_No() {
		return Customer_No;
	}
	public void setCustomer_No(int customer_No) {
		Customer_No = customer_No;
	}
	public void setOrderDetails(String orderDetails) {
		OrderDetails = orderDetails;
	}
	public CustomerOrder(String userName, String orderDetails) {
		super();
		UserName = userName;
		OrderDetails = orderDetails;
	}
	public CustomerOrder() {
		super();
	}
	public CustomerOrder(String customername) {
	}
	
}
