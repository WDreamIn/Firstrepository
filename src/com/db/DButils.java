package com.db;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DButils {
	static DataSource ds;

	static {
		// 1 ��ȡ���ӳص������ļ�
		try {
			InputStream in = new FileInputStream(
					"C:\\Users\\Administrator\\Desktop\\��װ�� ��Ҫɾ\\tomcat\\apache-tomcat-7.0.69\\webapps\\shopping\\WEB-INF\\classes\\dbcp.properties");
			Properties p = new Properties();
			p.load(in);
			// �������ӳ�
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");

	}

	public static Connection getcon() {
		try {
			return ds.getConnection(); // ��ȡһ�����ݿ�����
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
