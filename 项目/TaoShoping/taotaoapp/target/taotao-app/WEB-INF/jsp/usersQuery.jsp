<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
    <script type="text/javascript" src="../js/jquery2.js"></script>
    <script type="text/javascript" src="../js/jquery2.sorted.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script type="text/javascript" src="../js/ckform.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
    <script src="/js/vue1.js" charset="utf-8"></script>
    <script src="/js/reqwest.js" charset="utf-8"></script>
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
<body id="app">
<form action="/findUserByname"  method="post" class="form-inline definewidth m20" >
      <font color="#777777"><strong>用户名：</strong></font>
    <input type="text" name="usersUsername"  class="abc input-default" placeholder="输入用户姓名" value="">&nbsp;&nbsp;
    <button  class="btn btn-primary">查询</button>
    <button type="button"  id="addnew"><a href="/usersAdd">添加</a></button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>真实姓名</th>
        <th>性别</th>
        <th>注册手机号</th>
        <th>地址</th>
    </tr>
    </thead>
        <tr v-for="user in userslist" >
                <td>{{user.usersUsername}}</td>
                <td>{{user.usersPassword}}</td>
                <td>{{user.usersName}}</td>
                <td>{{user.usersSex}}</td>
                <td>{{user.usersPhone}}</td>
                <td>{{user.usersAddr}}</td>
                <td><button  v-on:click="deleteuser(user.usersUsername)">注销</button></td>
        </tr>
       </table>
<script>
    var vum = new Vue({
        el:'#app',
        data:{
            userslist:{},
            users_username:null
        },
        methods:{
            getData:function () {
                var self = this;
                $.post('/getall', null, function (result) {
                    /*optional stuff to do after success */
                    self.userslist = result;
                });
            },
            deleteuser:function (username) {
                var self = this;
                self.username=username;
                $.post('/deleteuser',{"usersUsername":self.username},function (result) {
                    if(result.msg){
                        alert("删除成功！！");
                    }else{
                        alert("删除失败！！");
                    }
                })
            }
        },
            /*findusers:function (users_username) {
                var self = this;
                this.users_username=users_username;
                $.post('/denglu',{"usersUsername":self.users_username},function (result) {
                    if(result.msg){
                        location.href="/usersCheck";
                    }else{
                        alert("没有此用户！！");
                    }
                })
        },*/
        ready:function () {
        this.getData();
    }
    })
</script>
</body>
</html>