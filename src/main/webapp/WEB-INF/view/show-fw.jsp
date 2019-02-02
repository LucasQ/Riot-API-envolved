<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/bootstrap/bootstrap.css">
    <title>List Customers</title>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #4e555b; margin-bottom: 2.5%">
        <a class="navbar-brand" href="../home">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Free Week <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Features</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Pricing</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                </li>
            </ul>
        </div>
    </nav>


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