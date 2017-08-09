<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>

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
<script type="text/javascript">
	function login(msg){
		if(msg.trim()=="true"){
			alert("用户名或密码错误");
		}
	}
</script>
<body class="loginpage" onload="login('${msg}')">
	<div class="loginbox">
		<div class="loginboxinner">

			<div class="logo">
				<h1 class="logo">
					<span>后台管理系统</span>
				</h1>
			</div>
			<!--logo-->

			<br clear="all" />
			<br />

			<div class="nousername">
				<div class="loginmsg">密码不正确.</div>
			</div>
			<!--nousername-->

			<div class="nopassword">
				<div class="loginmsg">密码不正确.</div>
				<div class="loginf">
					<div class="thumb">
						<img alt=""
							src="${pageContext.request.contextPath}/assets/images/thumbs/avatar1.png" />
					</div>
					<div class="userlogged">
						<h4></h4>
						<a href="index.html">Not <span></span>?
						</a>
					</div>
				</div>
				<!--loginf-->
			</div>
			<!--nopassword-->

			<form id="login"
				action="${pageContext.request.contextPath}/admin/loginCheck"
				method="post">

				<div class="username">
					<div class="usernameinner">
						<input type="text" name="name" id="username" />
					</div>
				</div>

				<div class="password">
					<div class="passwordinner">
						<input type="password" name="password" id="password" />
					</div>
				</div>

				<button type="submit">登录</button>

				<div class="keep">
					<input type="checkbox" /> 记住密码
				</div>

			</form>

		</div>
		<!--loginboxinner-->
	</div>
	<!--loginbox-->


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
	src="${pageContext.request.contextPath}/assets/js/custom/general.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/custom/index.js"></script>
<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/assets/js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</html>