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
		<form method="POST" action="CustomerServlet" name="form1">
		
			<div align="center">
				<h2 align="center">
					<b>会员注册</b>
				</h2>
				<p>
					*&nbsp; 注意以下内容必须填写完整。
				</p>
				<table width="54%" height="205" border="0" align="center"
					cellpadding="0" cellspacing="0" bgcolor="#E8FFFF"
					class="tableBorder">
					<tr>
						<td width="35%" align="left" height="27">
							名字：
						</td>
						<td width="65%" align="left">
							<input type="text" name="name" size="20">
							*姓名6-20个字符
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							<p>
								密码：
							</p>
						</td>
						<td width="65%">
							<input type="password" name="password" size="20">
							&nbsp;*密码6-16个字符
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							<p>
								确认密码：
							</p>
						</td>
						<td width="65%">
							<input name="repassword" type="password" size="20" maxlength="16">
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							性别：
						</td>
						<td width="65%">
							&nbsp; 男
							<input type="radio" value="man" checked name="sex">
							&nbsp; 女
							<input type="radio" name="sex" value="moman">
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							<p>
								电话：
							</p>
						</td>
						<td width="65%">
							<input type="text" name="phone" size="20">
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							<p>
								Email:
							</p>
						</td>
						<td width="65%">
							<input type="text" name="email" size="20">
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							<p>
								找回密码问题：
							</p>
						</td>
						<td width="65%">
							<input type="text" name="question" size="20">
						</td>
					</tr>
					<tr>
						<td width="35%" height="27">
							问题答案：
						</td>
						<td width="65%">
							<input type="text" name="result" size="20">
						</td>
					</tr>
					<tr>
						<td width="35%" height="16">
							<input id="sub" type="submit" value="注册" name="Submit">
							<input type="reset" value="重置">
							&nbsp;&nbsp;
							<a href="login.jsp">返回</a>
						</td>
						<td width="65%">
							&nbsp;
						</td>
					</tr>
				</table>
			</div>
		</form>
		<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
		<script type="text/javascript">
		$("#sub").click(function(){
				if($("input[name='name']").val()==""){
					alert("名字必须写");
					return false ;
				}
				if($("input[name='name']").val().length<6||$("input[name='name']").val().length>20){
					alert("名字长度不对");
					return false;
				}
				if($("input[name=password]").val()==""){
					alert("密码必须写");
					return false;
				}
				var p1 =$("input[name=password]").val();
				var p2 =$("input[name=repassword]").val();
				if(p1.length<6||p1.length>20){
					alert("密码长度不对");
					return false;
				}
				if(p1!=p2){
					alert("两次密码不一致")
				}
				return true;
			});
		</script>
	</body>
</html>