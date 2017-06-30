<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: zhou
  Date: 2017/6/17
  Time: 19:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>头部 </title>
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
    <script type="text/javascript"src="/js/easing.js"></script>
    <script src="/js/vue1.js" charset="utf-8"></script>
    <script src="/js/reqwest.js" charset="utf-8"></script>
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
<!-- header -->
<div class="agileits_header">
    <div class="w3l_offers">
        <a href="/index">今日特惠</a>
    </div>
    <div class="w3l_search">
        <form action="#" method="post">
            <input type="text" name="Product" value="Search a product..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search a product...';}" required="">
            <input type="submit" value=" ">
        </form>
    </div>
    <div class="product_list_header">
        <form action="#" method="post" class="last">
            <fieldset>
                <input type="hidden" name="cmd" value="_cart" />
                <input type="hidden" name="display" value="1" />
                <input type="submit" name="submit" value="View your cart" class="button" />
            </fieldset>
        </form>
    </div>
    <div class="w3l_header_right">
        <ul>

            <li class="dropdown profile_details_drop">
                <c:if test="${empty user}">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-user" aria-hidden="true">用户</i>
                    <span class="caret"></span></a>
                <div class="mega-dropdown-menu">
                    <div class="w3ls_vegetables">
                        <ul class="dropdown-menu drp-mnu">
                            <li><a href="/login">登录</a></li>
                            <li><a href="/login">注册</a></li>
                        </ul>
                    </div>
                </div></c:if>
                <c:if test="${!empty user}"><a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <i class="fa fa-user" aria-hidden="true">您好，{{user.usersUsername}}</i>
                    <span class="caret"></span></a>
                    <div class="mega-dropdown-menu">
                        <div class="w3ls_vegetables">
                            <ul class="dropdown-menu drp-mnu">
                                <li><a href="/loginout">退出</a></li>
                            </ul>
                        </div>
                    </div></c:if>
            </li>
        </ul>


    </div>
    <%--		<div class="w3l_header_right1">
                <h2><a href="mail.html">Contact Us</a></h2>
            </div>--%>
    <div class="clearfix"> </div>
</div>
<!-- script-for sticky-nav -->
<script>
    $(document).ready(function() {
        var navoffeset=$(".agileits_header").offset().top;
        $(window).scroll(function(){
            var scrollpos=$(window).scrollTop();
            if(scrollpos >=navoffeset){
                $(".agileits_header").addClass("fixed");
            }else{
                $(".agileits_header").removeClass("fixed");
            }
        });

    });
</script>
<!-- //script-for sticky-nav -->
<div class="logo_products">
    <div class="container">
        <div class="w3ls_logo_products_left">
            <h1><a href="/index"><span>Grocery</span> Store</a></h1>
        </div>
        <div class="w3ls_logo_products_left1">
            <ul class="special_items">
                <li><a href="/events">活动</a><i>/</i></li>
                <li><a href="/index">最优惠</a><i>/</i></li>
                <li><a href="/about">关于我们</a><i>/</i></li>
                <li><a href="/services">服务</a></li>
            </ul>
        </div>
        <div class="w3ls_logo_products_left1">
            <ul class="phone_email">
                <li><i class="fa fa-phone" aria-hidden="true"></i>(+0123) 234 567</li>
                <li><i class="fa fa-envelope-o" aria-hidden="true"></i><a href="mailto:store@grocery.com">store@grocery.com</a></li>
            </ul>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //header -->

<!-- Bootstrap Core JavaScript -->
<script src="/js/bootstrap2.min.js"></script>
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
<script >
    var vum = new Vue({
        el:'#app',
        data:{
            user:{}
        },
        methods:{
            getData:function () {
                var self = this;
                $.post('/adjustlogin',null, function(result) {
                        self.user =result.user;
                    console.log(result);
                });
            }
        },
        ready:function () {
            this.getData();
        }
    })
</script>
<!-- //here ends scrolling icon -->
<script src="/js/minicart.min.js"></script>
<%--<script>
    // Mini Cart
    paypal.minicart.render({
        action: '#'
    });

    if (~window.location.search.indexOf('reset=true')) {
        paypal.minicart.reset();
    }
</script>--%>
</body>
</html>
