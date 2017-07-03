package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Goods;
import com.bean.Shopping;
import com.biz.GoodsBiz;
import com.biz.ShoppingBiz;

@WebServlet(name="ShoppingListServ",urlPatterns={"/ShoppingListServ"})
public class ShoppingListServ extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ShoppingBiz ShoppingBiz=new ShoppingBiz();
		List list =ShoppingBiz.showShopping();
		/*for(Object obj :list){
			Map<String,Object> map=(Map<String,Object>) obj;
			System.out.println(map.get("shopping_id")+"___"+
					map.get("shopping_goods")+"___"+
					map.get("shopping_price")+"___"+
					map.get("shopping_num")+"___"+
					map.get("goods_id")+"___"+
					map.get("goods_name")+"___"+
					map.get("goods_img")+"___"+
					map.get("goods_message")+"___"+
					map.get("goods_author"));
		}*/
		req.setAttribute("list", list);
		req.getRequestDispatcher("shopping.jsp").forward(req,resp);//请求转发到
		
	}

}
