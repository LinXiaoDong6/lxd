package com.wuliu.tools;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

public class BeanListHandler implements ResultSetHandler {
	private Class cls;
	
	private BeanListHandler(){}
	
	public BeanListHandler(Class cls){
		this.cls = cls;
	}
	@Override
	public Object getObject(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			List list = new ArrayList(); 
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()){
				Object obj = cls.newInstance();
				//结果中的对应字段和obj中对应属性赋值
				for(int i=0; i<cnt; i++){
					String colName = rsmd.getColumnLabel(i+1);
					BeanUtils.setProperty(obj, colName, rs.getObject(colName));
				}
				//对象添加到集合中
				list.add(obj);
			}
			
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
