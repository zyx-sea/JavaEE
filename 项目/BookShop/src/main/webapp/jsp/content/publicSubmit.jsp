<%--
  User: zhou
  Date: 2016/11/17
  Time: 21:43
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>提交成功</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>

<jsp:include page="/jsp/part/header.jsp"/>
<div class="g-doc">
    <div class="n-result">
        <h3>发布成功！</h3>
        <p>
            <s:url namespace="/" var="show" action="show">
                <s:param name="id" value="#session.content.id"></s:param>
            </s:url>
            <s:a href="%{show}">
                [查看内容]
            </s:a>
            <a href="/index">[返回首页]</a>
        </p>
    </div>
</div>
<jsp:include page="/jsp/part/footer.jsp"/>
</body>
</html>
