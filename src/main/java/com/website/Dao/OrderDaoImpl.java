package com.website.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.website.Model.CustomerOrder;


@Component
public class OrderDaoImpl {

	@Autowired
	private EntityManager entity;
	@Transactional
	public List<CustomerOrder> getOrderDetails(String CustomerName) {
		Session session=entity.unwrap(Session.class);
		Query query=session.createQuery("from CustomerOrder where CUSTOMER_NAME=?1");
		query.setParameter(1,CustomerName);
		List<CustomerOrder> customer=query.getResultList();
		return customer;
	}
}
