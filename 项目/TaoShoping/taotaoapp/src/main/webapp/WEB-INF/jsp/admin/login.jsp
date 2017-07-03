<%--
User: zhou
Date: 2017/5/15
Time: 17:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>后台管理员登录</title>
	<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>
<body >
<%--<script src="../js/vue1.js"></script>
<script src="../js/reqwest.js"></script>--%>

<div class="wrapper">

	<div class="container">
		<h1>网上书城后台管理</h1>
		<form class="form" action="/managerlogin" method="post">
			<input type="text" placeholder="用户名" name="mngUsername">
			<input type="password" placeholder="密码"name="mngPassword"><br>
			<button type="submit" id="login-button" ><strong>登陆</strong></button>
			
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		
	</ul>
	
</div>
<script>
    /*var vue = new Vue({
        'el':'#app',
        data:{
            username:null,
            password:null
        },
        methods:{
            submit:function () {
                var self = this;
                $.post('/managerlogin',{'mngUsername':self.username,'mngPassword':self.password},function (result) {
                    if(result.message){
                        location.href="/WEB-INF/jsp/admin/index.jsp";
                        log.console(result);
                    }else{
                        alert("用户名或者密码错误");
                    }
                })
            }
        }
    })*/
</script>


</body>
</html>