<%--
  User: zhou
  Date: 2016/11/22
  Time: 8:00
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>页面头部</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<div class="n-support">请使用Chrome、Safari等webkit内核的浏览器！</div>
<div class="n-head">
    <div class="g-doc f-cb">
        <div class="user">
            你好，<span class="name"><s:property value="#session.username"/></span>

            <s:if test="#session.username==null">
                请<a href="/login">[登录]</a>
            </s:if>
            <s:else>
                <a href="/login">[退出]</a>
            </s:else>

        </div>
        <ul class="nav">
            <li><a href="/index">首页</a></li>
            <li>
                <s:url namespace="/" var="account_show" action="account_show">
                    <s:param name="id" value="#session.id"></s:param>
                </s:url>
                <s:a href="%{account_show}">
                    账务
                </s:a>
            </li>
            <li><a href="/jsp/content/public.jsp">发布</a></li>
        </ul>
    </div>
</div>
</body>
</html>
