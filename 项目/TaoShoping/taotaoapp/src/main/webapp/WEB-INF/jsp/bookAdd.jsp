<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
    <script type="text/javascript" src="../js/jquery2.js"></script>
    <script type="text/javascript" src="../js/jquery2.sorted.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script type="text/javascript" src="../js/ckform.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
    <script type="text/javascript" src="../js/jquerypicture.js"></script>
    
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
<br>
 <font color="#777777"><strong>请填写书籍信息：</strong></font>
<form action="/insertbook" method="post" class="definewidth m20" >
<table class="table table-bordered table-hover m10" style="margin-left:10px;margin-top:3px;">
   <br>
        <tr>
        <td class="tableleft">书号</td>
        <td><input type="text" name="bookNo"/></td>
        <td class="tableleft">书名</td>
        <td><input type="text" name="bookName"/></td>
        <td class="tableleft" >价格</td>
        <td><input type="text" name="bookPrice" /></td>
        <td class="tableleft">作者</td>
        <td><input type="text" name="bookAuthor" /></td>
        </tr>
        <tr>
        <td class="tableleft">出版社</td>
        <td><input type="text" name="bookPub" placeholder="选填"/></td>
        <td class="tableleft">数量</td>
        <td><input type="text" name="bookCount" placeholder="选填"/></td>
        <td class="tableleft">日期</td>
        <td><input type="text" name="bookDate" placeholder="选填"/></td>
        <td class="tableleft">图片</td>
        <td><input type="text" name="bookPic" placeholder="选填"/></td>
        </tr>
        <tr>
            <td class="tableleft">书籍描述</td>
            <td><textarea name="boookDes" id="" cols="30" rows="10" placeholder="选填"></textarea></td>
        <td class="tableleft">管理员</td>
        <td><input type="text" name="mngUsername" /></td>
        <td class="tableleft">类型</td>
        <td><input type="text" name="btId" placeholder="选填"/></td>
        </tr>
</table>
    <br>
<button type="submit" class="btn btn-primary">提交</button>
</form>
 <img src="" id="img0" > 
 
<script>	
$("#GoodsPicture").change(function(){
	var objUrl = getObjectURL(this.files[0]) ;
	console.log("objUrl = "+objUrl) ;
	if (objUrl) {
		$("#img0").attr("src", objUrl) ;
	}
}) ;
</script>
<script>
$(function (){
    $('#backid').click(function(){
        window.location.href="goodsQuery.html";
    });
});

</script>
</body>
</html>


