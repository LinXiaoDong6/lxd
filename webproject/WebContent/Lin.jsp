<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body link="#669900" alink="#FFCC66" vlink="#FF3300">
		<table width="786" height="700" border="0" align="center"
			cellpadding="0" cellspacing="0" background="images/main2.gif">
			<tr align="left" valign="top">
				<td height="146" colspan="3"><jsp:include page="/top.jsp" /></td>
			</tr>
			<tr>
				<td width="215" height="490" align="left" valign="top">
					<table width="100%" height="415" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td height="152" align="left" valign="top">
								<table width="100%" height="172" border="0" cellpadding="0"
									cellspacing="0">
									<tr>
										<td width="94%" height="37">
											<div id="div1">
												<span id="info"></span>
												<div id="logdiv" style="padding:20px;">
												<br/>
												<ul class="nav nav-stacked nav-pills"  >
					<li><a href="enter.jsp"><span
							class="glyphicon glyphicon-folder-open"></span>&nbsp;&nbsp;&nbsp;&nbsp;企业信息管理</a>
					</li>
					<li style="padding-top: 20px"><a href="goodsshow.jsp"><span
							class="glyphicon glyphicon-shopping-cart"></span>&nbsp;&nbsp;&nbsp;&nbsp;货物信息管理</a>
					</li>
					<li style="padding-top: 20px"><a href="car.jsp"><span
							class="glyphicon glyphicon-road"></span>&nbsp;&nbsp;&nbsp;&nbsp;车辆信息管理</a>
					</li><li style="padding-top: 20px"><a href="#"><span class="glyphicon glyphicon-bullhorn"></span>&nbsp;&nbsp;&nbsp;&nbsp;公告信息管理</a>
					</li>
					
					<li style="padding-top: 20px"><a href="KnowFindServlet?num=1"><span
							class="glyphicon glyphicon-globe"></span>&nbsp;&nbsp;&nbsp;&nbsp;物流知识管理</a>
					</li>
					<li style="padding-top: 20px"><a href="active.jsp"><span
							class="glyphicon glyphicon-tree-conifer"></span>&nbsp;&nbsp;&nbsp;&nbsp;物流动态管理</a>
					</li>
					<li style="padding-top: 20px"><a href="#"><span
							class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;&nbsp;&nbsp;会员信息管理</a>
					</li>
					<li style="padding-top: 20px"><a href="index.jsp"><span
							class="glyphicon glyphicon-log-out"></span>&nbsp;&nbsp;&nbsp;&nbsp;退出后台管理</a>
					</li>
				</ul>		
														
												</div>
											</div>
										</td>
										<td width="6%">
											&nbsp;
										</td>
									</tr>
								</table>
							</td>
						</tr>
						
						
					</table>
				</td>
				<td width="571" valign="top">
				<img src="images/xxx.jpg" style="width: 558px; height: 326px; ">
				
				</td>
				</tr>
			<tr align="center" valign="middle">
				<td height="20" colspan="3">
					<a href="mailto:客户服务中心信箱：xxxx@xxxxx.com">客户服务中心信箱：xxxx@xxxxx.com</a>&nbsp;
					<font size="2">客户服务中心热线直播：xxxx－xxxxxxxx</font>
				</td>
			</tr>
			<tr align="center" valign="middle">
				<td height="23" colspan="3">
					<font size="2">公司名称：xxxxxxxxxxxxxxxx&nbsp; 邮政编码：xxxxxx</font>
				</td>
			</tr>
			<tr align="center" valign="middle">
				<td height="23" colspan="3">
					<font size="2">Copyright 20011 xxxx</font>
				</td>
			</tr>
			<tr align="center" valign="middle">
				<td height="23" colspan="3">
					<a href="login.jsp"><font size="2">系统管理</font></a>
				</td>
			</tr>
		</table>
		
			<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
		<script type="text/javascript">
		 $("#login").click(function(){
			 var name = $("input[name='name']").val();
			 var password = $("input[name='password']").val();
			 $.get("LoginServlet",{
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
		
	</body>
</html>