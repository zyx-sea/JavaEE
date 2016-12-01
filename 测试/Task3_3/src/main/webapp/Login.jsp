<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="cn.qd.action.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head> 
  <!--  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->
  <title>登陆</title>
  <link rel="stylesheet"  href="style.css">
</head>
<body>
  <form action="use/1.action?method=toLogin" class="login" name="loginFrom" method="post">
    <h1>登陆</h1>
            <h3>账号：</h3><input type="text" name="username" value="${username }" class="login-input" placeholder="登陆账号可以为手机号" autofocus>
            <h3>密码：</h3><input type="password" name="password" value="${userpassword}"  class="login-input" placeholder="密码在6~15位之间">
    <input type="submit" value="登陆" class="login-submit" >
    <p class="login-help"><a href="use/1.action?method=forgetPassword">忘记密码?</a><a href="use/1.action?method=toRegister">/还没注册</p>
  </form>
</body>
</html>