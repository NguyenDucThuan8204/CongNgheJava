<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>đếm số lượt truy cập trang</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

    <div class="container mt-5">
        <h1>Hello</h1>

        <c:set var="visitCount" value="${applicationScope.visitCount}" />
        
        <p class="lead">Số lượt truy cập hiện tại: <c:out value="${visitCount}" /></p>

        <h1>Lượt Truy Cập</h1>
    </div>

    <%
        // ServletContext và Session để lưu trữ số lượt truy cập
        Integer visitCount = (Integer) application.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 0;
        }
        visitCount++;
        application.setAttribute("visitCount", visitCount);

        // Kiểm tra session để xem người dùng đã truy cập hay chưa
        if (session.getAttribute("visited") == null) {
            session.setAttribute("visited", true);
        }
    %>

</body>
</html>
