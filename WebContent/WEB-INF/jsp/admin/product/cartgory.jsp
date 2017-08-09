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
			<h1 class="pagetitle">商品分类</h1>
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
			<div class="dataTables_filter" id="dyntable2_filter">
				<label>Search: <input type="text"></label>
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

						<th class="head1 sorting" rowspan="1" colspan="1"
							style="width: 200px">编号</th>

						<th class="head1 sorting" rowspan="1" colspan="1"
							style="width: 300px">产品类型</th>
						<th>
							<ul class="buttonlist">
								<li><a
									href="${pageContext.request.contextPath}/admin/insertcategory"
									class="btn btn_world"><span>添加商品类型</span></a></li>
							</ul>
						</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${requestScope.list}" var="p">
						<tr class="gradeA even">

							<td>${p.cid}</td>
							<td>${p.cname}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<%-- <div class="dataTables_info" id="dyntable2_info">
				Showing 1 to 10 of ${fn:length(requestScope.list)} entries
			</div> --%>
			<div class="dataTables_info" id="dyntable2_info">Showing 1 to
				${pageSize} of ${count} entries</div>
			<div class="dataTables_paginate paging_full_numbers"
				id="dyntable2_paginate">

				<c:if test="${page>1}">
					<span
						onclick="page('${pageContext.request.contextPath}/admin/cartgory?pageNumber=1&pageSize=${pageSize}')"
						class="first paginate_button paginate_button_disabled"
						id="dyntable2_first">First</span>
					<span
						onclick="page('${pageContext.request.contextPath}/admin/cartgory?pageNumber=${pagePrevious}&pageSize=${pageSize}')"
						class="previous paginate_button paginate_button_disabled"
						id="dyntable2_previous">Previous</span>
				</c:if>
				<c:forEach begin="0" end="${page-1}" var="i">


					<span
						onclick="page('${pageContext.request.contextPath}/admin/cartgory?pageNumber=${i+1}&pageSize=${pageSize}')">
						<span class="paginate_button">${i+1}</span>
					</span>


				</c:forEach>
				<c:if test="${page>1}">
					<span
						onclick="page('${pageContext.request.contextPath}/admin/cartgory?pageNumber=${pageNext}&pageSize=${pageSize}')"
						class="next paginate_button" id="dyntable2_next">Next</span>
					<span
						onclick="page('${pageContext.request.contextPath}/admin/cartgory?pageNumber=${page}&pageSize=${pageSize}')"
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
	<!-- centercontent -->
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.flot.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.flot.resize.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery.slimscroll.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/custom/general.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/custom/dashboard.js"></script>
<!--[if lte IE 8]>
	<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/assets/js/plugins/excanvas.min.js"></script>
	<![endif]-->
<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/assets/js/plugins/css3-mediaqueries.js"></script>
	<![endif]-->
</html>