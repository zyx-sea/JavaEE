<%--
  User: zhou
  Date: 2017/4/13
  Time: 19:57
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>试题</title>
</head>
<body>
<h1>试题</h1>
<ul>
    <s:iterator value="expressions">
        <li>
            <s:property value="operand1"/><s:property value="operator"/><s:property value="operand2"/>=<s:property value="result"/>
        </li>
    </s:iterator>
</ul>
</body>
</html>
