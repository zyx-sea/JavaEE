<%--
  User: zhou
  Date: 2016/11/17
  Time: 17:16
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String BasePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<jsp:include page="/WEB-INF/part/header.jsp"/>
<div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <div class="tab">
            <ul>
                <li class="z-sel"><a href="/index">所有内容</a></li>
                <li><a href="./index.html">未购买的内容</a></li>
            </ul>
        </div>
    </div>
    <div class="n-plist">

        <ul class="f-cb">
            <s:iterator value="contentList">
                <li>
                        <a href="" class="link">
                            <div class="img"><img src="<s:property value="icon"/> "></div>
                                 <s:url namespace="/" var="show" action="show">
                                     <s:param name="id"  value="id"></s:param>
                                 </s:url>
                                 <s:a href="%{show}">
                                     <s:property value="title"/>
                                 </s:a>
                            <div class="price"><span class="v-unit">¥</span><span class="v-value"><s:property
                                    value="price"/> </span></div>
                                <%--<span class="had"><b>已售出</b></span>--%>
                        </a>
                </li>
            </s:iterator>
        </ul>
    </div>
</div>
<jsp:include page="/WEB-INF/part/footer.jsp"/>
<script type="text/javascript" src="../js/global.js"></script>
<script type="text/javascript" src="../js/pageIndex.js"></script>
</body>
</html>