<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Customers</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap.css">

    <style>
        .container {
            width: 100vw;
            height: 100vh;
            display: flex;
            flex-direction: row;
            justify-content: center;
            align-items: center
        }
        body{
            background-color: #4e555b;
        }
    </style>
</head>
<body>

<div class="container">

    <form:form method="GET" action="summoner/profile"  class="form-inline">
        <input name="userName" class="form-control mr-sm-2" type="text" placeholder="Summoner" aria-label="Search"/>
        <button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Buscar</button>
    </form:form>

</div>



</body>
</html>