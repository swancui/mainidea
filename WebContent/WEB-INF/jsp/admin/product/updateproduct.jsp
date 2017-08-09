<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>修改商品</title>
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
			<h1 class="pagetitle">Forms</h1>
			<span class="pagedesc">The content below are loaded using
				inline data</span>

			<ul class="hornav">
				<li class="current"><a href="#basicform">修改商品</a></li>
			</ul>
		</div>
		<!--pageheader-->

		<div id="contentwrapper" class="contentwrapper">

			<div id="basicform" class="subcontent">



				<form class="stdform stdform2"
					action="${pageContext.request.contextPath}/admin/updatecheck"
					method="post" enctype="multipart/form-data">
					<p>
						<label>商品id</label> <span class="field"><input readonly
							type="text" name="pid" class="smallinput" value="${product.pid}" /></span>
					</p>

					<p>
						<label>商品名称</label> <span class="field"><input type="text"
							name="pname" class="smallinput" value="${product.pname}" /></span>
					</p>

					<p>
						<label>市场价</label> <span class="field">￥：<input type="text"
							name="market_price" class="smallinput"
							value="${product.market_price}" /></span>
					</p>

					<p>
						<label>商城价</label> <span class="field">￥：<input type="text"
							name="shop_price" class="smallinput"
							value="${product.shop_price}" /></span>
					</p>

					<p>
						<label>产品详情</label> <span class="field"> <textarea
								cols="80" rows="5" class="longinput" name="pdesc">${product.pdesc}</textarea>
						</span>
					</p>

					<p>
						<label>是否热门</label> <span class="field"> <select
							name="is_hot" class="uniformselect">
								<option value="0">非热门商品</option>
								<option value="1">热门商品</option>
						</select>

						</span>
					</p>

					<p>
						<label>产品类型</label> <span class="field"> <select name="cid"
							class="uniformselect">
								<c:forEach items="${requestScope.category}" var="category">
									<option value="${category.cid}">${category.cname}</option>
								</c:forEach>
						</select>

						</span>
					</p>

					<p>
						<label>是否下架</label> <span class="field"> <select
							name="pflag" class="uniformselect">
								<option value="0">未下架</option>
								<option value="1">已下架</option>
						</select>

						</span>
					</p>

					<p>
						<label>上传产品图片</label> <span class="field"> <img
							src="${pageContext.request.contextPath}${product.pimage}" /> <br>
							<input type="file" name="pimage" />
						</span>
					</p>


					<br clear="all" />
					<br />

					<p class="stdformbutton">
						<button class="submit radius2">提交修改</button>
						<input type="reset" class="reset radius2" value="重置" />
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