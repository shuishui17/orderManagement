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
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("cid"));
		String providerName = request.getParameter("providerName");
		String providerAdd = request.getParameter("providerAdd");
		int providerTel = Integer.parseInt(request.getParameter("providerTel"));
		String email = request.getParameter("email");
		System.out.println(providerName + id + providerAdd);

		//业务层进行添加操作
		ProviderService providerService = new ProviderService();
		Provider p = new Provider();
		p.setProviderId(id);
		p.setMail(email);
		p.setProviderAdd(providerAdd);
		p.setProviderName(providerName);
		p.setProviderTel(providerTel);
		providerService.modify(p);

		request.getRequestDispatcher("doProvider.jsp").forward(request,
				response);
	%>
</body>
</html>