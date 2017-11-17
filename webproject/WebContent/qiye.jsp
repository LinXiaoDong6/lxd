<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="#ffffff">
		<table width="785" height="117" border="0" align="center"
			cellpadding="0" cellspacing="0" bgcolor="#E8FFFF">
			<tr>
				<td width="786" colspan="9" style="padding: 5px;">
					<jsp:include page="/top.jsp" />
					<p align="center">
						<font size="5">企业信息</font>
				</td>
				<tr>
				<td width="14%" height="29" align="center">
					<font size="2">企业类型</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">企业名称</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">经营范围</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">所属区域</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">地址</font>
				</td>
				<td width="14%" height="29" align="center">
					<font size="2">详细</font>
				</td>
				<c:forEach items="${sessionScope.page5.list }" var="act">
			<tr>
				<td width="14%" height="32" align="center"><font size="2">${act.operation }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.enterpriseName }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.enterpriseSort}</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.workArea }</font></td>
				<td width="14%" height="32" align="center"><font size="2">${act.address }</font></td>
				<td width="14%" height="32" align="center">
					<font size="2">详细</font></a>
					<font size="2">删除</font></a>
				</td>
			</tr>
</c:forEach>
			<tr>
				<td width="786" height="30" colspan="9" align="right">

					<table width="786" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td width="786" height="30" colspan="9" align="right">
								共${sessionScope.page5.totalPages }页
								<a href="EnterpriseServlet?act=1&num=1">第一页</a>
											<a href="EnterpriseServlet?act=1&num=${sessionScope.page5.currPagenum-1>0?sessionScope.page5.currPagenum-1:1 }">上一页</a>
								
											<a href="EnterpriseServlet?act=1&num=${sessionScope.page5currPagenum+1<sessionScope.page5.totalPages?sessionScope.page5.currPagenum+1:sessionScope.page5.totalPages }">下一页</a>
								
											<a href="EnterpriseServlet?act=1&num=${sessionScope.page5.totalPages }">最后一页</a>
								<span class="bgcolor"> <input name="topage" type="text"
										class="txt_grey" size="3" value="${sessionScope.page5.currPagenum }">页</span>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>