package com.wuliu.tools;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPTool {
	private static DataSource ds ;
	
	static{	
		InputStream  in = DBCPTool.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
		Properties pro = new Properties();
		try {
			pro.load(in);
			 ds = BasicDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn,Statement stmt, ResultSet rs){
		try {
			if(rs !=null){
				rs.close();
			}
			if(stmt !=null){
				stmt.close();
			}
			if(conn !=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
