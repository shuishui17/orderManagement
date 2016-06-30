<%@page import="com.shui.order.doMain.Category"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href = "addCategory.jsp">添加商品</a></h2>
<form action="categorySevlet" method = "post">
	<table border = "1" width = "100%" height = "100%" >
	
		<tr align = "center">
			<td>编号</td>
			<td>商品名称</td>
			<td>商品详情</td>
			<td>操作</td>
		</tr>
	<%
		ArrayList<Category> categoryList1 = (ArrayList<Category>)request.getAttribute("categoryList");	
		for(int i = 0; i < categoryList1.size(); i++){
			Category c = categoryList1.get(i);
		
	%>
		<tr align = "center">
			<td name = "cid"><%=c.getCategoryId() %></td>
			<td><%=c.getCategoryName() %></td>
			<td><%=c.getCategoryDesc() %></td>
			<td><a href = "doModifyCategory.jsp?id=<%=c.getCategoryId() %>">修改</a>/<a href = "deleteCategory.jsp?cid=<%=c.getCategoryId() %>" onclick = "return confirm('确定删除？')">删除</a></td>
		</tr>
		
	<%
		}
	%>
	</table>
</form>
</body>
</html>