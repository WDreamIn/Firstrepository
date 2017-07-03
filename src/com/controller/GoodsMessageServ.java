package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Goods;
import com.biz.GoodsBiz;

@WebServlet(name="GoodsMessageServ",urlPatterns={"/GoodsMessageServ"})
public class GoodsMessageServ extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		// 擦寻一个对象
		int goods_id=Integer.valueOf(req.getParameter("goods_id"));
		GoodsBiz goodsBiz=new GoodsBiz();
		Goods goods=goodsBiz.findGoods(goods_id);
		req.setAttribute("goods", goods);
		req.getRequestDispatcher("goodsmessage.jsp").forward(req,resp);
		/*System.out.println(goods.getGoods_id()+"--"+goods.getGoods_name()
		+"--"+goods.getGoods_img());*/
		
	}

}
