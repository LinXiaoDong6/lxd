<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="#ffffff">
		<p align="center">
			<b><font size="5">货物信息发布</font> </b>
		</p>
		<form method="POST" action="${pageContext.request.contextPath }/GoodServlet?act=4"
			name="form1">
			<table width="785" height="117" border="0" align="center"
				cellpadding="0" cellspacing="0" bgcolor="#E8FFFF">
				<tr>
					<td width="20%" height="43">
						<p align="right">
							货物类型：
						</p>
					</td>
					<td width="36%" height="43">
						<p align="left">
							<input type="text" name="gclass" size="20">
						</p>
					</td>
					<td width="18%" height="43">
						<p align="right">
							货物名称：
						</p>
					</td>
					<td width="30%" height="43">
						<p align="left">
							<input type="text" name="gname" size="20">
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="42">
						<p align="right">
							货物数量：
						</p>
					</td>
					<td width="36%" height="42">
						<p align="left">
							<input type="text" name="gcount" size="20">
						</p>
					</td>
					<td width="18%" height="42">
						<p align="right">
							数量单位：
						</p>
					</td>
					<td width="30%" height="42">
						<p align="left">
							<input type="text" name="gunit" size="20">
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="43">
						<p align="right">
							起始省份：
						</p>
					</td>
					<td width="36%" height="43">
						<p align="left">
							<input type="text" name="gstartfirm" size="20">
						</p>
					</td>
					<td width="18%" height="43">
						<p align="right">
							起始城市：
						</p>
					</td>
					<td width="30%" height="43">
						<p align="left">
							<input type="text" name="gstartcity" size="20">
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="46">
						<p align="right">
							抵达省份：
						</p>
					</td>
					<td width="36%" height="46">
						<p align="left">
							<input type="text" name="gendfirm" size="20">
						</p>
					</td>
					<td width="18%" height="46">
						<p align="right">
							抵达城市：
						</p>
					</td>
					<td width="30%" height="46">
						<p align="left">
							<input type="text" name="gendcity" size="20">
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="45">
						<p align="right">
							运输类型：
						</p>
					</td>
					<td width="36%" height="45">

						<p align="left">

							&nbsp;
							<select size="1" name="gtransstyle">
								<option value="快速" selected>
									快速
								</option>
								<option value="特快">
									特快
								</option>
								<option value="加急">
									加急
								</option>
							</select>
						</p>
					</td>
					<td width="18%" height="45">
						<p align="right">
							运输时间：
						</p>
					</td>
					<td width="30%" height="45">
						<p align="left">
							<input type="text" name="gtime" size="20">
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="45">
						<p align="right">
							联系电话：
						</p>
					</td>
					<td width="36%" height="45">
						<p align="left">
							<input type="text" name="gphone" size="20">
						</p>
					</td>
					<td width="18%" height="45">
						<p align="right">
							联系人：
						</p>
					</td>
					<td width="30%" height="45">
						<p align="left">
							<input type="text" name="glink" size="20">
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="78">
						<p align="right">
							备注：
						</p>
					</td>
					<td width="84%" height="78" colspan="3">
						<p align="left">
							<textarea rows="5" name="gremark" cols="72"></textarea>
						</p>
					</td>
				</tr>
				<tr>
					<td width="20%" height="74">
						<p align="right">
							车辆要求：
						</p>
					</td>
					<td width="84%" height="74" colspan="3">
						<p align="left">
							<textarea rows="5" name="grequest" cols="72"></textarea>
						</p>
					</td>
				</tr>
				<tr>
					<td width="786" height="58" colspan="4">
						<p align="center">
							<input type="submit" name="show" value="发布">
							<input type="reset" name="reset" value="重置">
							&nbsp;&nbsp;
							<a href="goodsshow.jsp">返回</a>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>