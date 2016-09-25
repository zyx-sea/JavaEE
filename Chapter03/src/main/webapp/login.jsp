<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>用户登录</title>
</head>
<body>
	<form action="login4.action" method="post" name="logForm">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="userName" size="15" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" size="15" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登录"></td>
			</tr>
		</table>
	</form>
</body>
</html>
