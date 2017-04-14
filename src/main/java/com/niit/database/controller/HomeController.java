package com.niit.database.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController{
	
	@Autowired
	private HttpSession session;
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
		
	
@RequestMapping("/login")
public String login()
{
	return "Login";
}
/*
@RequestMapping("signup")
public String signup()
{
	return "/signup";
}

*/

/*
@RequestMapping("addproduct")
public String addproduct()
{
	return "/addproduct";
}
*/






@RequestMapping("/validate")
public ModelAndView showLoginPage(@RequestParam("uname") String nm,@RequestParam("password") String ps)
{
	ModelAndView mv=new ModelAndView("home");
	if(nm.equals("anurag") && ps.equals("anurag")){  
		
		mv.addObject("successMessage", "Valid Credentials");
		session.setAttribute("loginMessage","Welcome : "+nm);
	}
	else
	{
		mv.addObject("errorMessage", "Invalid Credentials");	
		
	}
	return mv;
	
	
	
}








}
	

