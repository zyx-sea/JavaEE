<%--
  User: zhou
  Date: 2017/5/6
  Time: 16:31
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Grocery Store a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Sign In & Sign Up </title>
    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //for-mobile-apps -->
    <link href="/css/bootstrap2.css" rel="stylesheet" type="text/css" media="all" />
    <link href="/css/style3.css" rel="stylesheet" type="text/css" media="all" />
    <!-- font-awesome icons -->
    <link href="/css/font-awesome.css" rel="stylesheet" type="text/css" media="all" />
    <!-- //font-awesome icons -->
    <!-- js -->
    <script src="/js/jquery-1.11.1.min.js"></script>
    <!-- //js -->
    <link href='http://fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    <!-- start-smoth-scrolling -->
    <script type="text/javascript" src="/js/move-top.js"></script>
    <script type="text/javascript" src="/js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
            });
        });
    </script>
    <!-- start-smoth-scrolling -->
</head>

<body id="app">
<jsp:include page="/WEB-INF/jsp/head.jsp"/>
<!-- products-breadcrumb -->
<div class="products-breadcrumb">
    <div class="container">
        <ul>
            <li><i class="fa fa-home" aria-hidden="true"></i><a href="../html/index.html">首页</a><span>|</span></li>
            <li>登录& 注册</li>
        </ul>
    </div>
</div>
<!-- //products-breadcrumb -->
<!-- banner -->
    <jsp:include page="/WEB-INF/jsp/banner.jsp"/>
    <div class="w3l_banner_nav_right">
        <!-- login -->
        <div class="w3_login">
            <h3>登录 & 注册</h3>
            <div class="w3_login_module">
                <div class="module form-module">
                    <div class="toggle"><i class="fa fa-times fa-pencil"></i>
                        <div class="tooltip">点我注册</div>
                    </div>
                    <div class="form">
                        <h2>登录账号</h2>
                        <form @submit.prevent="submit">
                            <input type="text" v-model="username" placeholder="Username" required=" ">
                            <input type="password" v-model="password" placeholder="Password" required=" ">
                            <button v-on:click="submit">登录</button>
                        </form>
                    </div>
                    <div class="form">
                        <h2>注册账号</h2>
                        <form action="/register" method="post">
                            <input type="text" name="usersUsername" placeholder="Username" required=" ">
                            <input type="password" name="usersPassword" placeholder="Password" required=" ">
                            <input type="text" name="usersAddr" placeholder="Address" required=" ">
                            <input type="text" name="usersPhone" placeholder="Phone Number" required=" ">
                            <input type="submit" value="注册">
                        </form>
                    </div>
                    <div class="cta"><a href="#">忘记密码了?</a></div>
                </div>
            </div>
            <script>
                $('.toggle').click(function(){
                    // Switches the Icon
                    $(this).children('i').toggleClass('fa-pencil');
                    // Switches the forms
                    $('.form').animate({
                        height: "toggle",
                        'padding-top': 'toggle',
                        'padding-bottom': 'toggle',
                        opacity: "toggle"
                    }, "slow");
                });
            </script>
        </div>
        <!-- //login -->
    </div>
    <div class="clearfix">
</div>
<!-- //banner -->
<!-- newsletter-top-serv-btm -->
<div class="newsletter-top-serv-btm">
    <div class="container">
        <div class="col-md-4 wthree_news_top_serv_btm_grid">
            <div class="wthree_news_top_serv_btm_grid_icon">
                <i class="fa fa-shopping-cart" aria-hidden="true"></i>
            </div>
            <h3>Nam libero tempore</h3>
            <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus
                saepe eveniet ut et voluptates repudiandae sint et.</p>
        </div>
        <div class="col-md-4 wthree_news_top_serv_btm_grid">
            <div class="wthree_news_top_serv_btm_grid_icon">
                <i class="fa fa-bar-chart" aria-hidden="true"></i>
            </div>
            <h3>officiis debitis aut rerum</h3>
            <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus
                saepe eveniet ut et voluptates repudiandae sint et.</p>
        </div>
        <div class="col-md-4 wthree_news_top_serv_btm_grid">
            <div class="wthree_news_top_serv_btm_grid_icon">
                <i class="fa fa-truck" aria-hidden="true"></i>
            </div>
            <h3>eveniet ut et voluptates</h3>
            <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus
                saepe eveniet ut et voluptates repudiandae sint et.</p>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //newsletter-top-serv-btm -->

<!-- footer -->
<jsp:include page="/WEB-INF/jsp/footer.jsp"/>
<!-- //footer -->
<!-- Bootstrap Core JavaScript -->
<script src="/js/bootstrap2.min.js"></script>
<script src="/js/vue1.js"></script>
<script src="/js/reqwest.js"></script>
<script>
    $(document).ready(function(){
        $(".dropdown").hover(
            function() {
                $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
                $(this).toggleClass('open');
            },
            function() {
                $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
                $(this).toggleClass('open');
            }
        );
    });
</script>
<!-- here stars scrolling icon -->
<script type="text/javascript">
    $(document).ready(function() {
        /*
         var defaults = {
         containerID: 'toTop', // fading element id
         containerHoverID: 'toTopHover', // fading element hover id
         scrollSpeed: 1200,
         easingType: 'linear'
         };
         */

        $().UItoTop({ easingType: 'easeOutQuart' });

    });
</script>
<!-- //here ends scrolling icon -->
<script src="/js/minicart.min.js"></script>
<script>
    // Mini Cart
    paypal.minicart.render({
        action: '#'
    });

    if (~window.location.search.indexOf('reset=true')) {
        paypal.minicart.reset();
    };

    var vue = new Vue({
        'el':'#app',
        data:{
           username:null,
            password:null
        },
        methods:{
            submit:function () {
                var self = this;
                $.post('/denglu',{'usersUsername':self.username,'usersPassword':self.password},function (result) {
                    if(result.msg){
                        location.href="/index";
                    }else{
                        alert("用户名或者密码错误");
                    }
                })
            }
        }
    })
</script>
</body>
</html>
