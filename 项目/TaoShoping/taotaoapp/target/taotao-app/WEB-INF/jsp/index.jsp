<%--
  User: zhou
  Date: 2017/5/6
  Time: 16:31
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Grocery Store  | 首页</title>
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
<jsp:include page="/WEB-INF/jsp/banner.jsp"/>

<div class="w3l_banner_nav_right">
    <div class="w3l_banner_nav_right_banner3">
        <h3>新产品，好交易<span class="blink_me"></span></h3>
    </div>
    <div class="w3l_banner_nav_right_banner3_btm">
        <div class="col-md-4 w3l_banner_nav_right_banner3_btml">
            <div class="view view-tenth">
                <img src="/images/13.jpg" alt=" " class="img-responsive" />
                <div class="mask">
                    <h4>Grocery Store</h4>
                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt.</p>
                </div>
            </div>
            <h4>畅销图书</h4>
            <ol>
                <li>sunt in culpa qui officia</li>
                <li>commodo consequat</li>
                <li>sed do eiusmod tempor incididunt</li>
            </ol>
        </div>
        <div class="col-md-4 w3l_banner_nav_right_banner3_btml">
            <div class="view view-tenth">
                <img src="/images/14.jpg" alt=" " class="img-responsive" />
                <div class="mask">
                    <h4>Grocery Store</h4>
                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt.</p>
                </div>
            </div>
            <h4>儿童书籍</h4>
            <ol>
                <li>enim ipsam voluptatem officia</li>
                <li>tempora incidunt ut labore et</li>
                <li>vel eum iure reprehenderit</li>
            </ol>
        </div>
        <div class="col-md-4 w3l_banner_nav_right_banner3_btml">
            <div class="view view-tenth">
                <img src="/images/15.jpg" alt=" " class="img-responsive" />
                <div class="mask">
                    <h4>Grocery Store</h4>
                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt.</p>
                </div>
            </div>
            <h4>专业书籍</h4>
            <ol>
                <li>dolorem eum fugiat voluptas</li>
                <li>ut aliquid ex ea commodi</li>
                <li>magnam aliquam quaerat</li>
            </ol>
        </div>
        <div class="clearfix"> </div>
    </div>
    <div class="w3ls_w3l_banner_nav_right_grid">
        <h3>热门书籍</h3>
        <div class="w3ls_w3l_banner_nav_right_grid1">
            <div  v-for="product in productList" class="col-md-3 w3ls_w3l_banner_left">
                <div class="hover14 column">
                    <div class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">
                        <div class="agile_top_brand_left_grid_pos">
                            <img src="/images/offer.png" alt=" " class="img-responsive" />
                        </div>
                        <div class="agile_top_brand_left_grid1">
                            <figure>
                                <div class="snipcart-item block">
                                    <div class="snipcart-thumb">
                                        <a  v-on:click="findbook(product.bookNo)" ><img style="height:140px;" src="{{product.bookPic}}" alt=" " class="img-responsive" /></a>
                                        <p style="width: 165px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;" >{{product.bookName}}</p>
                                        <h4>￥
                                            {{product.bookPrice}}
                                            <%--<span>$5.00</span>--%></h4>
                                    </div>
                                    <div class="snipcart-details">
                                        <form action="#" method="post">
                                            <fieldset>
                                                <input type="hidden" name="cmd" value="_cart" />
                                                <input type="hidden" name="add" value="1" />
                                                <input type="hidden" name="business" value=" " />
                                                <input type="hidden" name="item_name" value="{{product.bookName}}" />
                                                <input type="hidden" name="amount" value=" {{product.bookPrice}} " />
                                                <input type="hidden" name="discount_amount" value="0.00" />
                                                <input type="hidden" name="currency_code" value="" />
                                                <input type="hidden" name="return" value=" " />
                                                <input type="hidden" name="cancel_return" value=" " />
                                                <input type="submit" name="submit" value="加入购物车" class="button" />
                                            </fieldset>
                                        </form>
                                    </div>
                                </div>
                            </figure>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
    <div class="clearfix"></div>
<!-- banner -->
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
<script src="/js/minicart.js"></script>
<script>
    // Mini Cart
    paypal.minicart.render({
        action: '#'
    });

    if (~window.location.search.indexOf('reset=true')) {
        paypal.minicart.reset();
    }
</script>
<script>
    var vum = new Vue({
        el:'#app',
        data:{
            //msg:123,
            productList:{}
        },
        methods:{
            getData:function () {
                var self = this;
                $.post('/findallbook',null, function(result) {
                    /*optional stuff to do after success */
                    self.productList = result;
                });
            },
            findbook:function (bookno) {
                var self = this;
                self.bookno=bookno;
                $.post('/findBookByno',{"bookNo":self.bookno},function (result) {
                    if(result.msg){
                        location.href="/single";
                    }else{
                        alert(bookno/*"没有这本书的详细介绍"*/);
                    }
                })
            }
        },
        ready:function () {
            this.getData();
        }
    })
</script>
<jsp:include page="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>
