package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Users;
import com.biz.UserBiz;

// @author 吴迎辉
@WebServlet(name="LoginServ",urlPatterns={"/LoginServ"})
public class LoginServ extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		//处理登录的serv
		req.setCharacterEncoding("utf-8");
		String user_name= req.getParameter("user_name");
		String user_pass= req.getParameter("user_pass");
		
		Users users=new Users();
		users.setUser_name(user_name);
		users.setUser_pass(user_pass);
		
		
		UserBiz userBiz =new UserBiz();
		boolean b=userBiz.findUser(users);
		if(b){
			//登录成功 跳转首页
			resp.sendRedirect("GoodsListServ");
			System.out.println("ok");
			
		}else{
			resp.sendRedirect("login.jsp");
			System.out.println("no");
		
		}
		
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		doPost(req, resp);
	}

}
