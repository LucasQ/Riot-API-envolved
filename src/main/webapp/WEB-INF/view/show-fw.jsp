<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Customers</title>
</head>
<body>

<c:import url="navbar.jsp" />


   <div class="container">
       <div class="col-sm">
           <h2>Free Week</h2>

           <c:forEach var="temp" items="${rotation.freeChampByName}">
               <li>${temp}</li>
           </c:forEach>

           <h2>Free Week for beginners</h2>

           <c:forEach var="temp" items="${rotation.freeChampForNewPlayersByName}">
               <li>${temp}</li>
           </c:forEach>
       </div>
   </div>

</body>
</html>