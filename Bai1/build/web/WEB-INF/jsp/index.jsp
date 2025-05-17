<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang Chào Mừng</title>
    <script>
        function updateTime() {
            let now = new Date();
            let formattedTime = now.toLocaleString("vi-VN", { hour12: false });
            document.getElementById("realTime").innerText = formattedTime;
        }

        setInterval(updateTime, 1000); // Cập nhật thời gian mỗi giây
    </script>
</head>
<body onload="updateTime()">
    <h1><c:out value="${message}" /></h1> <!-- Hiển thị thông điệp từ Model -->
    <h3><c:out value="${currentTime}" /></h3><!-- Hiển thị thời gian thực -->

</body>
</html>