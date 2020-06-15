package com.website.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.website.Model.CustomerOrder;


@Repository
public interface OrderDao extends JpaRepository<CustomerOrder,String> {

	public List<CustomerOrder> getOrderDetails(String CustomerName);
}
