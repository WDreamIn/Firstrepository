package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Goods;
import com.bean.Orders;
import com.biz.GoodsBiz;
import com.biz.OrderBiz;

//获取订单详细的servlet
@WebServlet(name="GoodslistDelShowServ",urlPatterns={"/GoodslistDelShowServ"})
public class GoodslistDelShowServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//调用GoodsBiz（getAllGoods方法）
		GoodsBiz goodsBiz= new GoodsBiz();
		

		List<Goods> list = goodsBiz.getAllGoods();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("goodsListdelshowserv.jsp").forward(req, resp);
	}
}
