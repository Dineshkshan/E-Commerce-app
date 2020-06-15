package com.website.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.Model.Customer;

public interface CustomerDao extends JpaRepository<Customer,String> {

}
