package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Users;
import com.db.DButils;

public class UserDao {
	
	//��ѯ�û�
	public boolean findUser(Users users){
		//��ȡ���ݿ����ӣ��������ݲ���
			Connection con =DButils.getcon();
			String sql="select * from users where user_name =? and user_pass =?";
			try {
				PreparedStatement pstm=con.prepareStatement(sql);
				pstm.setString(1, users.getUser_name());
				pstm.setString(2, users.getUser_pass());
				ResultSet rs=pstm.executeQuery();
				if(rs.next()){
					return true;
				}else{
					return false;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}

	// ����һ���û�
		public boolean addUser(Users users){
		//��ȡ���ݿ����ӣ��������ݲ���
			Connection con =DButils.getcon();
			String sql="insert into users(user_name,user_pass,user_tel,user_address) value(?,?,?,?)";
			try {
				PreparedStatement pstm=con.prepareStatement(sql);
				pstm.setString(1, users.getUser_name());
				pstm.setString(2, users.getUser_pass());
				pstm.setString(3, users.getUser_tel());
				pstm.setString(4, users.getUser_address());
				pstm.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
}
