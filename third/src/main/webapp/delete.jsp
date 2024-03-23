<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="delete">
      <input type="hidden" value="${e.getId() }" name="id">
      <button type="submit"> Delete </button>
     </form>
</body>
</html>