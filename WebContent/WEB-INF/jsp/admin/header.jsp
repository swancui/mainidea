<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>后台页面导航</title>
<link rel="stylesheet"
	href="localhost/Store/assets/css/style.default.css" type="text/css" />
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="localhost/Store/assets/css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="localhost/Store/assets/css/style.ie8.css"/>
<![endif]-->
</head>
<body class="withvernav">
	<div class="bodywrapper">
		<div class="topheader">
			<div class="left">
				<h1 class="logo">
					<span>后台管理系统</span>
				</h1>

				<div class="search">
					<form action="" method="post">
						<input type="text" name="keyword" id="keyword" value="请输入" />
						<button class="submitbutton"></button>
					</form>
				</div>
				<!--search-->

				<br clear="all" />

			</div>
			<!--left-->

			<div class="right">
				<!--<div class="notification">
                <a class="count" href="ajax/notifications.html"><span>9</span></a>
        	</div>-->
				<div class="userinfo">
					<img
						src="${pageContext.request.contextPath}/assets/images/thumbs/avatar.png"
						alt="" /> <span>管理员</span>
				</div>
				<!--userinfo-->

				<div class="userinfodrop">
					<div class="avatar">
						<div class="changetheme">
							切换主题: <br /> <a class="default"></a> <a class="blueline"></a> <a
								class="greenline"></a> <a class="contrast"></a>
						</div>
					</div>
					<!--avatar-->
					<div class="userdata">
						<h4>${sessionScope.name}</h4>
						<ul>
							<li><a href="javascript:void(0);">编辑资料</a></li>
							<li><a
								href="${pageContext.request.contextPath}/admin/loginout">退出</a></li>
						</ul>
					</div>
					<!--userdata-->
				</div>
				<!--userinfodrop-->
			</div>
			<!--right-->
		</div>
		<!--topheader-->


		<div class="header">
			<ul class="headermenu">
				<li class="current"><a
					href="${pageContext.request.contextPath}/admin/index"><span
						class="icon icon-flatscreen"></span>首页</a></li>
				<li><a href="javascript:void(0);"><span
						class="icon icon-message"></span>查看消息</a></li>
				<li><a href="javascript:void(0);"><span
						class="icon icon-chart"></span>统计报表</a></li>
			</ul>


		</div>
		<!--header-->

		<div class="vernav2 iconmenu">
			<ul>
				<li><a href="#formsub" class="editor">商品管理</a> <span
					class="arrow"></span>
					<ul id="formsub">
						<li><a
							href="${pageContext.request.contextPath}/admin/cartgory?pageNumber=1&pageSize=10">商品分类</a></li>
						<li><a
							href="${pageContext.request.contextPath}/admin/productFlag?pflag=0&pageNumber=1&pageSize=10">在售商品详情</a></li>
						<li><a
							href="${pageContext.request.contextPath}/admin/productFlag?pflag=1&pageNumber=1&pageSize=10">已下架商品</a></li>
					</ul></li>

				<li><a href="#admin" class="elements">用户管理</a> <span
					class="arrow"></span>
					<ul id="admin">
						<li><a
							href="${pageContext.request.contextPath}/admin/activatedUsers?ustate=1&pageNumber=1&pageSize=10">已激活会员</a></li>
						<li><a
							href="${pageContext.request.contextPath}/admin/activatedUsers?ustate=0&pageNumber=1&pageSize=10">未激活会员</a></li>

						<li><a
							href="${pageContext.request.contextPath}/admin/insertAdmin">添加管理员</a></li>

					</ul></li>

				<li><a href="#error" class="error">错误页面管理</a> <span
					class="arrow"></span>
					<ul id="error">
						<li><a
							href="${pageContext.request.contextPath}/error/error404">404错误页面</a></li>
						<li><a
							href="${pageContext.request.contextPath}/error/error500">500错误页面</a></li>
					</ul></li>
			</ul>
			<a class="togglemenu"></a> <br />
			<br />
		</div>
		<!--leftmenu-->




	</div>
	<!--bodywrapper-->

</body>


<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery.flot.min.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery.flot.resize.min.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/plugins/jquery.slimscroll.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/custom/general.js"></script>
<script type="text/javascript"
	src="localhost/Store/assets/js/custom/dashboard.js"></script>
<!--[if lte IE 8]>
<script language="javascript" type="text/javascript" src="localhost/Store/assets/js/plugins/excanvas.min.js"></script>
<![endif]-->
<!--[if lt IE 9]>
	<script src="localhost/Store/assets/js/plugins/css3-mediaqueries.js"></script>
<![endif]-->

</html>