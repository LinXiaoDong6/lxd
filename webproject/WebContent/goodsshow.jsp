<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<font size="5">货物信息</font>
				</td>
			</tr>
			<tr>
				<td width="786" height="30" colspan="9" align="right">
					<a href="goods.jsp">发布信息...</a><font size="4">&nbsp;</font>
				</td>
			</tr>
			<tr>
				<td width="786" height="29" align="center">
					货物类型
				</td>
				<td width="786" height="29" align="center">
					货物名称
				</td>
				<td width="786" height="29" align="center">
					货物数量
				</td>
				<td width="786" height="29" align="center">
					数量单位
				</td>
				<td width="786" height="29" align="center">
					起始省份
				</td>
				<td width="786" height="29" align="center">
					起始城市
				</td>
				<td width="786" height="29" align="center">
					抵达省份
				</td>
				<td width="786" height="29" align="center">
					抵达城市
				</td>
				<td width="786" height="29">
					<p align="center">
						详细
				</td>
			</tr>
			<c:forEach items="${sessionScope.page2.list }" var="act">
			<tr style="padding: 5px;">
				<td width="786" height="29" align="center">
					${act.goodsStyle }
				</td>
				<td width="786" height="29" align="center">
					${act.goodsName}
				</td>
				<td width="786" height="29" align="center">
					${act.goodsNumber }
				</td>
				<td width="786" height="29" align="center">
					${act.goodsUnit }
				</td>
				<td width="786" height="29" align="center">
					${act.startOmit }
				</td>
				<td width="786" height="29" align="center">
					${act.startCity }
				</td>
				<td width="786" height="29" align="center">
					${act.endOmit }
				</td>
				<td width="786" height="29" align="center">
					${act.endCity }
				</td>
				<td width="786" height="29">
					<p align="center">
						<a class="detail" data-toggle="modal" data-target="#myModal" tip="${act.id }" ><font size="2">详细</font></a>
					<a class="del" del1="${act.id }"><font size="2">删除</font></a>					
						
				</td>
			</tr>
		</c:forEach>
			<tr>
				<td width="785" height="30" colspan="9" align="right">

					<table width="784" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td width="786" height="30" colspan="9" align="right">

								<table width="786" align="center" cellpadding="0"
									cellspacing="0">
									<tr>
										<td width="786" height="30" colspan="9" align="right">
											共${sessionScope.page2.totalPages }页
											<a href="GoodServlet?act=1&num=1">第一页</a>
											<a href="GoodServlet?act=1&num=${sessionScope.page2.currPagenum-1>0?sessionScope.page2.currPagenum-1:1 }">上一页</a>
								
											<a href="GoodServlet?act=1&num=${sessionScope.page2.currPagenum+1<sessionScope.page2.totalPages?sessionScope.page2.currPagenum+1:sessionScope.page2.totalPages }">下一页</a>
								
											<a href="GoodServlet?act=1&num=${sessionScope.page2.totalPages }">最后一页</a>
											<span class="bgcolor"> <input name="topage"
													type="text" class="txt_grey" size="3" value="${sessionScope.page2.currPagenum }">页</span>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	<jsp:include page="dialoggood.jsp"></jsp:include>
	<script type="text/javascript">
		$(".detail").click(function(){
			console.log($(this).index());
			var id = $(this).attr("tip");
			$.get("GoodServlet",{
				"act":2,
				"id":id
			},function(data){
				
				var json = JSON.parse(data);
				$("#goodsStyle").html(json["goodsStyle"]);
				$("#startOmit").html(json["startOmit"]);
				$("#endOmit").html(json["endOmit"]);
				$("#link").html(json["endOmit"]);
				$("#style").html(json["style"]);
				$("#request").html(json["request"]);
				
			});
			
		});		
	</script>
	<script type="text/javascript">
	$(".del").click(function(){
		console.log($(this).index());
		var id = $(this).attr("del1");
		$.get("GoodServlet",{
			"act":3,
			"id":id
		},function(data){
			window.location.reload();
			});		
		});	
	</script>
</html>