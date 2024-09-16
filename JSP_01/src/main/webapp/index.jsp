<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
hello world</h1>
<%-- 
<h1>
Declaration tag:             </h1>
<%! int a = 19 ; String name ="jayesh" ;%>

<h1>Expression tag: <%= a %> <%= name %></h1>

<h2>Scriplet Tag : </h2>

<% 
	int sum = 20+30;
	out.print("sum = "+sum);
	
	int sub = sum-10;
	out.print("sub="+sub);
%>
--%>
<h2>import this attributes :</h2>
<h1>Time : <%=new Date().toString() %></h1>

</body>
</html>