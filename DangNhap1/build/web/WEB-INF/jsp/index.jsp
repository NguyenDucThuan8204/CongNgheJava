<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Trang Đăng Nhập</title>
</head>
<body>
    <h2>Đăng nhập</h2>
    <form action="login.htm" method="post">
        <label>Tài khoản:</label>
        <input type="text" name="username" required /><br/><br/>
        <label>Mật khẩu:</label>
        <input type="password" name="password" required /><br/><br/>
        <input type="submit" value="Đăng nhập" />
    </form>
</body>
</html>
