package com.xworkz.shop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.shop.dto.ShopMergingDTO;
import com.xworkz.shop.service.ShopMergingService;
import com.xworkz.shop.service.ShopMergingServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns ="/merge")
public class ShopMergingServlet extends HttpServlet {
	
	public ShopMergingServlet() {
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String age=req.getParameter("age");
	String city=req.getParameter("city");
	String state=req.getParameter("state");
	String country=req.getParameter("country");
	int convertedAge=Integer.valueOf(age);

	ShopMergingService shopMergingService=new ShopMergingServiceImpl();
	boolean valid=shopMergingService.validateAndSave(new ShopMergingDTO(name, email,convertedAge, city, state, country));
	if(valid)
	{
		System.out.println("Merging is valid");
		req.setAttribute("success", "Merging success");
	}
	else
	{
		System.out.println("Merging is In-valid");
		req.setAttribute("failure", "Merging failure");
		req.setAttribute("dto",new ShopMergingDTO(name, email, convertedAge, city, state, country));

	}
	
	RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Merging.jsp");
	requestDispatcher.forward(req, resp);
	}

}
