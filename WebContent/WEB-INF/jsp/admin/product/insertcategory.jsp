<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>后台页面导航</title>
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

	<div class="centercontent">

		<div class="pageheader">
			<h1 class="pagetitle">添加商品类型</h1>

			<span class="pagedesc">Add a product type</span>

		</div>
		<!--pageheader-->

		<div id="contentwrapper" class="contentwrapper">

			<div id="basicform" class="subcontent">



				<form class="stdform stdform2"
					action="${pageContext.request.contextPath}/admin/insertcate"
					method="post">
					<p>
						<label>商品类型</label> <span class="field"><input type="text"
							name="cname" class="smallinput" onblur="cnamecheck()" /></span> <span
							class="reminder"></span>
					</p>


					<p class="stdformbutton">
						<button class="submit radius2">提交</button>
						<input type="reset" class="reset radius2" value="重置" /> <a
							href="${pageContext.request.contextPath}/admin/cartgory?pageNumber=1&pageSize=10">
							返回商品类型 </a>
					</p>

				</form>

			</div>
			<!--subcontent-->

		</div>
		<!--contentwrapper-->

	</div>
	<!-- centercontent -->


</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/plugins/jquery-2.1.0.js"></script>
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