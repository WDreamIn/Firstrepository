
package com.biz;

import java.util.List;

import com.bean.Shopping;
import com.dao.ShoppingDao;

//��shopping��ص�ҵ����
public class ShoppingBiz {
	public boolean addShopping(Shopping shopping){
		//����dao��
		ShoppingDao shoppingDao = new ShoppingDao();
		return shoppingDao.addShopping(shopping);
	}
	public List showShopping(){
		//����dao��
		ShoppingDao shoppingDao = new ShoppingDao();
		return shoppingDao.showShopping();
	}

}
