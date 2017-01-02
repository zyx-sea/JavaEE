<%--
  User: zhou
  Date: 2016/11/17
  Time: 21:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="../js/md5.js"></script>
    <script type="text/javascript" src="../js/global.js"></script>
    <script type="text/javascript" src="../js/pageLogin.js"></script>
    <%--<script type="text/javascript" src="../../js/reqwest.js"></script>
    <script type="text/javascript" src="../../js/vue1.js"></script>--%>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body id="app">
<form class="m-form m-form-ht n-login" id="loginForm"  <%--onsubmit="true" autocomplete="off"--%> method="post">
    <div class="fmitem">
        <label class="fmlab">用户名：</label>
        <div class="fmipt">
            <input class="u-ipt" name="username" autofocus/>
        </div>
    </div>
    <div class="fmitem">
        <label class="fmlab">密码：</label>
        <div class="fmipt">
            <input class="u-ipt" type="password" name="password"/>
        </div>
    </div>
    <div class="fmitem fmitem-nolab fmitem-btn">
        <div class="fmipt">
            <button <%--v-on:click="isLogin(1)"--%> type="submit" class="u-btn u-btn-primary u-btn-lg u-btn-block">登 录</button>
        </div>
    </div>
</form>
<jsp:include page="/jsp/part/footer.jsp"/>
</body>
<%--<script>
    var vm = new Vue({
        el: "#app",
        data: {
            message: ''
        },
        methods: {
            getData: function() {
                var self = this;
                reqwest({
                    url: "api",
                    type: "json",
                    method: "get",

                    success: function(root) {
                        console.log(root);
                        self.message = root.message.username;
                       /* alert(root)*/
                    }
                })

            },
            isLogin:function (id) {
                alert(id);
            }

        },
        ready: function() {

        }

    });

</script>--%>
</html>