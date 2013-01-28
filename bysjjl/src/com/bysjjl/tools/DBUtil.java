package com.bysjjl.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	private static DBUtil dbUtil = new DBUtil();
	private static Connection conn = null;
	private final static String FILEPATH = "src/jdbc.properties";
	public static DBUtil getInstance(){
		return dbUtil;
	}

	// 读取配置文件
	private static String[] getConifg() {
		String[] config = new String[4];
		InputStream ins = null;
		// 加载配置文件文件
		try {
			ins = new FileInputStream(FILEPATH);
			Properties property = new Properties();
			property.load(ins);
			config[0] = property.getProperty("jdbc.driverClassName");
			config[1] = property.getProperty("jdbc.url");
			config[2] = property.getProperty("jdbc.user");
			config[3] = property.getProperty("jdbc.password");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				ins.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return config;
	}
	 
	// 获得连接
	public static Connection getConnection(){
		String[]config = getConifg();
		try {
			Class.forName(config[0]);
			conn = DriverManager.getConnection(config[1], config[2], config[3]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// 关闭连接
	public static void close(){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
	}
}
