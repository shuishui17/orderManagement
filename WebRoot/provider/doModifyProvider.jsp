<%@page import="com.shui.order.doMain.Provider"%>
<%@page import="com.shui.order.service.ProviderService"%>
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
			String providerId = request.getParameter("id");
			int id = Integer.parseInt(providerId);
//System.out.println("1:" + id);			
			//业务层进行添加操作
			ProviderService providerService = new ProviderService();
			Provider provider = providerService.findById(id);
//System.out.println("2:" + category.getCategoryId());
			request.setAttribute("provider", provider);
			request.getRequestDispatcher("modifyProvider.jsp").forward(request, response);
	
	%>
</body>
</html>