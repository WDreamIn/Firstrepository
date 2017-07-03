package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Shopping;
import com.biz.ShoppingBiz;
//加入购物车serv
@WebServlet(name="AddShopServ",urlPatterns={"/AddShopServ"})
public class AddShopServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Shopping shopping=new Shopping();
		int shopping_num=Integer.valueOf(req.getParameter("shopping_num"));
		int shopping_goods=Integer.valueOf(req.getParameter("shopping_goods"));
		int shopping_price=Integer.valueOf(req.getParameter("shopping_price"));
		shopping.setShopping_goods(shopping_goods);
		shopping.setShopping_price(shopping_price);
		shopping.setShopping_num(shopping_num);
		
		ShoppingBiz shoppingBiz = new ShoppingBiz();
		boolean b =shoppingBiz.addShopping(shopping);
		if (b){
			System.out.println("ok1");
			resp.sendRedirect("addshopok.jsp");
		}else{
			System.out.println("no");
		}

		
	}

}
