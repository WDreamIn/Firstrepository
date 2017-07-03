package com.biz;
//

import java.util.List;

import com.bean.Details;
import com.bean.Orders;
import com.dao.DetailsDao;
import com.dao.OrderDao;

public class OrderBiz {
	public boolean addOrder(Orders orders,List<Details> list){
		//保存一个订单order表
		//保存一个details表
		OrderDao orderDao=new OrderDao();
		 orderDao.addOrder(orders);
		 
		 DetailsDao detailsDao=new DetailsDao();
		 for (Details details : list) {
			detailsDao.addDetails(details);
		}
		return true;
	}
	public List<Orders> showOrderList(){
		//调用dao层showOrder
		OrderDao orderDao = new OrderDao();
		return orderDao.showOrderList();
	}
	public List<Orders> showOrderListDFH(){
		//调用dao层showOrder
		OrderDao orderDao = new OrderDao();
		return orderDao.showOrderListDFH();
	}
	public List<Orders> showOrderListYFH(){
		//调用dao层showOrder
		OrderDao orderDao = new OrderDao();
		return orderDao.showOrderListYFH();
	}


}
