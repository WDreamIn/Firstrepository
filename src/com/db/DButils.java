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
		// 1 获取连接池的配置文件
		try {
			InputStream in = new FileInputStream(
					"C:\\Users\\Administrator\\Desktop\\安装包 不要删\\tomcat\\apache-tomcat-7.0.69\\webapps\\shopping\\WEB-INF\\classes\\dbcp.properties");
			Properties p = new Properties();
			p.load(in);
			// 创建连接池
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");

	}

	public static Connection getcon() {
		try {
			return ds.getConnection(); // 获取一个数据库连接
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
