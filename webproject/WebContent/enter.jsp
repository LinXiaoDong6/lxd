<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="css/bootstrap.min.css" rel="stylesheet" />
		<script src="js/jquery-3.2.1.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<title>Insert title here</title>
	</head>
	<body bgcolor="#ffffff">
		<table width="785" height="117" border="0" align="center"
			cellpadding="0" cellspacing="0" bgcolor="#E8FFFF">
			<tr>
				<td width="786" colspan="9" style="padding: 5px;">
					<jsp:include page="/top.jsp" />
					<p align="center">
						<font size="5">动态信息</font>
				</td>
			</tr>
			<tr>
				<td width="14%" height="29" align="center">
					<font size="2">公司名</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">类型</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">国家</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">城市</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">电话</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">详细</font>
				</td>

			</tr>
			<c:forEach items="${sessionScope.page5.list }" var="act">
			<tr>
				<td width="14%" height="32" align="center"><font size="2">${act.enterpriseName }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.operation }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.workArea }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.address }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.phone }</font></td>
				<td width="14%" height="32" align="center">
					<a class="detail" data-toggle="modal" data-target="#myModal" tip="${act.id }" ><font size="2">详细</font></a>
					<a class="del" del1="${act.id }"><font size="2">删除</font></a>	
				</td>
			</tr>
			</c:forEach>
			<tr>
				<td width="786" height="30" colspan="9" align="right">

					<table width="786" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td width="786" height="30" colspan="9" align="right">
								共${sessionScope.page5.totalPages }页
								<a href="EnterServlet?act=1&num=1">第一页</a>
											<a href="EnterServlet?act=1&num=${sessionScope.page5.currPagenum-1>0?sessionScope.page5.currPagenum-1:1 }">上一页</a>
								
											<a href="EnterServlet?act=1&num=${sessionScope.page5currPagenum+1<sessionScope.page5.totalPages?sessionScope.page5.currPagenum+1:sessionScope.page5.totalPages }">下一页</a>
								
											<a href="EnterServlet?act=1&num=${sessionScope.page5.totalPages }">最后一页</a>
								<span class="bgcolor"> <input name="topage" type="text"
										class="txt_grey" size="3" value="${sessionScope.page5.currPagenum }">页</span>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<jsp:include page="dialogEnter.jsp"></jsp:include>
	<script type="text/javascript">
		$(".detail").click(function(){
			console.log($(this).index());
			var id = $(this).attr("tip");
			$.get("EnterServlet",{
				"act":2,
				"id":id
			},function(data){
				
				var json = JSON.parse(data);
				$("#title").html("企业信息");
				$("#content").html("企业名："+json["enterpriseName"]+"<br/>"+"邮箱："+json["email"]+"<br/>"+"企业类型："+json["enterpriseSort"]+"<br/>"+"管理人："+json["userName"]);
//"企业名："+json["enterpriseName"]+"<br/>"+"企业类型："+json["enterpriseSort"]+"<br/>"+"邮箱："+json[email]+"<br/>"+"管理人："+json[userName]				
				
			});
			
		});		
	</script>
	<script type="text/javascript">
	$(".del").click(function(){
		console.log($(this).index());
		var id = $(this).attr("del1");
		$.get("EnterServlet",{
			"act":3,
			"id":id
		},function(data){
			window.location.reload();
			});		
		});	
	</script>
</html>