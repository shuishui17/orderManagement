<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action = "doAddProvider.jsp">
<table border = "1" width = "300" height = "100%" align="center">
	<tr align="center">
		<td colspan = "2">添加商家</td>
	<tr>
	
	<tr align="center" >
		<td width = "40%">商家名称</td>
		<td><input type = "text" name = "providerName"/></td>
	<tr>
	
	<tr align="center">
		<td width = "40%">商家地址</td>
		<td><input type = "text" name = "providerAdd"/></td>
	<tr>
	
	<tr align="center">
		<td width = "40%">商家电话</td>
		<td><input type = "text" name = "providerTel"/></td>
	<tr>
	
	<tr align="center">
		<td width = "40%">商品邮箱</td>
		<td><input type = "text" name = "email"/></td>
	<tr>
	
	<tr align="center">
		<td colspan = "2"><input type = "submit" value = "添加"/></td>
	<tr>
</table>
</form>
</body>
</html>