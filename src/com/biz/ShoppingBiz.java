
package com.biz;

import java.util.List;

import com.bean.Shopping;
import com.dao.ShoppingDao;

//与shopping相关的业务处理
public class ShoppingBiz {
	public boolean addShopping(Shopping shopping){
		//调用dao层
		ShoppingDao shoppingDao = new ShoppingDao();
		return shoppingDao.addShopping(shopping);
	}
	public List showShopping(){
		//调用dao层
		ShoppingDao shoppingDao = new ShoppingDao();
		return shoppingDao.showShopping();
	}

}
