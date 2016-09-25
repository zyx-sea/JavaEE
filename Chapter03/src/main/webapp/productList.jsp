<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>商品ID</th>
			<th>商品名称</th>
			<th>数量</th>
			<th colspan="2">操作</th>
		</tr>
		<tr>
			<td>1001</td>
			<td>小米手机</td>
			<td>128</td>
			<td><a href="product!edit.action?productId=1001">编辑</a></td>
			<td><a href="product!del.action?productId=1001">删除</a></td>
		</tr>
		<tr>
			<td>1002</td>
			<td>佳能相机</td>
			<td>100</td>
			<td><a href="product!edit.action?productId=1002">编辑</a></td>
			<td><a href="product!del.action?productId=1002">删除</a></td>
		</tr>
	</table>
</body>
</html>
