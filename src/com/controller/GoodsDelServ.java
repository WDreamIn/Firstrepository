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
@WebServlet(name="GoodsDelServ",urlPatterns={"/GoodsDelServ"})
public class GoodsDelServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int goods_id = Integer.valueOf(req.getParameter("goods_id"));
		GoodsBiz goodsBiz= new GoodsBiz();
		boolean b=goodsBiz.delGoods(goods_id);
		if(b){
			resp.sendRedirect("GoodslistDelShowServ");
		}
	
	}
}
