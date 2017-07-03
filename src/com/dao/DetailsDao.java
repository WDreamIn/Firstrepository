package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Details;
import com.db.DButils;

public class DetailsDao {
          public boolean addDetails(Details details){
        	  Connection con =DButils.getcon();
      		String sql="insert into details(details_order,details_goods,details_price,details_num)values(?,?,?,?)";
      		try {
      			PreparedStatement pstm=con.prepareStatement(sql);
      			pstm.setString(1, details.getDetails_order());
      			pstm.setInt(2, details.getDetails_goods());
      			pstm.setInt(3, details.getDetails_price());
      			pstm.setInt(4, details.getDetails_num());
      	
      			int a = pstm.executeUpdate();
      			if(a>0){
      				return true;
      			}
      		} catch (SQLException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
      		}
      		return false;
      		
      	}  
          
}
