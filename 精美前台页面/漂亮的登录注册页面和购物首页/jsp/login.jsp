<%--
  User: zhou
  Date: 2017/5/4
  Time: 14:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录/注册 </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Custom Theme files -->
    <link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!-- //Custom Theme files -->
    <!-- js -->
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/easyResponsiveTabs.js" type="text/javascript"></script>
    <!-- //js -->
</head>
<body>
<!-- main -->
<div class="main">
    <h1>Trendy Tab Login Form</h1>
    <div class="login-form">
        <div class="sap_tabs w3ls-tabs">
            <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                <ul class="resp-tabs-list">
                    <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Login</span></li>
                    <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><label>/</label><span>Sign up</span></li>
                </ul>
                <div class="clear"> </div>
                <div class="resp-tabs-container">
                    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                        <div class="login-agileits-top">
                            <form action="${pageContext.request.contextPath}/index" method="post">
                                <p>User Name </p>
                                <input type="text" name="User Name" required=""/>
                                <p>Password</p>
                                <input type="password" name="Password" required=""/>
                                <input type="checkbox" id="brand" value="">
                                <label for="brand"><span></span> Remember me ?</label>
                                <input type="submit" value="LOGIN">
                            </form>
                        </div>
                        <div class="login-agileits-bottom">
                            <p><a href="#">Forgot password?</a></p>
                        </div>
                    </div>
                    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
                        <div class="login-agileits-top sign-up">
                            <form action="#" method="post">
                                <p>User Name </p>
                                <input type="text" name="User Name"  required=""/>
                                <p>Your Email </p>
                                <input type="text" name=Email"  required=""/>
                                <p>Password</p>
                                <input type="password" name="Password" placeholder="" required=""/>
                                <input type="checkbox" id="brand1" value="">
                                <label for="brand1"><span></span>I accept the terms Use</label>
                                <input type="submit" value="SIGN UP">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ResponsiveTabs js -->
        <script type="text/javascript">
            $(document).ready(function () {
                $('#horizontalTab').easyResponsiveTabs({
                    type: 'default', //Types: default, vertical, accordion
                    width: 'auto', //auto or any width like 600px
                    fit: true   // 100% fit in a container
                });
            });
        </script>
        <!-- //ResponsiveTabs js -->
    </div>
</div>
<!-- //main -->
<!-- copyright -->
<div class="copyright">
    <p> © 2016 Trendy Tab Login Form . All rights reserved | Design by <a href="http://xmoban.cn/" target="_blank">xmoban.cn</a></p>
</div>
<!-- //copyright -->
</body>
</html>
