<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="updateEmp" method="post">
       
       <input type="hidden" value="${e.getId() }" name="id">
    Name: <input type="text" value="${e.getName() }" name="name">
    Email: <input type="text" value="${e.getEmail() }" name="email">
     <button type="submit"> Update </button>
   
   </form>
</body>
</html>