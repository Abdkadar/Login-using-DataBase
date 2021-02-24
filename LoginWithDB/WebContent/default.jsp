<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1 align="center">Welcome to Mywebsite</h1>
	<form action="LoginServlet" method="post">
       <center> 
	<h2>	Username:<input type="text" name="uname" /></h2><p>
	<h2>
	   PassWord:<input type="password" name="upass" /></h2><p> 
  		<input type="submit" value="login" />
      </center>
	</form>
</body>
</html>