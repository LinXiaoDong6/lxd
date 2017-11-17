package com.wuliu.tools;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAssist {
	//修改数据库的方法
	
	public boolean update(String sql,Object...values){
		try {
			//获得连接
			Connection conn = DBCPTool.getConnection();
			//获取执行语句
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//sql中的？的个数和参数values的个数要一致
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();//sql中参数个数
			if(count!=0){
				if(count != values.length){
					throw new RuntimeException("参数个数不匹配");
				}
				//对应?赋值对应value
				for(int i=0; i< count; i++){
					pstmt.setObject(i+1, values[i]);
				}
			}
			int n = pstmt.executeUpdate();
			if(n>0){
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
	
	public Object query(String sql, ResultSetHandler rsh, Object...values){
		try {
			//获得连接
			Connection conn = DBCPTool.getConnection();
			//获取执行语句
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//sql中的？的个数和参数values的个数要一致
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();//sql中参数个数
			if(count!=0){
				if(count != values.length){
					throw new RuntimeException("参数个数不匹配");
				}
				//对应?赋值对应value
				for(int i=0; i< count; i++){
					pstmt.setObject(i+1, values[i]);
				}
			}
			ResultSet rs = pstmt.executeQuery();
			return rsh.getObject(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
