<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	</head>
	<body bgcolor="#ffffff">
		<center>
			<form name="form1" action="Login3Servlet?act=login" method="post">
				<table width="25%" height="260" border="0" cellpadding="0"
					cellspacing="0" background="images/login.gif">
					<tr>
						<td height="181">
							&nbsp;
						</td>
					</tr>
					<tr>
						<td height="38" align="center">
							用户名:
							<input type="text" name="name" size="10" maxlength="20"><br/>
							密&nbsp;&nbsp;&nbsp;&nbsp;码:
							<input type="password" name="password" size="12" maxlength="20">
						</td>
					</tr>
					<tr>
						<td height="33" align="center" valign="top">
							&nbsp;&nbsp;
							<button >登录</button>
							<a href="index.jsp"><input type="button" value="返回主页" name="back"></a>
							&nbsp;&nbsp;

							
						</td>
					</tr>
				</table>
			<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
			<script type="text/javascript">
				 $("#login").click(function(){
					 var name = $("input[name='name']").val();
					 var password = $("input[name='password']").val();
					 $.get("Login3Servlet",{
						 "name":name,
						 "password":password,
						 "sta":"login"
					 },function(data){
						dododo(data);
					 });
					 
				 });
				 
				 function dododo(data){
					 $("#info").html(data);
					 if(data.indexOf("欢迎")!=-1){
						 $("#logdiv").css("display","none");
					 }
				 }
		</script>
			</form>
		</center>
	</body>
</html>
