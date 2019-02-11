<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Customers</title>
</head>
<body>

<c:import url="navbar.jsp" />


    <h1> nick: ${summoner.name}</h1>

    <h1> level: ${summoner.summonerLevel}</h1>

    <h1> summoner id: ${summoner.id} </h1>

    <h1> account id: ${summoner.accountId}</h1>

    <hr>

    <h6> champion level: ${champMastery.get(0).championLevel}</h6>

</body>
</html>