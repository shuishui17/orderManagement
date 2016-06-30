<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#a00{
 font-size:22px;
 font-family:"微软雅黑";
 line-height:34px;；
 }
 #a0{font-family:"微软雅黑";font-size:30px;letter-spacing:4px;}
 #a00 a{text-decoration: none;}
</style>
</head>
<body>
<table border = "1" width = "100%" height = "650" bgcolor = "pink">
	<tr>
		<td colspan = "2" align = "center" height = "30%"><div id ="a0">订单管理系统</div></td>
	</tr>
	<tr>
		<td width = "20%" align = "center">
			<div id = "a00"> <a href = "category/doCategory.jsp" target = "bb">category管理</a><br>
			<a href = "provider/doProvider.jsp" target = "bb">provider管理</a><br>
			<a href = "product/doProduct.jsp" target = "bb">product管理</a></div><br>
		</td>
		<td><iframe src = "welcom.jsp" name = "bb" width = "100%" height = "100%"></iframe></td>
	</tr>
  </table>
</body>
</html>