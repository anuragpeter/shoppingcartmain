package com.niit.database.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.database.dao.ProductDAO;
import com.niit.database.model.Product;
@Service("productService")
public class ProductServiceImpl implements ProductService{
	private ProductDAO productDAO;
	
	public void setProductDAO(ProductDAO productDAO){
		this.productDAO=productDAO;
	}
	
	@Transactional
	public void addProduct(Product P){
		System.out.println("service");
		productDAO.addProduct(P);
	}



	
	}

	
	



