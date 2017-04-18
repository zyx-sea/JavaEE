<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
    <script type="text/javascript" src="../js/jquery2.js"></script>
    <script type="text/javascript" src="../js/jquery2.sorted.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script type="text/javascript" src="../js/ckform.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>

    <style type="text/css">
        body {font-size: 20px;
            padding-bottom: 40px;
            background-color:#e9e7ef;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<form class="form-inline definewidth m20" action="/query1" method="post">
     <font color="#777777"><strong>家长姓名：</strong></font>
    <input type="text" name="username" id="username"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
    <button type="submit" class="btn btn-primary">查询</button> 
</form>
<!--<table class="table table-bordered table-hover definewidth m10">-->
<table border="1" width="500px">
    <thead>
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>

        <th>创建时间</th>
		 <th>冻结账户</th>

     </tr>
    </thead>
        <tr>
                <td><a href="#"></a><s:property value="#session.user.id" /></td>
                <td><s:property value="#session.user.username" /></td>
                <td><s:property value="#session.user.password" /></td>
                <td><s:property value="#session.user.date" /></td>

            <td><button type="submit" />
            <s:url namespace="/" var="delete" action="delete">
                <s:param name="id" value="#session.user.id"></s:param>
            </s:url>
            <s:a href="%{delete}">
                注销
            </s:a>
                </button></td>
        </tr>
       </table>

</body>
</html>