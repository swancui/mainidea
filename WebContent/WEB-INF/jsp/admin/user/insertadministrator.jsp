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
			<h1 class="pagetitle">添加管理员</h1>

			<span class="pagedesc">Add an administrator</span>

		</div>
		<!--pageheader-->

		<div id="contentwrapper" class="contentwrapper">

			<div id="basicform" class="subcontent">



				<form class="stdform stdform2"
					action="${pageContext.request.contextPath}/admin/insertadmin"
					method="post">
					<p>
						<label>用户名</label> <span class="field"><input type="text"
							name="name" class="smallinput" onblur="namecheck()" /></span> <span
							class="reminder"></span>
					</p>
					<script type="text/javascript">
	                 function namecheck(){
	             		var name = $("input[name='name']").val();
	             		$.ajax({
	             			type:"get",
	             			url:"${pageContext.request.contextPath}/namecheck",
	             			data:"name="+name,
	             			success:function(data){
	             				alert(date);
	             				if(data.trim() == name){
	             					$(".reminder").css("color","red");
	             					$(".reminder").html("该名称已被使用，请确认产品名称");
	             				}else {
	             					$(".reminder").css("color","green");
	             					$(".reminder").html("该名可以使用");
	             				}
	             			}
	             		});
	             	}
	                 </script>
					<p>
						<label>登录密码</label> <span class="field"><input
							type="password" name="password" class="smallinput"
							onblur="subpwd1();" /> <span class="subpwd1" style="color: red"></span>
						</span>
					</p>

					<p>
						<label>确认密码</label> <span class="field"> <input
							type="password" name="pwd" class="smallinput" onblur="subpwd2();" />
							<span class="subpwd2" style="color: red"></span>
						</span>

					</p>
					<script type="text/javascript">
	                 	function subpwd1(){
	                 		var password = $("input[name='password']").val();
	                 		if(password == null || password.trim().length==0){
	                 			$(".subpwd1").html("密码不能为空或包含空格");
	                 		}else{
	                 			$(".subpwd1").html("");
	                 		}
	                 	};
	                 	function subpwd2(){
	                 		var password = $("input[name='password']").val();
	                 		
	                 		var pwd = $("input[name='pwd']").val();
	                 		if(pwd == null || pwd.trim().length==0){
	                 			$(".subpwd2").html("密码不能为空或包含空格");
	                 		}else{
		                 		if(password!=pwd){
		                 			$(".subpwd2").html("两次输入密码不相同，请重新输入");
		                 		}else{
		                 			$(".subpwd2").html("");
		                 		}
	                 		}
	                 	};
	                 </script>
					<p>
						<label>管理员权限</label> <span class="field"> <select
							name="authority" class="uniformselect">
								<option value="0">普通</option>
								<option value="1">高级</option>
						</select>

						</span>
					</p>


					<br clear="all" />
					<br />

					<p class="stdformbutton">
						<button class="submit radius2">提交</button>
						<input type="reset" class="reset radius2" value="重置" /> <a
							href="${pageContext.request.contextPath}/admin/index"> 返回首页 </a>
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