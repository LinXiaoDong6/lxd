package com.wuliu.tools;

import java.sql.ResultSet;

public interface ResultSetHandler {
	//结果集转为Object
	public Object getObject(ResultSet rs);
}
