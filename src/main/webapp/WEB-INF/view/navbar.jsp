<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/bootstrap/bootstrap.css">
    <title>List Customers</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #4e555b; margin-bottom: 2.5%">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/home">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li id="prof">
                <a class="nav-link" href="${pageContext.request.contextPath}/summoner/profile/lul">Profile <span class="sr-only">(current)</span></a>
            </li>
            <li id="fw">
                <a class="nav-link" href="freeweek">Free Week</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Live Game</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>
        </ul>
    </div>
</nav>
<script language="JavaScript" src="/js/navbarHandle.js"></script>
</body>
</html>