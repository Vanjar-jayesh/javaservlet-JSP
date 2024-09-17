<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
	<h1>user Login </h1>
	<div>
		<form action=LoginServlet method=post>
		
			<table>
					
						<tr>
							<td>Enter name:</td>
							<td><input type=text name=textName></td>
								
						</tr>
						
						<tr>
							<td>Enter password:</td>
							<td><input type=password name=textPwd></td>
								
						</tr>
						
						<tr>
							<td><input type=submit  value=Login ></td>
							<td> <input type=reset></td>
								
						</tr>
</table>
</form>
</div>
</div>
</body>
</html>