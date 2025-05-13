<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Ch?n Màu N?n</title>
    <style>
        body { background-color: ${sessionScope.color}; }
    </style>
</head>
<body>
    <form action="ColorServlet" method="post">
        <label>Ch?n màu:</label>
        <select name="color">
            <option value="red">Red</option>
            <option value="blue">Blue</option>
            <option value="green">Green</option>
        </select>
        <input type="submit" value="C?p nh?t màu">
    </form>
    <c:choose>
        <c:when test="${not empty sessionScope.color}">
            <p>B?n ?ã ch?n màu: ${sessionScope.color}</p>
        </c:when>
        <c:otherwise>
            <p>Vui lòng ch?n m?t màu n?n.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>