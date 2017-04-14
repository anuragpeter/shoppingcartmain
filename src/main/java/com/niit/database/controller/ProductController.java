package com.niit.database.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.database.model.Product;

import com.niit.database.service.ProductService;


@Controller
public class ProductController {
	 static Logger log = Logger.getLogger(ProductController.class.getName());
	private ProductService productService;
	
	@Autowired(required=true)
	public void setProductService(ProductService productService){
		this.productService=productService;
	}
	
	
	@RequestMapping("/addproduct")
	public ModelAndView product()
	{
		ModelAndView mv=new ModelAndView("addproduct");
		mv.addObject("product",new Product());
		return mv;
		
	}
	
	
	
	@RequestMapping(value="/productadd",method=RequestMethod.POST)
	public  ModelAndView productadd(@ModelAttribute("product") Product p,HttpServletRequest request)
	{
		log.debug("product is going to add");
		System.out.println("product");
		ModelAndView mv=new ModelAndView("index");
		productService.addProduct(p);
		MultipartFile img=p.getImage();
		HttpSession ss=request.getSession();
		String serverpath=ss.getServletContext().getRealPath("/resources/images");
		String filename=serverpath+File.separator+p.getPid()+".jpg";
		System.out.println(serverpath);
		System.out.println(filename);
		log.debug(serverpath);
		
		try{
			byte b[]=img.getBytes();
			FileOutputStream fos=new FileOutputStream(filename);
			fos.write(b);
		}catch(FileNotFoundException e){}
		catch(IOException e){}
		return mv;
		
	}
	
	
	
}
