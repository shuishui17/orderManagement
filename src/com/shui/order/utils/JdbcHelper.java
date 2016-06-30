package com.shui.order.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcHelper {
	public static Connection getConnection() throws Exception{
		//获取连接
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ddgl",
				"root",
				"123"
				);
		return conn;
	}
	
	public static void closeJdbc(Connection conn) throws Exception{
		//关闭连接
		if(conn != null){
			conn.close();
		}
	}
}
