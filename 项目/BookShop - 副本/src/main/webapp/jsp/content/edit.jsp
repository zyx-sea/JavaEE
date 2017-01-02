<%--
  User: zhou
  Date: 2016/11/17
  Time: 21:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<jsp:include page="/jsp/part/header.jsp"/>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>内容编辑</h2>
    </div>
    <div class="n-public">
        <form class="m-form m-form-ht" id="form" method="post" action="/update_content"<%-- onsubmit="return false;" autocomplete="off"--%>>
            <div class="fmitem">
                <label class="fmlab">标题：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="title" value="<s:property value="#session.content.title"/> " placeholder="2-80字符"/>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">摘要：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="abstracts" value="<s:property value="#session.content.abstracts"/> " placeholder="2-140字符"／>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">图片：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="icon" value="<s:property value="#session.content.icon" />" placeholder="图片地址"/>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">正文：</label>
                <div class="fmipt">
                    <textarea class="u-ipt" name="text" rows="10" placeholder="2-1000个字符"><s:property value="#session.content.text" /></textarea>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">价格：</label>
                <div class="fmipt">
                    <input class="u-ipt price" name="price" value="<s:property value="#session.content.price" />"/>元
                </div>
            </div>
            <div class="fmitem fmitem-nolab fmitem-btn">
                <div class="fmipt">
                    <button type="submit" class="u-btn u-btn-primary u-btn-lg">保 存</button>
                </div>
            </div>
        </form>
        <span class="imgpre"><img src="<s:property value="#session.content.icon" />" alt="" id="imgpre"></span>
    </div>
</div>

<jsp:include page="/jsp/part/footer.jsp"/>
<script type="text/javascript" src="../js/global.js"></script>
<script type="text/javascript" src="../js/public.js"></script>
</body>
</html>