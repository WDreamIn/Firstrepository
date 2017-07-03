package com.bean;

import java.util.List;
import java.util.*;
public class Orders {
	private String orders_id;
	private int orders_user;
	private String orders_address;
	private int orders_tel;
	private String orders_status;
	private String orders_consignee;
	private List<Map<String,Object>> listmap;
	
	public List<Map<String, Object>> getListmap() {
		return listmap;
	}
	public void setListmap(List<Map<String, Object>> listmap) {
		this.listmap = listmap;
	}
	public String getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(String orders_id) {
		this.orders_id = orders_id;
	}
	public int getOrders_user() {
		return orders_user;
	}
	public void setOrders_user(int orders_user) {
		this.orders_user = orders_user;
	}
	public String getOrders_address() {
		return orders_address;
	}
	public void setOrders_address(String orders_address) {
		this.orders_address = orders_address;
	}
	public int getOrders_tel() {
		return orders_tel;
	}
	public void setOrders_tel(int orders_tel) {
		this.orders_tel = orders_tel;
	}
	public String getOrders_status() {
		return orders_status;
	}
	public void setOrders_status(String orders_status) {
		this.orders_status = orders_status;
	}
	public String getOrders_consignee() {
		return orders_consignee;
	}
	public void setOrders_consignee(String orders_consignee) {
		this.orders_consignee = orders_consignee;
	}
	
}
