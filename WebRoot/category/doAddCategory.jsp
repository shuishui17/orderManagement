<%@page import="com.shui.order.doMain.Category"%>
<%@page import="com.shui.order.service.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//获取传递的参数
		//设置编码集
		request.setCharacterEncoding("utf-8");
		String categoryName = request.getParameter("categoryName");
		String categoryDesc = request.getParameter("categoryDesc");
		
		//业务层进行添加操作
		CategoryService categoryService = new CategoryService();
		Category category = new Category();
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categoryDesc);
		categoryService.add(category);
		
		request.getRequestDispatcher("doCategory.jsp").forward(request, response);
	%>
</body>
</html>