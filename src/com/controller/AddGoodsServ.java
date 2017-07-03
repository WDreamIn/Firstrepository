package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bean.Goods;
import com.bean.Orders;
import com.biz.GoodsBiz;
import com.biz.OrderBiz;

//增加商品对象的servlet，
@WebServlet(name="AddGoodsServ",urlPatterns={"/AddGoodsServ"})
@MultipartConfig   //上传文件注解
public class AddGoodsServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String goods_name=req.getParameter("goods_name");
		String goods_price=req.getParameter("goods_price");
		String goods_num=req.getParameter("goods_num");
		String goods_message=req.getParameter("goods_message");
		String goods_author=req.getParameter("goods_author");
		String goods_img="img/goods"+System.currentTimeMillis()+".jpg";
		
		Goods goods=new Goods();
		goods.setGoods_name(goods_name);
		goods.setGoods_price(Integer.valueOf(goods_price));
		goods.setGoods_num(Integer.valueOf(goods_num));
		goods.setGoods_message(goods_message);
		goods.setGoods_author(goods_author);
		goods.setGoods_img(goods_img);
		
		GoodsBiz goodsBiz = new GoodsBiz();
		boolean boo =goodsBiz.addGoods(goods);
		if(boo){
		Part part=req.getPart("goods_img");
		InputStream in =part.getInputStream();
		String imgpath="C:\\Users\\Administrator\\Desktop\\安装包 不要删\\tomcat\\apache-tomcat-7.0.69\\webapps\\shopping\\"+goods_img;
		OutputStream out = new FileOutputStream(imgpath);
		
		byte [] b=new byte[1024];
		int len=0;
		while((len=in.read(b))!=-1){
			out.write(b, 0, len);
		}
		out.flush();
		out.close();
		in.close();
		//System.out.println(goods_name+"--"+goods_price);
	
		//req.setAttribute("list", list);
		//req.getRequestDispatcher("orderlistservyfh.jsp").forward(req, resp);
	}
		resp.sendRedirect("ok.jsp");
	
		}
}
