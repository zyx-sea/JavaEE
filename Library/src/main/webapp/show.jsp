<%--
  User: zhou
  Date: 2016/10/26
  Time: 13:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String BasePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>商品介绍</title>
    <link href="./Css/style.css" rel='stylesheet' type='text/css'/>
    <link href="./Css/shopping_cart_new.css" rel="stylesheet" type="text/css">
    <!-- Custom Theme files -->
    <!--//theme-style-->
    <script src="./Js/jquery-1.11.1.min.js"></script>
    <!--//theme-style-->
</head>
<jsp:include page="/WEB-INF/jsp/part/header.jsp"/>
<body>
<h1>商品详情 </h1>
<div class="main">
    <div class="bg-left">
        <img src="Images/show.jpg" alt=""/>
    </div>
    <div class="slide">
        <div class="banner-info">
            <div class="cont1 span_2_of_a1 simpleCart_shelfItem">
                <h4>从你的全世界路过</h4><br>
                <div class="clear"></div>

                <ul class="size">
                    <h3>我希望有个如你一般的人。
                        如这山间清晨一般明亮清爽的人，
                        如奔赴古城道路上阳光一般的人，
                        温暖而不炙热，覆盖我所有肌肤。
                        由起点到夜晚，由山野到书房，
                        一切问题的答案都很简单。我希望有个如你一般的人，贯彻未来，数遍生命的公路牌。</h3><br><br>
                    <h3>数量</h3><br>
                  <input data-value="1" value="1" type="text" style="width: 35px">
                </ul>
                <div class="btn_form button item_add item_1">
                    <form>
                        <input type="submit" value="加入购物车" title="">
                    </form>
                </div>
            </div>

        </div>


    </div>

    <div class="clear"></div>
    <div class="bottom">
        <ul id="flexiselDemo3">
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#one">
                        <img src="Images/1.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="one">
                        <img src="Images/1.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#two">
                        <img src="Images/3.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="two">
                        <img src="Images/3.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#four">
                        <img src="Images/2.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="four">
                        <img src="Images/2.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#five">
                        <img src="Images/5.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="five">
                        <img src="Images/5.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#six">
                        <img src="Images/6.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="six">
                        <img src="Images/6.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#seven">
                        <img src="Images/7.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="seven">
                        <img src="Images/7.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#night">
                        <img src="Images/8.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="night">
                        <img src="Images/8.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
            <li>
                <div class="biseller-column">
                    <a class="lightbox" href="#ten">
                        <img src="Images/9.jpg" alt=""/>
                    </a>
                    <div class="lightbox-target" id="ten">
                        <img src="Images/9.jpg" alt=""/>
                        <a class="lightbox-close" href="#"> </a>

                        <div class="clear"></div>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <script type="text/javascript">
        $(window).load(function () {
            $("#flexiselDemo3").flexisel({
                visibleItems: 6,
                animationSpeed: 1000,
                autoPlay: true,
                autoPlaySpeed: 3000,
                pauseOnHover: true,
                enableResponsiveBreakpoints: true,
                responsiveBreakpoints: {
                    portrait: {
                        changePoint: 480,
                        visibleItems: 3
                    },
                    landscape: {
                        changePoint: 640,
                        visibleItems: 3
                    },
                    tablet: {
                        changePoint: 768,
                        visibleItems: 4
                    }
                }
            });

        });
    </script>
    <script type="text/javascript" src="./Js/jquery.flexisel.js"></script>

</div>
</body>
</html>
