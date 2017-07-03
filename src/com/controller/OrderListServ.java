package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Orders;
import com.biz.OrderBiz;

//获取订单详细的servlet
@WebServlet(name="OrderListServ",urlPatterns={"/OrderListServ"})
public class OrderListServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OrderBiz orderBiz = new OrderBiz();
		List<Orders> list = orderBiz.showOrderList();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("orderlistserv.jsp").forward(req, resp);
	}
}
