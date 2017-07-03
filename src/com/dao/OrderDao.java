package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bean.Orders;

import com.db.DButils;

public class OrderDao {
	public boolean addOrder(Orders orders){
		//保存一个订单order表
		//保存一个details表
		Connection con =DButils.getcon();
		String sql="insert into orders(orders_id,orders_address,orders_tel,orders_status,orders_consignee)values(?,?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1, orders.getOrders_id());
			pstm.setString(2, orders.getOrders_address());
			pstm.setInt(3, orders.getOrders_tel());
			pstm.setString(4, orders.getOrders_status());
			pstm.setString(5, orders.getOrders_consignee());
			int a = pstm.executeUpdate();
			return a>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public List<Orders> showOrderList(){
		Connection con =DButils.getcon();
		String sql="select orders_id,orders_address,orders_tel,orders_status,orders_consignee from orders";
		try {
			List<Orders> list = new ArrayList<Orders>();
			PreparedStatement pstm=con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				String orders_id=rs.getString("orders_id");
				String orders_address=rs.getString("orders_address");
				int orders_tel=rs.getInt("orders_tel");
				String orders_status=rs.getString("orders_status");
				String orders_consignee=rs.getString("orders_consignee");
				Orders orders = new Orders();
				orders.setOrders_id(orders_id);
				orders.setOrders_address(orders_address);
				orders.setOrders_tel(orders_tel);
				orders.setOrders_status(orders_status);
				orders.setOrders_consignee(orders_consignee);
				
				List<Map<String,Object>> listmap = new ArrayList <Map<String,Object>>();
				String sql2="select details_id,details_order,details_price,details_goods,details_num,goods_name,goods_img from details,goods where details.details_goods=goods.goods_id and details_order=?";
				
				PreparedStatement pstm2=con.prepareStatement(sql2);
				pstm2.setString(1, orders_id);
				ResultSet rs2=pstm2.executeQuery();
				while(rs2.next()){
					Map<String,Object> map = new HashMap<String,Object>();
					int details_id=rs2.getInt("details_id");
					String details_order=rs2.getString("details_order");
					int details_goods=rs2.getInt("details_goods");
					int details_price=rs2.getInt("details_price");
					int details_num=rs2.getInt("details_num");
					String goods_name=rs2.getString("goods_name");
					String goods_img=rs2.getString("goods_img");
					
					map.put("details_id", details_id);
					map.put("details_order", details_order);
					map.put("details_goods", details_goods);
					map.put("details_price", details_price);
					map.put("details_num", details_num);
					map.put("goods_name", goods_name);
					map.put("goods_img", goods_img);
					
					listmap.add(map);
				}
				orders.setListmap(listmap);
				list.add(orders);
				//获取订单对应的多个明细对象
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<Orders> showOrderListDFH(){
		Connection con =DButils.getcon();
		String sql="select orders_id,orders_address,orders_tel,orders_status,orders_consignee from orders where orders_status='已支付|待发货'";
		try {
			List<Orders> list = new ArrayList<Orders>();
			PreparedStatement pstm=con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				String orders_id=rs.getString("orders_id");
				String orders_address=rs.getString("orders_address");
				int orders_tel=rs.getInt("orders_tel");
				String orders_status=rs.getString("orders_status");
				String orders_consignee=rs.getString("orders_consignee");
				Orders orders = new Orders();
				orders.setOrders_id(orders_id);
				orders.setOrders_address(orders_address);
				orders.setOrders_tel(orders_tel);
				orders.setOrders_status(orders_status);
				orders.setOrders_consignee(orders_consignee);
				
				List<Map<String,Object>> listmap = new ArrayList <Map<String,Object>>();
				String sql2="select details_id,details_order,details_price,details_goods,details_num,goods_name,goods_img from details,goods where details.details_goods=goods.goods_id and details_order=?";
				
				PreparedStatement pstm2=con.prepareStatement(sql2);
				pstm2.setString(1, orders_id);
				ResultSet rs2=pstm2.executeQuery();
				while(rs2.next()){
					Map<String,Object> map = new HashMap<String,Object>();
					int details_id=rs2.getInt("details_id");
					String details_order=rs2.getString("details_order");
					int details_goods=rs2.getInt("details_goods");
					int details_price=rs2.getInt("details_price");
					int details_num=rs2.getInt("details_num");
					String goods_name=rs2.getString("goods_name");
					String goods_img=rs2.getString("goods_img");
					
					map.put("details_id", details_id);
					map.put("details_order", details_order);
					map.put("details_goods", details_goods);
					map.put("details_price", details_price);
					map.put("details_num", details_num);
					map.put("goods_name", goods_name);
					map.put("goods_img", goods_img);
					
					listmap.add(map);
				}
				orders.setListmap(listmap);
				list.add(orders);
				//获取订单对应的多个明细对象
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<Orders> showOrderListYFH(){
		Connection con =DButils.getcon();
		String sql="select orders_id,orders_address,orders_tel,orders_status,orders_consignee from orders where orders_status='已发货'";
		try {
			List<Orders> list = new ArrayList<Orders>();
			PreparedStatement pstm=con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				String orders_id=rs.getString("orders_id");
				String orders_address=rs.getString("orders_address");
				int orders_tel=rs.getInt("orders_tel");
				String orders_status=rs.getString("orders_status");
				String orders_consignee=rs.getString("orders_consignee");
				Orders orders = new Orders();
				orders.setOrders_id(orders_id);
				orders.setOrders_address(orders_address);
				orders.setOrders_tel(orders_tel);
				orders.setOrders_status(orders_status);
				orders.setOrders_consignee(orders_consignee);
				
				List<Map<String,Object>> listmap = new ArrayList <Map<String,Object>>();
				String sql2="select details_id,details_order,details_price,details_goods,details_num,goods_name,goods_img from details,goods where details.details_goods=goods.goods_id and details_order=?";
				
				PreparedStatement pstm2=con.prepareStatement(sql2);
				pstm2.setString(1, orders_id);
				ResultSet rs2=pstm2.executeQuery();
				while(rs2.next()){
					Map<String,Object> map = new HashMap<String,Object>();
					int details_id=rs2.getInt("details_id");
					String details_order=rs2.getString("details_order");
					int details_goods=rs2.getInt("details_goods");
					int details_price=rs2.getInt("details_price");
					int details_num=rs2.getInt("details_num");
					String goods_name=rs2.getString("goods_name");
					String goods_img=rs2.getString("goods_img");
					
					map.put("details_id", details_id);
					map.put("details_order", details_order);
					map.put("details_goods", details_goods);
					map.put("details_price", details_price);
					map.put("details_num", details_num);
					map.put("goods_name", goods_name);
					map.put("goods_img", goods_img);
					
					listmap.add(map);
				}
				orders.setListmap(listmap);
				list.add(orders);
				//获取订单对应的多个明细对象
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
