<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
  <!--  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->
  <title>Login Form</title>
  <link rel="stylesheet"  href="style.css">
</head>
<body>
  <form action="index.html" class="login">
    <h1>Login</h1>
    <input type="text" name="username" class="login-input" placeholder="登陆账号可以为手机号" autofocus>
    <input type="password" name="password" class="login-input" placeholder="密码在6~15位之间">
    <input type="submit" value="Login" class="login-submit">
    <p class="login-help"><a href="index.html">Forgot password?</a></p>
  </form>
</body>
</html>