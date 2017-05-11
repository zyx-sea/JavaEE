<%--
  User: zhou
  Date: 2017/4/9
  Time: 11:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>简易首页</title>
</head>
<body>
<h1>选择出题</h1>
<form action="/generate" method="post">
    <ul>
        范围：
        <input type="number" name="fws1"  pattern="\d*" placeholder="整数" />
        ~
        <input type="number" name="fws2" pattern="\d*"  placeholder="整数"/>
    </ul>
    <ul>
        运算：
        <input type="checkbox" name="algorithm[0]" value="+">
        加法&nbsp;&nbsp;
        <input type="checkbox" name="algorithm[1]" value="-">
        减法&nbsp;&nbsp;
        <input type="checkbox" name="algorithm[2]" value="x">
        乘法&nbsp;&nbsp;
        <input type="checkbox" name="algorithm[3]" value="/">
        除法
    </ul>
    <ul>
        题数：
        <input type="number" name="amount"  placeholder="有效整数" />
    </ul>
    <ul>
        是否带答案：
        <input type="radio" name="answer" value="Y">
        是
        <input type="radio" name="answer" value="N" checked>
        否
    </ul>
    <ul>
        <input type="submit" name="" value="出题">
        <input type="reset" name="" value="重置">
    </ul>
</form>
<%--<ul>
    <s:iterator value="#session.expressions">
    <li>
    <s:property value="#session.expressions.expression.operand1"/><s:property value="#session.expressions.expression.operator"/><s:property value="#session.expressions.expression.operand2"/>=
    </li>
    </s:iterator>
    &lt;%&ndash;#session.expressions.&ndash;%&gt;
</ul>--%>
</body>
</html>
