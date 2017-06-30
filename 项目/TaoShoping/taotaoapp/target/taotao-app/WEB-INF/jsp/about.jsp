<%--
User: zhou
Date: 2017/6/17
Time: 21:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Grocery Store| 关于我们 </title>
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
			<li>关于我们</li>
		</ul>
	</div>
</div>
<!-- //products-breadcrumb -->
		<jsp:include page="/WEB-INF/jsp/banner.jsp"/>
		<div class="w3l_banner_nav_right">
<!-- about -->
		<div class="privacy about">
			<h3>关于我们</h3>
			<p class="animi">At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis 
				praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias 
				excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui 
				officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem 
				rerum facilis est et expedita distinctio.</p>
			<div class="agile_about_grids">
				<div class="col-md-6 agile_about_grid_right">
					<img src="/images/31.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-6 agile_about_grid_left">
					<ol>
						<li>laborum et dolorum fuga</li>
						<li>corrupti quos dolores et quas</li>
						<li>est et expedita distinctio</li>
						<li>deleniti atque corrupti quos</li>
						<li>excepturi sint occaecati cupiditate</li>
						<li>accusamus et iusto odio</li>
					</ol>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
<!-- //about -->
		</div>
		<div class="clearfix"></div>
	</div>
<!-- //banner -->
<!-- testimonials -->
	<div class="testimonials">
		<div class="container">
			<h3>褒奖</h3>
				<div class="w3_testimonials_grids">
					<div class="wmuSlider example1 animated wow slideInUp" data-wow-delay=".5s">
						<div class="wmuSliderWrapper">
							<article style="position: absolute; width: 100%; opacity: 0;"> 
								<div class="banner-wrap">
									<div class="col-md-6 w3_testimonials_grid">
										<p><i class="fa fa-quote-right" aria-hidden="true"></i>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
										<h4>Andrew Smith <span>Customer</span></h4>
									</div>
									<div class="col-md-6 w3_testimonials_grid">
										<p><i class="fa fa-quote-right" aria-hidden="true"></i>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
										<h4>Thomson Richard <span>Customer</span></h4>
									</div>
									<div class="clearfix"> </div>
								</div>
							</article>
							<article style="position: absolute; width: 100%; opacity: 0;"> 
								<div class="banner-wrap">
									<div class="col-md-6 w3_testimonials_grid">
										<p><i class="fa fa-quote-right" aria-hidden="true"></i>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
										<h4>Crisp Kale <span>Customer</span></h4>
									</div>
									<div class="col-md-6 w3_testimonials_grid">
										<p><i class="fa fa-quote-right" aria-hidden="true"></i>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
										<h4>John Paul <span>Customer</span></h4>
									</div>
									<div class="clearfix"> </div>
								</div>
							</article>
							<article style="position: absolute; width: 100%; opacity: 0;"> 
								<div class="banner-wrap">
									<div class="col-md-6 w3_testimonials_grid">
										<p><i class="fa fa-quote-right" aria-hidden="true"></i>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
										<h4>Rosy Carl <span>Customer</span></h4>
									</div>
									<div class="col-md-6 w3_testimonials_grid">
										<p><i class="fa fa-quote-right" aria-hidden="true"></i>被选定为这些问题这一点，因此，有义务听从一个聪明人，他应该要么他拒绝享乐，以确保其他更大要不然他忍受痛苦，以免加重病情的烦恼。</p>
										<h4>Rockson Doe <span>Customer</span></h4>
									</div>
									<div class="clearfix"> </div>
								</div>
							</article>
						</div>
					</div>
					<script src="/js/jquery.wmuSlider.js"></script>
					<script>
						$('.example1').wmuSlider();         
					</script> 
				</div>
		</div>
	</div>
<!-- //testimonials -->

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