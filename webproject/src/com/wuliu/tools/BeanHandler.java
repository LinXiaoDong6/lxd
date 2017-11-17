package com.wuliu.tools;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class BeanHandler implements ResultSetHandler {
	private Class cls;
	
	private BeanHandler(){}
	
	public BeanHandler(Class cls){
		this.cls = cls;
	}
	
	@Override
//	Լ�����ڱ���
	public Object getObject(ResultSet rs) {
		try {
			
			Object obj = cls.newInstance();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			if(rs.next()){
				//����еĶ�Ӧ�ֶκ�obj�ж�Ӧ���Ը�ֵ
				for(int i=0; i<cnt; i++){
					String colName = rsmd.getColumnLabel(i+1);
					Field f = cls.getDeclaredField(colName);
					f.setAccessible(true);
					f.set(obj, rs.getObject(colName));
				}
			}
			return obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
