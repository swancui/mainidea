<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>控制台页面</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/style.default.css"
	type="text/css" />
<!--[if IE 9]>
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/assets/css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/assets/css/style.ie8.css"/>
<![endif]-->
</head>
<body>
	<%@include file="/WEB-INF/jsp/admin/header.jsp"%>
	<div class="centercontent tables">
		<div class="pageheader notab">
			<h1 class="pagetitle">商品详情</h1>
			<span class="pagedesc">The specific circumstances of the
				selling of goods</span>
		</div>
		<!--pageheader-->
		<div class="dataTables_wrapper" id="dyntable2_wrapper">
			<div id="dyntable2_length" class="dataTables_length">
				<label>Show <select size="1" name="dyntable2_length">
						<option value="10" selected="selected">10</option>
						<option value="25">25</option>
						<option value="50">50</option>
						<option value="100">100</option>
				</select> entries
				</label>
			</div>
			<table cellpadding="0" cellspacing="0" border="0" class="stdtable"
				id="dyntable2">
				<colgroup>
					<col class="con0" style="width: 4%">
					<col class="con1">
					<col class="con0">
					<col class="con1">
					<col class="con0">
					<col class="con1">
					<col class="con0">
				</colgroup>
				<thead>
					<tr>
						<th class="head0" style="width: 20px"><input type="checkbox"
							class="checkall" /></th>
						<th class="head1" style="width: 50px">编号</th>
						<th class="head0" style="width: 150px">用户名</th>
						<th class="head1" style="width: 80px">真实姓名</th>
						<th class="head0" style="width: 80px">邮箱</th>
						<th class="head1" style="width: 80px">电话</th>
						<th class="head0" style="width: 130px">出生日期</th>
						<th class="head1">性别</th>
						<th class="head1" style="width: 300px">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${requestScope.list}" var="u">
						<tr class="gradeA even">
							<td align="center"><input type="checkbox" /></td>
							<td>${u.usid}</td>
							<td>${u.username}</td>
							<td class=" sorting_2">${u.uname}</td>
							<td class="center">${u.email}</td>
							<td class="center">${u.telephone}</td>
							<td>${u.birthday}</td>
							<td>${u.sex}</td>
							<td>
								<ul class="buttonlist">
									<c:if test="${u.ustate==1}">
										<li><a
											href="${pageContext.request.contextPath}/admin/updateusers?usid=${u.usid}"
											class="btn btn_info"><span>冻结用户</span></a></li>
									</c:if>

									<c:if test="${u.ustate==0}">
										<li><a
											href="${pageContext.request.contextPath}/admin/activatemail?usid=${u.usid}"
											class="btn btn_world"><span>发送激活邮件</span></a></li>
									</c:if>
								</ul>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="dataTables_info" id="dyntable2_info">Showing 1 to
				${pageSize} of ${count} entries</div>
			<div class="dataTables_paginate paging_full_numbers"
				id="dyntable2_paginate">

				<c:if test="${page>1}">
					<span
						onclick="page('${pageContext.request.contextPath}/admin/activatedUsers?ustate=${ustate}&pageNumber=1&pageSize=${pageSize}')"
						class="first paginate_button paginate_button_disabled"
						id="dyntable2_first">First</span>
					<span
						onclick="page('${pageContext.request.contextPath}/admin/activatedUsers?ustate=${ustate}&pageNumber=${pagePrevious}&pageSize=${pageSize}')"
						class="previous paginate_button paginate_button_disabled"
						id="dyntable2_previous">Previous</span>
				</c:if>
				<c:forEach begin="0" end="${page-1}" var="i">


					<span
						onclick="page('${pageContext.request.contextPath}/admin/activatedUsers?ustate=${ustate}&pageNumber=${i+1}&pageSize=${pageSize}')">
						<span class="paginate_button">${i+1}</span>
					</span>


				</c:forEach>
				<c:if test="${page>1}">
					<span
						onclick="page('${pageContext.request.contextPath}/admin/activatedUsers?ustate=${ustate}&pageNumber=${pageNext}&pageSize=${pageSize}')"
						class="next paginate_button" id="dyntable2_next">Next</span>
					<span
						onclick="page('${pageContext.request.contextPath}/admin/activatedUsers?ustate=${ustate}&pageNumber=${page}&pageSize=${pageSize}')"
						class="last paginate_button" id="dyntable2_last">Last</span>
				</c:if>

				<script type="text/javascript">
				
				function page(url){
					location.href=url;
				};
					
				</script>

			</div>
		</div>
	</div>

</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/custom/general.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/custom/table.js"></script>
<!--[if lte IE 8]>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/assets/js/plugins/excanvas.min.js"></script>
<![endif]-->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/assets/js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</html>