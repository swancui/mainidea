<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>500错误提示页面</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/style.default.css"
	type="text/css" />
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</head>
<body>

	<%@include file="/WEB-INF/jsp/admin/header.jsp"%>
	<div class="centercontent tables">
		<div class="contentwrapper padding10">
			<div class="errorwrapper error403">
				<div class="errorcontent">

					<h1>500内部服务器错误</h1>
					<h3>服务器遇到内部错误，无法完成您的请求。</h3>

					<p>
						请联系服务器管理员 <strong>swancuikqq635@163.com</strong> ，并通知他们发生错误的时间。<br />
						有关此错误的更多信息可能在服务器错误日志中可用。
					</p>
					<br />
					<button
						onclick="location.href='${pageContext.request.contextPath}/admin/index'"
						class="stdbtn btn_orange">回到首页</button>
				</div>
				<!--errorcontent-->
			</div>
			<!--errorwrapper-->
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
	src="${pageContext.request.contextPath}/assets/js/custom/general.js"></script>

</html>