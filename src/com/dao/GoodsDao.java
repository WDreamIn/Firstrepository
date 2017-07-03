package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Goods;
import com.db.DButils;

//dao²Ù×÷
public class GoodsDao {
	public Goods findGoods(int goods_id){
		Connection con =DButils.getcon();
		String sql="select goods_id,goods_name,goods_price,goods_num,goods_img,goods_message,goods_author from goods where goods_id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, goods_id);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()){
				int goods_iid = rs.getInt("goods_id");
				String goods_name=rs.getString("goods_name");
				int goods_price= rs.getInt("goods_price");
				int goods_num=rs.getInt("goods_num");
				String goods_img=rs.getString("goods_img");
				String goods_message=rs.getString("goods_message");
				String goods_author=rs.getString("goods_author");
				Goods goods=new Goods();
				goods.setGoods_id(goods_iid);
				goods.setGoods_name(goods_name);
				goods.setGoods_price(goods_price);
				goods.setGoods_num(goods_num);
				goods.setGoods_img(goods_img);
				goods.setGoods_message(goods_message);
				goods.setGoods_author(goods_author);
				return goods;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//getAllGoods
	public List<Goods> getAllGoods(){
		Connection con =DButils.getcon();
		String sql="select goods_id,goods_name,goods_price,goods_num,goods_img,goods_message,goods_author from goods";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			List<Goods> list=new ArrayList<Goods>();
			while(rs.next()){
				int goods_id = rs.getInt("goods_id");
				String goods_name=rs.getString("goods_name");
				int goods_price= rs.getInt("goods_price");
				int goods_num=rs.getInt("goods_num");
				String goods_img=rs.getString("goods_img");
				String goods_message=rs.getString("goods_message");
				String goods_author=rs.getString("goods_author");
				Goods goods=new Goods();
				goods.setGoods_id(goods_id);
				goods.setGoods_name(goods_name);
				goods.setGoods_price(goods_price);
				goods.setGoods_num(goods_num);
				goods.setGoods_img(goods_img);
				goods.setGoods_message(goods_message);
				goods.setGoods_author(goods_author);
				
				list.add(goods);
				
			}
			return list;
	
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public boolean addGoods(Goods goods){
		Connection con =DButils.getcon();
		String sql="insert into goods(goods_name,goods_price,goods_num,goods_img,goods_message,goods_author) values (?,?,?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1, goods.getGoods_name());
			pstm.setInt(2, goods.getGoods_price());
			pstm.setInt(3, goods.getGoods_num());
			pstm.setString(4, goods.getGoods_img());
			pstm.setString(5, goods.getGoods_message());
			pstm.setString(6, goods.getGoods_author());
		int a =pstm.executeUpdate();
			return a>0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean delGoods(int goods_id){
		Connection con =DButils.getcon();
		String sql="delete from goods where goods_id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, goods_id);
			
		int a =pstm.executeUpdate();
			return a>0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
