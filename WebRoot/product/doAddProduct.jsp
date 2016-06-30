<%@page import="com.shui.order.doMain.Product"%>
<%@page import="com.shui.order.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	request.setCharacterEncoding("UTF-8");
	String productName = request.getParameter("productName");
	Double incomePrice = Double.parseDouble(request.getParameter("incomePrice"));
	int providerId = Integer.parseInt(request.getParameter("providerId"));
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	Double salePrice = Double.parseDouble(request.getParameter("salePrice"));
	int categoryId = Integer.parseInt(request.getParameter("categoryId"));

	ProductService productService = new ProductService();
	Product p = new Product(productName,incomePrice,providerId,quantity,salePrice,categoryId);
	productService.add(p);
	
	request.getRequestDispatcher("doProduct.jsp").forward(request, response);
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>