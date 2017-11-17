<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DemoBootstrap</title>
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
	.nav nav-stacked nav-pills{
		
	}
</style>
</head>

<body>
	
	<!-- /.modal -->
	<!-- modal2 -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button><div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">发布动态</h4>
				</div>
				<form role="form" action="ActiveAddServlet" method="post">
					<div class="modal-body">
						<div class="form-group">
							<label for="name">标题</label> <input type="text" class="form-control" id="title" placeholder="请输入标题" name="title">
						</div>
						<div class="form-group">
							<label for="name">请输入内容</label>
							<textarea class="form-control" rows="3" id="details" name="details"></textarea>
						</div>

						<div class="form-group row">
							<div class="col-lg-2">
								<label for="name">作者</label> <input type="text" id="author" class="form-control" placeholder="作者" name="author">
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
							关闭</button>
						<button type="reset" class="btn btn-default">重置</button>
						<button type="submit" class="btn btn-primary" id="bt2">发布</button>
					</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
					<h4 class="modal-title" id="myModalLabel">修改动态</h4>
				</div>
				<form role="form" action="ActiveUpdateServlet" method="post" id="fm">
					<div class="modal-body">
						<div class="form-group">
							<label for="name">标题</label> <input type="text"
								class="form-control" id="title2" placeholder="请输入标题"
								name="title">
						</div>
						<div class="form-group">
							<label for="name">请输入内容</label>
							<textarea class="form-control" rows="3" id="details2"
								name="details"></textarea>
						</div>

						<div class="form-group row">
							<div class="col-lg-2">
								<label for="name">作者</label> <input type="text" id="author2"
									class="form-control" placeholder="作者" name="author">
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
							关闭</button>
						<button type="reset" class="btn btn-default">重置</button>
						<button type="button" class="btn btn-primary" id="btn3">确认修改</button>
					</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>

	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<tr align="left" valign="top">
				<td height="146" colspan="3" width="400"><jsp:include page="/top.jsp" /></td>
			</tr>
			</div>
		</div>
		<br />
		<div class="row clearfix">
			<div class="col-md-4 column">
				<ul class="nav nav-stacked nav-pills"  >
					<li><a href="#"><span
							class="glyphicon glyphicon-folder-open"></span>&nbsp;&nbsp;&nbsp;&nbsp;企业信息管理</a>
					</li>
					<li style="padding-top: 20px"><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span>&nbsp;&nbsp;&nbsp;&nbsp;货物信息管理</a>
					</li>
					<li style="padding-top: 20px"><a href="#"><span
							class="glyphicon glyphicon-road"></span>&nbsp;&nbsp;&nbsp;&nbsp;车辆信息管理</a>
					</li><li style="padding-top: 20px"><a href="#"><span class="glyphicon glyphicon-bullhorn"></span>&nbsp;&nbsp;&nbsp;&nbsp;公告信息管理</a>
					</li>
					
					<li style="padding-top: 20px"><a href="KnowFindServlet?num=1"><span
							class="glyphicon glyphicon-globe"></span>&nbsp;&nbsp;&nbsp;&nbsp;物流知识管理</a>
					</li>
					<li style="padding-top: 20px"><a href="ActiveFindServlet?num=1"><span
							class="glyphicon glyphicon-tree-conifer"></span>&nbsp;&nbsp;&nbsp;&nbsp;物流动态管理</a>
					</li>
					<li style="padding-top: 20px"><a href="#"><span
							class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;&nbsp;&nbsp;会员信息管理</a>
					</li>
					<li style="padding-top: 20px"><a href="EXMan"><span
							class="glyphicon glyphicon-log-out"></span>&nbsp;&nbsp;&nbsp;&nbsp;退出后台管理</a>
					</li>
				</ul>
			</div>
			<div class="col-md-8 column">
				<table class="table table-striped">
					<thead>
						<h1>动态管理</h1>
						<button class="btn-link col-md-offset-10" id="bt1"
							data-toggle="modal" data-target="#myModal">发布信息</button>
						<tr>
							<th>编号</th>
							<th>标题</th>
							<th>作者</th>
							<th>发布日期</th>
							<th>详情</th>
							<th>删除</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${sessionScope.activepage.list }" var="i">
							<tr>
								<td>${i.a_id }</td>
								<td>${i.a_title }</td>
								<td>${i.a_author }</td>
								<td>${i.a_date }</td>
								<td><button class="btn-link r2" id="bt3"
										data-toggle="modal" data-target="#myModal2">修改</button></td>
								<td><button class="btn-link r1" id="bt4">删除</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<nav style="text-align: center">
					<ul class="pagination">
						<li><a
							href="${pageContext.request.contextPath }/ActiveFindServlet?num=${activepage.currPage -1 }">上一页</a></li>

						<c:choose>
							<%-- 当总页数<3时，显示总页数 --%>
							<c:when test="${activepage.totalPage <3}">
								<c:forEach begin="1" end="${activepage.totalPage }" var="i">
									<c:choose>
										<%-- 当前页不可点击 --%>
										<c:when test="${activepage.currPage == i}">
											<li><a href="" class="btn disabled">${i }</a></li>
										</c:when>
										<c:otherwise>
											<li><a
												href="${pageContext.request.contextPath }/ActiveFindServlet?num=${i}">${i }</a>
											</li>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:when>
							<%-- 当总页数>3时，当前页是12时，显示前3页 --%>
							<c:when test="${(activepage.currPage -1) <1}">
								<c:forEach begin="1" end="3" var="i">
									<c:choose>
										<c:when test="${activepage.currPage == i}">
											<li><a href="" class="btn disabled">${i }</a></li>
										</c:when>
										<c:otherwise>
											<li><a
												href="${pageContext.request.contextPath }/ActiveFindServlet?num=${i}">${i }</a>
											</li>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:when>
							<%-- 当总页数>3时，当前页是后两个页时，显示后3页 --%>
							<c:when
								test="${(activepage.currPage +1) >(activepage.totalPage)}">
								<c:forEach begin="${activepage.totalPage -2 }"
									end="${activepage.totalPage}" var="i">
									<c:choose>
										<c:when test="${activepage.currPage == i}">
											<li><a href="" class="btn disabled">${i }</a></li>
										</c:when>
										<c:otherwise>
											<li><a
												href="${pageContext.request.contextPath }/ActiveFindServlet?num=${i}">${i }</a>
											</li>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:when>
							<%-- 正常情况，显示3页，前一页，当前页，后一页--%>
							<c:otherwise>
								<c:forEach begin="${activepage.currPage -1 }"
									end="${activepage.currPage+1}" var="i">
									<c:choose>
										<c:when test="${activepage.currPage==i}">
											<li><a href="" class="btn disabled">${i }</a></li>
										</c:when>
										<c:otherwise>
											<li><a
												href="${pageContext.request.contextPath }/ActiveFindServlet?num=${i}">${i }</a>
											</li>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:otherwise>
						</c:choose>
						<li><a
							href="${pageContext.request.contextPath }/ActiveFindServlet?num=${activepage.currPage +1 }">下一页</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>


	<!-- Bootstrap js  -->
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#title').blur(function() {
				if ($('#title').val() == "") {
					alert("标题不能为空");

				}
			});
			$('#author').blur(function() {
				if ($('#author').val() == "") {
					alert("作者不能为空");

				}
			});
			$('#bt2').click(function() {
				if ($('#title').val() == "") {
					alert("标题不能为空");
					return false;
				}
				if ($('#author').val() == "") {
					alert("作者不能为空");
					return false;
				}
			});

		});
	</script>
	<script type="text/javascript">
		$(".r1").click(fun1);
		$(".r2").click(fun2);
		$("#btn3").click(fun3);
		var id;
		//删除
		function fun1() {
			var b = confirm("确定删除吗？");
			var i = $($(this).parent().parent().children("td").get(0)).html();

			if (b) {
				$.get("ActiveDelServlet?id=" + i, function() {
					window.location.reload();
				});
			}
		}
		//update获取ID
		function fun2() {
			var i = $($(this).parent().parent().children("td").get(0)).html();
			id = i;
			$.get("ActiveFindIIdServlet?id=" + i, function(data) {
				var json = JSON.parse(data);
				$("#title2").val(json["a_title"]);
				$("#details2").val(json["a_details"]);
				$("#author2").val(json["a_author"]);
			});

		}
		//update提交表单
		function fun3() {
			$.ajax({
				type : "POST",
				url : "ActiveUpdateServlet?id=" + id,
				data : $('#fm').serialize(),// 序列化表单值  
				async : false,
				error : function(request) {
					alert("Connection error");
				},
				success : function(data) {
					window.location.href = "ActiveFindServlet?num=1"
				}
			});
		}
	</script>
</body>

</html>