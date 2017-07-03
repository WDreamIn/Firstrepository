package com.biz;

import java.util.List;

import com.bean.Goods;
import com.dao.GoodsDao;

//goods��ص�ҵ����
public class GoodsBiz {
//getAllGoods
	public List<Goods> getAllGoods(){
		GoodsDao goodsDao = new GoodsDao();
		return goodsDao.getAllGoods();
	}
	public Goods findGoods(int goods_id){
		GoodsDao goodsDao = new GoodsDao();
		return goodsDao.findGoods(goods_id);
	}
	public boolean addGoods(Goods goods){
		GoodsDao goodsDao = new GoodsDao();
		return goodsDao.addGoods(goods);
	}
	public boolean delGoods(int goods_id){
		GoodsDao goodsDao = new GoodsDao();
		return goodsDao.delGoods(goods_id);
	}
}
