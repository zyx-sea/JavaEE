<%--
  User: zhou
  Date: 2017/5/6
  Time: 16:31
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Grocery Store a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | 哲学 </title>
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

<jsp:include page="/WEB-INF/jsp/head.jsp"/>

<!-- products-breadcrumb -->
	<div class="products-breadcrumb">
		<div class="container">
			<ul>
				<li><i class="fa fa-home" aria-hidden="true"></i><a href="${pageContext.request.contextPath}/index">首页</a><span>|</span></li>
				<li>科技</li>
			</ul>
		</div>
	</div>
<!-- //products-breadcrumb -->
<jsp:include page="/WEB-INF/jsp/banner.jsp"/>
<div class="w3l_banner_nav_right">
	<div class="w3l_banner_nav_right_banner8">
		<%--<h3>Best Deals For New Products<span class="blink_me"></span></h3>--%>
	</div>
	<div class="w3ls_w3l_banner_nav_right_grid w3ls_w3l_banner_nav_right_grid_sub" url="${pageContext.request.contextPath}/findBookPh">
		<h3 class="w3l_fruit">科技</h3>
		<div class="w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg">
			<div v-for="product in productList" class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd">
				<div  class="hover14 column">
					<div  class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">
						<div class="agile_top_brand_left_grid_pos">
							<img src="/images/offer.png" alt=" " class="img-responsive" />
						</div>
						<div class="agile_top_brand_left_grid1">
							<figure>
								<div class="snipcart-item block">
									<div class="snipcart-thumb">
										<a href="single.html"><img style="height:140px;" src="{{product.bookPic}}" alt=" " class="img-responsive" /></a>
										<p>{{product.bookName}}</p>
										<h4>$ {{product.bookPrice}} .00<span>$50.00</span></h4>
									</div>
									<div class="snipcart-details">
										<form action="#" method="post">
											<fieldset>
												<input type="hidden" name="cmd" value="_cart" />
												<input type="hidden" name="add" value="1" />
												<input type="hidden" name="business" value=" " />
												<input type="hidden" name="item_name" value="raisin rolls" />
												<input type="hidden" name="amount" value="4.00" />
												<input type="hidden" name="discount_amount" value="1.00" />
												<input type="hidden" name="currency_code" value="USD" />
												<input type="hidden" name="return" value=" " />
												<input type="hidden" name="cancel_return" value=" " />
												<input type="submit" name="submit" value="Add to cart" class="button" />
											</fieldset>
										</form>
									</div>
								</div>
							</figure>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 w3ls_w3l_banner_left">
				<div class="hover14 column">

				</div>
			</div>
			<div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asd">

			</div>
			<div class="col-md-3 w3ls_w3l_banner_left">

			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg">
			<div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd">

			</div>
			<div class="col-md-3 w3ls_w3l_banner_left">

			</div>
			<div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asd">

			</div>
			<div class="col-md-3 w3ls_w3l_banner_left">

			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="w3ls_w3l_banner_nav_right_grid1 w3ls_w3l_banner_nav_right_grid1_veg">
			<div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asdfdfd">

			</div>
			<div class="col-md-3 w3ls_w3l_banner_left">

			</div>
			<div class="col-md-3 w3ls_w3l_banner_left w3ls_w3l_banner_left_asd">
				<div class="hover14 column">
					<div class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">
						<div class="tag"><img src="/images/tag.png" alt=" " class="img-responsive" /></div>
						<div class="agile_top_brand_left_grid1">
							<figure>
								<div class="snipcart-item block">
									<div class="snipcart-thumb">
										<a href="single.html"><img src="icon" alt=" " class="img-responsive" /></a>
										<p>bagels - sesame (200 gm)</p>
										<h4>$6.00 <span>$7.00</span></h4>
									</div>
									<div class="snipcart-details">
										<form action="#" method="post">
											<fieldset>
												<input type="hidden" name="cmd" value="_cart" />
												<input type="hidden" name="add" value="1" />
												<input type="hidden" name="business" value=" " />
												<input type="hidden" name="item_name" value="bagels - sesame" />
												<input type="hidden" name="amount" value="6.00" />
												<input type="hidden" name="discount_amount" value="1.00" />
												<input type="hidden" name="currency_code" value="USD" />
												<input type="hidden" name="return" value=" " />
												<input type="hidden" name="cancel_return" value=" " />
												<input type="submit" name="submit" value="Add to cart" class="button" />
											</fieldset>
										</form>
									</div>
								</div>
							</figure>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 w3ls_w3l_banner_left">

			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
	<div class="clearfix">
</div>
<jsp:include page="/WEB-INF/jsp/footer.jsp"/>
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
	var vum = new Vue({
		el:'#app',
		data:{
			//msg:123,
			productList:{}
		},
		methods:{
			getData:function () {
				var self = this;
				$.post('/findBookPh',null, function(result) {
					/*optional stuff to do after success */
					self.productList = result;
				});
			}
		},
		ready:function () {
			this.getData();
		}
	})
</script>
</body>
</html>
