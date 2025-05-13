<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Ch?n M�u N?n</title>
    <style>
        body { background-color: ${sessionScope.color}; }
    </style>
</head>
<body>
    <form action="ColorServlet" method="post">
        <label>Ch?n m�u:</label>
        <select name="color">
            <option value="red">Red</option>
            <option value="blue">Blue</option>
            <option value="green">Green</option>
        </select>
        <input type="submit" value="C?p nh?t m�u">
    </form>
    <c:choose>
        <c:when test="${not empty sessionScope.color}">
            <p>B?n ?� ch?n m�u: ${sessionScope.color}</p>
        </c:when>
        <c:otherwise>
            <p>Vui l�ng ch?n m?t m�u n?n.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>