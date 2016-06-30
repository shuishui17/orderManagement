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
			String categoryId = request.getParameter("id");
			int id = Integer.parseInt(categoryId);
//System.out.println("1:" + id);			
			//业务层进行添加操作
			CategoryService categoryService = new CategoryService();
			Category category = categoryService.findById(id);
//System.out.println("2:" + category.getCategoryId());
			request.setAttribute("category", category);
			request.getRequestDispatcher("modifyCategory.jsp").forward(request, response);
	
	%>
</body>
</html>