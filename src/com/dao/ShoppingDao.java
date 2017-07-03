package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bean.Shopping;
import com.db.DButils;

//与shopping的dao处理类
public class ShoppingDao {
	public List showShopping(){
		Connection con =DButils.getcon();
		String sql="select Shopping_id,Shopping_goods,Shopping_price,Shopping_num,goods_id,goods_name,goods_img,goods_message,goods_author from shopping,goods where shopping.shopping_goods=goods.goods_id"; 
		
		try {
			List list= new ArrayList();
			PreparedStatement pstm;
			pstm = con.prepareStatement(sql);
			// 执行操作
			ResultSet rs = pstm.executeQuery();// 返回一个结果集对象
			while(rs.next()){
				int shopping_id=rs.getInt("shopping_id");
				int shopping_goods=rs.getInt("shopping_goods");
				int shopping_price=rs.getInt("shopping_price");
				int shopping_num=rs.getInt("shopping_num");
				int goods_id=rs.getInt("goods_id");
				String goods_name=rs.getString("goods_name");
				String goods_img=rs.getString("goods_img");
				String goods_message=rs.getString("goods_message");
				String goods_author=rs.getString("goods_author");
				
				Map<String, Object> maprow = new HashMap<String,Object>();
				
				maprow.put("shopping_id",shopping_id);
				maprow.put("shopping_goods",shopping_goods);
				maprow.put("shopping_price",shopping_price);
				maprow.put("shopping_num",shopping_num);
				maprow.put("goods_id",goods_id);
				maprow.put("goods_name", goods_name);
				maprow.put("goods_img", goods_img);
				maprow.put("goods_message", goods_message);
				maprow.put("goods_author", goods_author);
				
				list.add(maprow);
			
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	public boolean addShopping(Shopping shopping){
		//获取数据库连接，进行数据操作
		Connection con =DButils.getcon();
		String sql="insert into shopping(shopping_goods,shopping_price,shopping_num) value(?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, shopping.getShopping_goods());
			pstm.setInt(2, shopping.getShopping_price());
			pstm.setInt(3, shopping.getShopping_num());
			
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
