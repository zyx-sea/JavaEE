<%--
  User: zhou
  Date: 2017/6/17
  Time: 21:17
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

<!-- footer -->
<div class="footer">
    <div class="container">
        <div class="agile_footer_grids">
            <div class="col-md-3 w3_footer_grid agile_footer_grids_w3_footer">
                <div class="w3_footer_grid_bottom">
                    <h4>100% secure payments</h4>
                    <img src="/images/card.png" alt=" " class="img-responsive" />
                </div>
            </div>
            <div class="col-md-3 w3_footer_grid agile_footer_grids_w3_footer">
                <div class="w3_footer_grid_bottom">
                    <h5>connect with us</h5>
                    <ul class="agileits_social_icons">
                        <li><a href="#" class="facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                        <li><a href="#" class="twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                        <li><a href="#" class="google"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
                        <li><a href="#" class="instagram"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                        <li><a href="#" class="dribbble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="wthree_footer_copy">
            <p>© 2016 Grocery Store. All rights reserved | Design by <a href="http://xmoban.cn/">july</a></p>
        </div>
    </div>
</div>
<!-- //footer -->
<!-- Bootstrap Core JavaScript -->
<script src="/js/bootstrap2.min.js"></script>

</body>
</html>
