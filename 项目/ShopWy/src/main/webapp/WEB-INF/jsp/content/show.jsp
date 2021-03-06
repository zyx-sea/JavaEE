<%--
  User: zhou
  Date: 2016/11/17
  Time: 21:45
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>产品展示</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>

<jsp:include page="/WEB-INF/part/header.jsp"/>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="g-doc">
    <div class="n-show f-cb" id="showContent">
        <div class="img"><img src="<s:property value="#session.icon" />"></div>
        <div class="cnt">
            <h2><s:property value="#session.title"/> </h2>
            <p class="summary"></p>
            <div class="price">
                <span class="v-unit">¥</span><span class="v-value"><s:property value="#session.price"/> </span>
            </div>
            <div class="oprt f-cb">
                <button class="u-btn u-btn-primary" data-buy="1">购 买</button><%--
                <span class="u-btn u-btn-primary z-dis">已购买</span>
                <span class="buyprice">当时购买价格：¥<s:property value="#session.price"/> </span>--%>
                <s:set var="userType" value="userType"/>
                <s:if test="#userType==1">
                    <a href="./edit.html" class="u-btn u-btn-primary">编 辑</a>
                </s:if>

            </div>
        </div>
    </div>
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>详细信息</h2>
    </div>
    <div class="n-detail">
        <s:property value="#session.text"/>
   </div>
</div>
<jsp:include page="/WEB-INF/part/footer.jsp"/>
<script type="text/javascript" src="../js/global.js"></script>
<script type="text/javascript" src="../js/pageShow.js"></script>
</body>
</html>