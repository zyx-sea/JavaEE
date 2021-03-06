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
<form action="/findbook"  method="post" class="form-inline definewidth m20" >
      <font color="#777777"><strong>用户名：</strong></font>
    <input type="text" name="bookNo"  class="abc input-default" placeholder="输入书号" value="">&nbsp;&nbsp;
    <button  class="btn btn-primary">查询</button>
    <button type="button"  id="addnew"><a href="/bookAdd">添加</a></button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>书号</th>
        <th>书名</th>
        <th>价格</th>
        <th>作者</th>
        <th>出版社</th>
        <th>数量</th>
        <th>日期</th>
        <th>图片</th>
        <th>书籍描述</th>
        <th>管理员</th>
        <th>类型</th>
    </tr>
    </thead>
        <tr v-for="book in bookslist" >
                <td>{{book.bookNo}}</td>
                <td>{{book.bookName}}</td>
                <td>{{book.bookPrice}}</td>
                <td>{{book.bookAuthor}}</td>
                <td>{{book.bookPub}}</td>
                <td>{{book.bookCount}}</td>
                <td>{{book.bookDate}}</td>
                <td >{{book.bookPic}}</td>
                <td>{{book.bookDes}}</td>
                <td>{{book.mngUsername}}</td>
                <td>{{book.btId}}</td>
                <td><button  v-on:click="deletebook(book.booksUsername)">注销</button></td>
        </tr>
       </table>
<script>
    var vum = new Vue({
        el:'#app',
        data:{
            bookslist:{},
            books_bookno:null
        },
        methods:{
            getData:function () {
                var self = this;
                $.post('/findallbook', null, function (result) {
                    /*optional stuff to do after success */
                    self.bookslist = result;
                });
            },
            deletebook:function (bookno) {
                var self = this;
                self.bookno=bookno;
                $.post('/deletebook',{"bookNo":self.bookno},function (result) {
                    if(result.msg){
                        alert("删除成功！！");
                    }else{
                        alert("删除失败！！");
                    }
                })
            }
        },
        ready:function () {
        this.getData();
    }
    })
</script>
</body>
</html>