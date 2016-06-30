<%@page import="com.shui.order.doMain.Category"%>
<%@page import="com.shui.order.service.CategoryService"%>
<%@page import="com.shui.order.service.ProviderService"%>
<%@page import="com.shui.order.doMain.Provider"%>
<%@page import="com.shui.order.doMain.Product"%>
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
<h2><a href = "addProduct.jsp">添加商品</a></h2>
<form action="" method = "post">
	<table border = "1" width = "100%" height = "100%" >
	
		<tr align = "center">
			<td>编号</td>
			<td>商品名称</td>
			<td>商品进价</td>
			<td>供货商家</td>
			<td>商品数量</td>
			<td>商品价格</td>
			<td>商品种类</td>
			<td>操作</td>
		</tr>
	<%
		ProviderService providerService = new ProviderService();
		CategoryService categoryService = new CategoryService();
		ArrayList<Product> productList = (ArrayList<Product>)request.getAttribute("productList");	
		for(int i = 0; i < productList.size(); i++){
			Product product = productList.get(i);
			int providerId = product.getProviderId();
			int categoryId = product.getCategoryId();
			Provider provider = providerService.findById(providerId);
			Category category = categoryService.findById(categoryId);
		
	%>
		<tr align = "center">
			<td><%=product.getProductId() %></td>
			<td><%=product.getProductName() %></td>
			<td><%=product.getIncomePrice() %></td>
			<td><%=provider.getProviderName() %></td>
			<td><%=product.getQuantity() %></td>
			<td><%=product.getSalePrice() %></td>
			<td><%=category.getCategoryName() %></td>
			
			<td><a href = "modifyProduct.jsp?id=<%=product.getProductId() %>">修改</a>/<a href = "deleteProduct.jsp?id=<%=product.getProductId() %>" onclick = "return confirm('确定删除？')">删除</a></td>
		</tr>
		
	<%
		}
	%>
	</table>
</form>
</body>
</html>