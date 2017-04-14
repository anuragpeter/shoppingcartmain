package com.niit.database.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.database.dao.UserDAO;
import com.niit.database.model.User;

@Service
public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	
	@Transactional
	public void addUser(User u){
		System.out.println("service");
		userDAO.addUser(u);
	}



	
	}

	
	



