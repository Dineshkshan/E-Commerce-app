package com.website.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private String CustomerName;
	private String PhoneNumber;
	private String Password;
	private String ConfirmPassword;
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public Customer(String customerName, String phoneNumber, String password, String confirmPassword) {
		super();
		CustomerName = customerName;
		PhoneNumber = phoneNumber;
		Password = password;
		ConfirmPassword = confirmPassword;
	}
	public Customer() {
		super();
	}
    
}
