<%@page import="com.shui.order.doMain.Category"%>
<%@page import="com.shui.order.doMain.Provider"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="com.shui.order.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	ProductService productService = new ProductService();
	System.out.println("--------------------------------" );
	Map map = productService.findProviderAndCategory();
	
	ArrayList<Provider> providerList = (ArrayList<Provider>)map.get("providerList");
	ArrayList<Category> categoryList = (ArrayList<Category>)map.get("categoryList");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="doAddProduct.jsp">
		<table border="1" width="300" height="100%" align="center">
			<tr align="center">
				<td colspan="2">添加商品</td>
			<tr>
			<tr align="center">
				<td width="40%">商品名称</td>
				<td><input type="text" name="productName" /></td>
			<tr>
			<tr align="center">
				<td width="40%">商品进价</td>
				<td><input type="text" name="incomePrice" /></td>
			<tr>

			<tr>
				<td align="center">供货商家</td>
				<td>
					<select name = "providerId">
			<%
				for(int i = 0; i < providerList.size(); i++){
					Provider p = providerList.get(i);
				
			%>
						<option value = <%=p.getProviderId() %>><%=p.getProviderName() %></option>
			<%
				}
			%>
				</select>
				</td>
			<tr>
			<tr align="center">
				<td width="40%">商品数量</td>
				<td><input type="text" name="quantity" /></td>
			<tr>
			<tr align="center">
				<td width="40%">商品价格</td>
				<td><input type="text" name="salePrice" /></td>
			<tr>
			<tr>
				<td align="center">商品种类</td>
				<td>
					<select name = "categoryId">
			<%
				for(int i = 0; i < categoryList.size(); i++){
					Category c = categoryList.get(i);
				
			%>
						<option value = <%=c.getCategoryId() %>><%=c.getCategoryName() %></option>
			<%
				}
			%>
				</select>
				</td>
			<tr>
			
			<tr>
				<td colspan="2" align = "center"><input type = "submit" value = "确定"/></td>
			</tr>

		</table>
	</form>
</body>
</html>