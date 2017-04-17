<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>后台管理员登录</title>

<link rel="stylesheet" type="text/css" href="../css/styles.css">

</head>
<body>


<div class="wrapper">

	<div class="container">
		<h1>小学生出题系统 后台管理</h1>
		<form class="form" action="/admin_login">
			<input type="text" placeholder="username" name="username">
			<input type="password" placeholder="password" name="password"><br>
			<!--<button type="submit" id="login-button" onclick="window.location.href='index.jsp';"><strong>登陆</strong></button>-->
			<button type="submit" id="login-button" ><strong>登陆</strong></button>
			
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		
	</ul>
	
</div>



</body>
</html>