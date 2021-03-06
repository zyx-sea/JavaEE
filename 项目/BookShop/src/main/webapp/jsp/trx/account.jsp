<%--
  User: zhou
  Date: 2016/11/17
  Time: 17:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>账务</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>

<jsp:include page="/jsp/part/header.jsp"/>
<div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>已购买的内容</h2>
    </div>
    <table class="m-table m-table-row n-table g-b3">
            <colgroup>
                <col class="img"/>
                <col/>
                <col class="time"/>
                <col class="price"/>
            </colgroup>
            <thead>
            <tr>
                <th>内容图片</th>
                <th>内容名称</th>
                <th>购买时间</th>
                <th>购买价格</th>
            </tr>
            </thead>
        <s:set var="total" value="0"/>
        <s:iterator value="trxList">
            <tbody>
            <tr>
                <td><a href="./show"><img
                        src="<s:property value="icon"/> "
                        alt=""></a></td>
                <td><h4><a href="./show.html"><s:property value="title"/></a></h4></td>
                <td><span class="v-time"><s:property value="time"/></span></td>
                <td><span class="v-unit">¥</span><span class="value"><s:property value="price"/></span></td>
            </tr>
            </tbody>
            <s:set var="total" value="#total+price"/>
        </s:iterator>

            <tfoot>
            <tr>
                <td colspan="3">
                    <div class="total">总计：</div>
                </td>
                <td><span class="v-unit">¥</span><span class="value"><s:property value="total"/></span></td>
            </tr>
            </tfoot>
    </table>
</div>
<jsp:include page="/jsp/part/footer.jsp"/>
<%--<script>
   var a = <s:property value="trxList[0].price"/>+<s:property value="trxList[1].price"/>+<s:property value="trxList[2].price"/>;
   var oPrice = document.getElementsByClassName('v-unit')[2];
   oPrice.innerText = a ;

</script>--%>
</body>
</html>
