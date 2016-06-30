<%@page import="com.shui.order.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int id = Integer.parseInt(request.getParameter("id"));
    ProductService productService = new ProductService();
	productService.delete(id);
	request.getRequestDispatcher("doProduct.jsp").forward(request, response);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>