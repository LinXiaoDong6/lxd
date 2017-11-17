<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<br>
		<table width="502" height="213" border="0" align="center"
			cellpadding="0" cellspacing="0" bgcolor="#E8FFFF" class="tableBorder">
			<form action="#" name="form1" method="post">
				<tr>
					<td height="43" colspan="4" align="center" class="head">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td width="33" rowspan="4" align="center" valign="middle">
						&nbsp;
					</td>
					<td width="176" height="23">
						用户名:
					</td>
					<td width="258">
						<input name="username" type="text" size="31">
					</td>
					<td width="35" rowspan="4">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td height="23">
						Email:
					</td>
					<td height="23">
						<input name="email" type="text" size="31">
					</td>
				</tr>
				<tr>
					<td height="23">
						提示的问题:
					</td>
					<td height="23">
						<input name="question" type="text" size="31">
					</td>
				</tr>
				<tr>
					<td height="53">
						答案:
					</td>
					<td height="53">
						<input name="result" type="text" size="31">
					</td>
				</tr>
				<tr align="center">
					<td height="46" colspan="4">
						<input name="Submit" type="submit" value="查找">
						<input name="Submit2" type="reset" value="重置">
						<input type="button" value="登录" name="login">
						&nbsp;&nbsp;
						<a href="login.jsp">返回到主页</a>
					</td>
				</tr>
			</form>
		</table>
	</body>
</html>