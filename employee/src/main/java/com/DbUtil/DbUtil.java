package com.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	static Connection con=null;
	static Statement st=null;
	static ResultSet rs=null;
	
	public  Connection myConnection() {
		String url="jdbc:mysql://localhost:3306/mydb";
		String uname="root";
		String password="Aniket@8421";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection(url, uname, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
