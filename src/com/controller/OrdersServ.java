package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Details;
import com.bean.Orders;
import com.biz.OrderBiz;

@WebServlet(name="OrdersServ",urlPatterns={"/OrdersServ"})
public class OrdersServ extends HttpServlet{
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
          doPost(req, resp);
	}
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 req.setCharacterEncoding("utf-8");
		 String orders_address=req.getParameter("orders_address");
		 String orders_tel=req.getParameter("orders_tel");
		 String orders_consignee=req.getParameter("orders_consignee");
		 String orders_id=UUID.randomUUID().toString();
		
		 
		 Orders orders=new Orders();
		 orders.setOrders_address(orders_address);
		 orders.setOrders_consignee(orders_consignee);
		 orders.setOrders_tel(Integer.valueOf(orders_tel));
		 orders.setOrders_id(orders_id);
		 orders.setOrders_status("待支付");
		 List<Details> list=new ArrayList<Details>();
		 //订单明细
		 String[] details_goods=req.getParameterValues("details_goods");
		 for(String sv :details_goods){
			 String details_price=req.getParameter("details_price"+sv);
			 
			 String details_num=req.getParameter("details_num"+sv);
			 
			 Details details=new Details();
			 details.setDetails_goods(Integer.valueOf(sv));
			 details.setDetails_num(Integer.valueOf(details_num));
			 details.setDetails_price(Integer.valueOf(details_price));
			 details.setDetails_order(orders_id);
			 list.add(details);
			 // System.out.println(sv+"__"+details_price+"__"+details_num);
		 }
		
		 OrderBiz orderBiz=new OrderBiz();
		boolean b = orderBiz.addOrder(orders, list);
		req.setAttribute("orders_id", orders_id);
		 if(b){
			 //订单生成，跳转到支付页面
			 req.getRequestDispatcher("indexzhifu.jsp").forward(req, resp);
		 }
      //System.out.println(orders_address+"___"+orders_user+orders_tel);
	}
	

}
