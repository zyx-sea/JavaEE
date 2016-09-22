<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login page</title>
</head>
<body>
<form action="login.action" method="post">
	<table align="center">
		<tr><td>姓名：</td><td><input type="text" name="username"></td></tr>
		<tr><td>密码：</td><td><input type="password" name="userpassword"></td></tr>	
		<tr><td><input type="submit" value="登录"></td>
		<td><input type="reset" value="取消"></td></tr>
	</table>
</form>
</body>
</html>