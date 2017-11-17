<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<style type="text/css">
	#div1{
		text-align: center;
	}

</style>
</head>
<body>
<div id="div1">
	<h1>会员注册</h1>
	* 以下内容必须填完整
	<table border="1" align="center">
		<tr>
			<td>名字：</td>
			<td><input type="text"/>*姓名6-20个字符</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password"/>*密码6-20个字符</td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td align="left"><input type="password"/>*两次密码相同</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>男<input type="radio" name="sex" />&nbsp 女<input type="radio" name="sex"/></td>
		</tr>
		<tr>
			<td>电话：</td>
			<td align="left"><input type="text"/></td>
		</tr>
		<tr>
			<td>Email：</td>
			<td align="left"><input type="text"/></td>
		</tr><tr>
			<td>找回密码问题：</td>
			<td align="left"><input type="text"/></td>
		</tr><tr>
			<td>问题答案：</td>
			<td align="left"><input type="text"/></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="注册"/>
				<input type="submit" value="重置"/>
				<a href="#">返回</a>
			</td>
		</tr>
	</table>
</div>

</body>
</html>