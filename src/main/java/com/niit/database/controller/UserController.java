package com.niit.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.database.model.User;
import com.niit.database.service.UserService;

@Controller
public class UserController {
	private UserService userService;
	
	@Autowired(required=true)
	
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	
	@RequestMapping("/signup")
	public ModelAndView addUser()
	{
		ModelAndView mv=new ModelAndView("signup");
		mv.addObject("user",new User());
		return mv;
		
	}
	
	
	@RequestMapping(value="/useradd",method=RequestMethod.POST)
	public  ModelAndView userAdd(@ModelAttribute("user") User u)
	{
		System.out.println("signup");
		ModelAndView mv=new ModelAndView("index");
		userService.addUser(u);
		return mv;
		
	}
	
	
	
	
	
	

}
