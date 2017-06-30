<%--
User: zhou
Date: 2017/6/17
Time: 21:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Grocery Store| 服务</title>
	<!-- for-mobile-apps -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta
			name="keywords"
			content="Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design"/>
	<script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);
        function hideURLbar() {
            window.scrollTo(0, 1);
        }
	</script>
	<!-- //for-mobile-apps -->
	<link href="/css/bootstrap2.css" rel="stylesheet" type="text/css" media="all"/>
	<link href="/css/style3.css" rel="stylesheet" type="text/css" media="all"/>
	<!-- font-awesome icons -->
	<link href="/css/font-awesome.css" rel="stylesheet" type="text/css" media="all"/>
	<!-- //font-awesome icons -->
	<!-- js -->
	<script src="/js/jquery-1.11.1.min.js"></script>
	<!-- //js -->
	<link href='http://fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="/js/move-top.js"></script>
	<script type="text/javascript" src="/js/easing.js"></script>
	<script src="/js/vue1.js" charset="utf-8"></script>
	<script src="/js/reqwest.js" charset="utf-8"></script>
	<script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
	</script>
	<!-- start-smoth-scrolling -->
</head>

<body>
<!-- header -->
<jsp:include page="/WEB-INF/jsp/head.jsp"/>
<!-- products-breadcrumb -->
<div class="products-breadcrumb">
	<div class="container">
		<ul>
			<li>
				<i class="fa fa-home" aria-hidden="true"></i>
				<a href="/index">首页</a>
				<span>|</span>
			</li>
			<li>服务</li>
		</ul>
	</div>
</div>
<!-- //products-breadcrumb -->
		<jsp:include page="/WEB-INF/jsp/banner.jsp"/>
<div class="w3l_banner_nav_right">
	<!-- services -->
	<div class="services">
		<h3>服务</h3>
		<div class="w3ls_service_grids">
			<div class="col-md-5 w3ls_service_grid_left">
				<h4>我们的力量</h4>
				<p>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
			</div>
			<div class="col-md-7 w3ls_service_grid_right">
				<div class="col-md-4 w3ls_service_grid_right_1">
					<img src="images/18.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-4 w3ls_service_grid_right_1">
					<img src="images/19.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-4 w3ls_service_grid_right_1">
					<img src="images/20.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="w3ls_service_grids1">
			<div class="col-md-6 w3ls_service_grids1_left">
				<img src="images/4.jpg" alt=" " class="img-responsive" />
			</div>
			<div class="col-md-6 w3ls_service_grids1_right">
				<ul>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>et voluptates repudiandae sint et molestiae</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>rerum necessitatibus saepe eveniet ut</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>placeat facere possimus, omnis voluptas</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>Et harum quidem rerum facilis est et expedita</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>similique sunt in culpa qui officia deserunt</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>odio dignissimos ducimus qui blanditiis</li>
				</ul>
				<a href="/index">现在去购物</a>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!-- //services -->
</div>
<div class="clearfix"></div>
</div>
<!-- //banner -->
<!-- services-bottom -->
<div class="services-bottom">
	<div class="container">
		<div class="col-md-3 about_counter_left">
			<i class="glyphicon glyphicon-user" aria-hidden="true"></i>
			<p class="counter">89,147</p>
			<h3>Followers</h3>
		</div>
		<div class="col-md-3 about_counter_left">
			<i class="glyphicon glyphicon-piggy-bank" aria-hidden="true"></i>
			<p class="counter">54,598</p>
			<h3>Savings</h3>
		</div>
		<div class="col-md-3 about_counter_left">
			<i class="glyphicon glyphicon-export" aria-hidden="true"></i>
			<p class="counter">83,983</p>
			<h3>Support</h3>
		</div>
		<div class="col-md-3 about_counter_left">
			<i class="glyphicon glyphicon-bullhorn" aria-hidden="true"></i>
			<p class="counter">45,894</p>
			<h3>Popularity</h3>
		</div>
		<div class="clearfix"> </div>
		<!-- Stats-Number-Scroller-Animation-JavaScript -->
		<script src="js/waypoints.min.js"></script>
		<script src="js/counterup.min.js"></script>
		<script>
            jQuery(document).ready(function( $ ) {
                $('.counter').counterUp({
                    delay: 10,
                    time: 1000
                });
            });
		</script>
		<!-- //Stats-Number-Scroller-Animation-JavaScript -->

	</div>
</div>
<!-- //services-bottom -->
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
<script src="/js/bootstrap.min.js"></script>
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
	}
</script>
</body>
</html>