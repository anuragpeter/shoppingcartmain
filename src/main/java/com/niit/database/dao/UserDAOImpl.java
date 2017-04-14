package com.niit.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.database.model.Authorization;
import com.niit.database.model.User;
@Repository
public class UserDAOImpl implements UserDAO {
SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public void addUser(User u) {
		Session session=this.sessionFactory.getCurrentSession();
	    u.setEnabled(true);
		u.setUserid(u.getUsername());
		Authorization auth=new Authorization();
		auth.setRole("ROLE_USER");
		auth.setUid(u.getUserid());
	
		session.persist(u);
	session.persist(auth);
		System.out.println("user register successfully="+u);
	
		// TODO Auto-generated method stub
		
	
	}

}
