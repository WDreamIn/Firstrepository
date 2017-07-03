package com.biz;
//

import java.util.List;

import com.bean.Details;
import com.bean.Orders;
import com.dao.DetailsDao;
import com.dao.OrderDao;

public class OrderBiz {
	public boolean addOrder(Orders orders,List<Details> list){
		//����һ������order��
		//����һ��details��
		OrderDao orderDao=new OrderDao();
		 orderDao.addOrder(orders);
		 
		 DetailsDao detailsDao=new DetailsDao();
		 for (Details details : list) {
			detailsDao.addDetails(details);
		}
		return true;
	}
	public List<Orders> showOrderList(){
		//����dao��showOrder
		OrderDao orderDao = new OrderDao();
		return orderDao.showOrderList();
	}
	public List<Orders> showOrderListDFH(){
		//����dao��showOrder
		OrderDao orderDao = new OrderDao();
		return orderDao.showOrderListDFH();
	}
	public List<Orders> showOrderListYFH(){
		//����dao��showOrder
		OrderDao orderDao = new OrderDao();
		return orderDao.showOrderListYFH();
	}


}
