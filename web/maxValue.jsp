<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="SA_2.DAO.*" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%
        List<Double>list=(List<Double>)request.getAttribute("list");
        String type=(String) request.getAttribute("type");
    %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><%=type %>信息如下</title>
</head>

<body>
<p>今日股票的<%=type %>信息如下：</p>
<span><%=list.get(0) %></span></br>
</body>


</html>