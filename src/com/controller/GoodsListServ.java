package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Goods;
import com.biz.GoodsBiz;

//用来查询所有的商品控制器
@WebServlet(name="GoodsListServ",urlPatterns={"/GoodsListServ"})
public class GoodsListServ extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		//调用GoodsBiz类
		req.setCharacterEncoding("utf-8");
		
		GoodsBiz goodsBiz =new GoodsBiz();
		List<Goods> list=goodsBiz.getAllGoods();
		req.setAttribute("list",list);//在req存储了一个list对象，名为list ，值为list集合
		//转发到jsp页面
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		/*for(Goods goods :list){
			System.out.println(goods.getGoods_id()+"--"+goods.getGoods_name()+"--"+
					goods.getGoods_price()+"--"+goods.getGoods_num()+"--"+goods.getGoods_message()+"--"+
					goods.getGoods_img()+"--"+goods.getGoods_author());
		}*/
	}
	

}
