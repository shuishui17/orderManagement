<%@page import="com.shui.order.doMain.Provider"%>
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
<h2><a href = "addProvider.jsp">添加商品</a></h2>
<form action="categorySevlet" method = "post">
	<table border = "1" width = "100%" height = "100%" >
	
		<tr align = "center">
			<td>编号</td>
			<td>商家名称</td>
			<td>商家地址</td>
			<td>商家电话</td>
			<td>商品邮箱</td>
			<td>操作</td>
		</tr>
	<%
		ArrayList<Provider> providerList = (ArrayList<Provider>)request.getAttribute("providerList");	
		for(int i = 0; i < providerList.size(); i++){
			Provider provider = providerList.get(i);
		
	%>
		<tr align = "center">
			<td name = "cid"><%=provider.getProviderId() %></td>
			<td><%=provider.getProviderName() %></td>
			<td><%=provider.getProviderAdd() %></td>
			<td><%=provider.getProviderTel() %></td>
			<td><%=provider.getMail() %></td>
			<td><a href = "doModifyProvider.jsp?id=<%=provider.getProviderId() %>">修改</a>/<a href = "deleteProvider.jsp?cid=<%=provider.getProviderId() %>" onclick = "return confirm('确定删除？')">删除</a></td>
		</tr>
		
	<%
		}
	%>
	</table>
</form>
</body>
</html>