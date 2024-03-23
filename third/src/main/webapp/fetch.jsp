<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <table border="2" cellpadding="10" cellspacing="10">
          <tr>
          <td>Id</td>
          <td>Name</td>
          <td>Email</td>
          <td> Update</td>
          <td> Delete </td>

          </tr>
           <c:forEach var="em" items="${employe }">
           <tr>
               <td> ${em.getId() }</td>
               <td> ${em.getName() }</td>
               <td> ${em.getEmail() }</td>
               <td><a href="update?id=${em.getId() }"><button type="button">Update</button></a> </button></td>
				<td><a href="delete?id=${em.getId() }"><button type="button">Delete</button></a> </button></td>
           </tr>
      </c:forEach>
      </table>
</body>
</html>