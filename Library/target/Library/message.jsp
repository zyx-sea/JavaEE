<%--
  User: zhou
  Date: 2016/10/27
  Time: 13:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>加入购物车</title>
    <link href="../Css/shopping_intermediate.css" rel="stylesheet" type="text/css">
</head>
<jsp:include page="/WEB-INF/jsp/part/header.jsp"/>
<body>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
<script charset="gb2312" type="text/javascript">var width = 0; narrow = 1;</script>
<form action="#" id="bootpagetopSearch" name="bootpagetopSearch" method="post">
</form>--%>

<div class="shoppingcart_wrapper intermediate">
    <div class="intermediate_box clearfix intermediate_box_tj" id="add_more">
        <div class="intermediate_left">

            <!-- 参数校验失败时-->
            <div class="success">
                <h1><s:property value="message"/> </h1>
            </div>
            <div class="vertical_middle"> </div>
        </div>
    </div>
</div>
</body>
</html>
