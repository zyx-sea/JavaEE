<%--
  User: zhou
  Date: 2016/10/23
  Time: 10:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String BasePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
<%@taglib prefix="s" uri="struts-tag" %>
<html>
<head>
    <title>购物首页</title>
    <link type="text/css" rel="stylesheet" href="./Css/1024_768.css"/>
    <link type="text/css" rel="stylesheet" href="./Css/reset.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (min-width:861px) and (max-width:960px)"
          href="./Css/pad_heng.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (min-width:601px) and (max-width:860px)"
          href="./Css/pad.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (min-width:481px) and (max-width:600px)"
          href="./Css/tel_heng.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (max-width:480px)" href="Css/tel.css"/>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/part/header.jsp"/>
<div class="w_100_l">
    <div class="main">
        <div class="top_banner">
            <div class="top_logo"><img src="Images/top_logo.jpg" alt="书店 LOGO"/></div>
            <div class="top_menu">
                <ul>
                    <li class="sel"><a href="#">首页</a></li>
                    <li><a href="#">购物车</a></li>
                    <li><a href="#">关于</a></li>
                    <li><a href="#">帮助</a></li>
                </ul>
            </div>
        </div>
        <span class="index_img"><img src="Images/banner_img.jpg" alt="Dan Cederholm" border="0" usemap="#Map"/>
        </span>
        <p class="index_hr"></p>
        <div class="content">
            <h1 class="h1_book_title">书架</h1>
            <ul>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_01.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Gift cards</a></p>
                        <p class="book_inline">$25, $50, and $100</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_02.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Just Enough Research</a></p>
                        <p class="book_inline">by Erika Hall</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_03.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Content Strategy for Mobile</a></p>
                        <p class="book_inline">by Karen McGrane</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_04.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Design Is a Job</a></p>
                        <p class="book_inline">by Mike Monteiro</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_05.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Mobile First</a></p>
                        <p class="book_inline">by Luke Wroblewski</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_06.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Designing for Emotion</a></p>
                        <p class="book_inline">by Aarron Walter</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_07.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Responsive Web Design</a></p>
                        <p class="book_inline">by Ethan Marcotte</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_08.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">CSS3 for Web Designers</a></p>
                        <p class="book_inline">by Dan Cederholm</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_09.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">HTML5 for Web Designers</a></p>
                        <p class="book_inline">by Jeremy Keith</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_10.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">On Web Typography</a></p>
                        <p class="book_inline">by Jason Santa Maria</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_11.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Responsible Responsive Design</a></p>
                        <p class="book_inline">by Scott Jehl</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dd><a href="#"><img src="Images/book_12.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">On Web Typography</a></p>
                        <p class="book_inline">by Jason Santa Maria</p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <jsp:include page="WEB-INF/jsp/part/footer.jsp"/>
</div>
</body>
</html>
