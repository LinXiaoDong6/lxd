package com.wuliu.tools;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAssist {
	//�޸����ݿ�ķ���
	
	public boolean update(String sql,Object...values){
		try {
			//�������
			Connection conn = DBCPTool.getConnection();
			//��ȡִ�����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//sql�еģ��ĸ����Ͳ���values�ĸ���Ҫһ��
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();//sql�в�������
			if(count!=0){
				if(count != values.length){
					throw new RuntimeException("����������ƥ��");
				}
				//��Ӧ?��ֵ��Ӧvalue
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
			//�������
			Connection conn = DBCPTool.getConnection();
			//��ȡִ�����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//sql�еģ��ĸ����Ͳ���values�ĸ���Ҫһ��
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();//sql�в�������
			if(count!=0){
				if(count != values.length){
					throw new RuntimeException("����������ƥ��");
				}
				//��Ӧ?��ֵ��Ӧvalue
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
