<%--
  User: zhou
  Date: 2016/10/23
  Time: 10:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String BasePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>购物首页</title>
    <link type="text/css" rel="stylesheet" href="../Css/1024_768.css"/>
    <link type="text/css" rel="stylesheet" href="../Css/reset.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (min-width:861px) and (max-width:960px)"
          href="../Css/pad_heng.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (min-width:601px) and (max-width:860px)"
          href="../Css/pad.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (min-width:481px) and (max-width:600px)"
          href="../Css/tel_heng.css"/>
    <link type="text/css" rel="stylesheet" media="screen and (max-width:480px)" href="../Css/tel.css"/>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/part/header.jsp"/>
<div class="w_100_l">
    <div class="main">
        <span class="index_img"><img src="../Images/banner_img.jpg" alt="Dan Cederholm" border="0" usemap="#Map"/>
        </span>
        <p class="index_hr"></p>
        <div class="content">
            <h1 class="h1_book_title">书架</h1>
            <ul>
                <s:iterator value="products">
                <li>
                    <dl>
                        <dd><a href="product！findAll"><s:property value="pic"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank"><s:property value="name"/> </a></p>
                        <p class="book_inline"><s:property value="price"/> </p>
                        <a class="book_buy" href="#" target="_blank">购买</a>
                        </dt>
                    </dl>
                </li>
            </s:iterator>

                <li>
                    <dl>
                        <dd><a href="#"><img src="../Images/book_01.jpg" alt="book"/></a></dd>
                        <dt>
                        <p class="book_title"><a href="#" target="_blank">Gift cards</a></p>
                        <p class="book_inline">￥25.5</p>
                        <a class="book_buy" href="#" target="_blank">查看信息</a>
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
