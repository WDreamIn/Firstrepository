package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Users;
import com.biz.UserBiz;

@WebServlet(name="RegisterServ",urlPatterns={"/RegisterServ"})
public class RegisterServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String user_name = req.getParameter("user_name");
		String user_pass = req.getParameter("user_pass");
		String user_tel = req.getParameter("user_tel");
		String user_address = req.getParameter("user_address");
		
		Users users=new Users();
		
		users.setUser_name(user_name);
		users.setUser_pass(user_pass);
		users.setUser_tel(user_tel);
		users.setUser_address(user_address);
		
		UserBiz userBiz=new UserBiz();
		boolean b=userBiz.addUser(users);
		if(b){
			resp.sendRedirect("login.jsp");
		}else{
			resp.sendRedirect("register.jsp");
		}
		
		
	}
}