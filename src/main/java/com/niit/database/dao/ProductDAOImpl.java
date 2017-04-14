package com.niit.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.niit.database.model.Product;

@Repository("productDAO")
public class ProductDAOImpl  implements ProductDAO {
	
SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public void addProduct(Product p) {
		System.out.println("dao");
		Session ss=sessionFactory.getCurrentSession();
		ss.persist(p);
		
		// TODO Auto-generated method stub

	}



}


