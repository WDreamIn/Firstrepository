package com.biz;

import com.bean.Users;
import com.dao.UserDao;

public class UserBiz {

	// ����һ���û�
	public boolean addUser(Users users){
		//����dao���������
		UserDao userDao = new UserDao();
		return userDao.addUser(users);
	}
	 // ��ѯ�û���
	public boolean findUser(Users users){
		//����dao���Ƿ����
		UserDao userDao = new UserDao();
		return userDao.findUser(users);
	}
}
