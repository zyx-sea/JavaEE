<%--
  User: zhou
  Date: 2017/4/9
  Time: 11:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html class=" XL">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit">
    <title>小学生出题系统--手动组卷</title>
    <!--[if lt IE 9]>
    <script> OT2.AboveIE9= false;</script>
    <![endif]-->
    <link rel="stylesheet" href="../css/base.min.css">
    <link rel="stylesheet" href="../css/main.min.css">
    <link rel="stylesheet" href="../css/manual.min.css">
</head>

<body>
<!--顶部导航开始-->
<div class="topbox">
    <div class="topinner g-container">
        <div class="slogan"> <a href="http://zujuan.21cnjy.com/question?chid=3&amp;xd=1&amp;tree_type=knowledge#">二一教育旗下产品</a> </div>
        <div class="webhelp">
            <div class="loginbox">
<%--                <a href="/login" class="login" onclick="OT2.Global.initLogin(); return false;"><span>登录</span></a>--%>

                用户名：<s:property value="#session.user.userName"/>
                <a href="/index" class="register"><span>退出</span></a>
            </div>
            <span class="split"></span> </div>
    </div>
</div>
<!--顶部导航结束--><!--头部搜索部分开始-->
<div class="top-middle">
    <div class="top-minner g-container f-cb">
        <div class="logobox"> <a href="http://zujuan.21cnjy.com/?1=1"><img src="../images/test_logo.png" alt="二一教育在线组卷平台" title="在线组卷平台"></a> </div>
    </div>
</div>
<!--头部搜索部分结束--><!--头部导航部分开始-->
<script>
    OT2.xd_chid = {"chid":3,"xd":"1"} || null;
</script>
<div class="top-navbox">
    <div class="top-nav g-container">
        <div class="nav-list">
            <ul>
                <li> <a class="" href="#"></a> </li>
                <li> <a class="" href="http://zujuan.21cnjy.com/">首页</a> </li>
                <li class="complex-nav-item"> <a href="javascript:;" class="active">手动组卷</a>
                    <div class="dd-list"> <a href="http://zujuan.21cnjy.com/question?tree_type=category&amp;chid=3&amp;xd=1"><i>章节同步选题</i></a> <a href="http://zujuan.21cnjy.com/question?tree_type=knowledge&amp;chid=3&amp;xd=1"><i>知识点选题</i></a> </div>
                </li>
                <li class="complex-nav-item"> <a href="javascript:;" class="">智能组卷</a>
                    <div class="dd-list"> <a href="http://zujuan.21cnjy.com/smarter?tree_type=category"><i>章节智能组卷</i></a> <a href="http://zujuan.21cnjy.com/smarter?tree_type=knowledge"><i>知识点智能组卷</i></a> <a onclick="return OT2.Global.initLogin();"><i>双向细目表组卷</i></a> </div>
                </li>
                <li> <a class="" href="http://zujuan.21cnjy.com/paper">试卷库</a> </li>
                <li> <a class="" href="http://zujuan.21cnjy.com/subject">专题特供</a> </li>
            </ul>
        </div>
    </div>
</div>
<!--头部导航部分结束-->
<form id="select-form" action="/generate" method="post">
    <!--头部结束-->
    <div class="breadcrumb g-container"> </div>
    <div class="g-container f-cb">
        <div class="g-mn1">
            <div class="g-mn1c">
                <div class="tag-type">
                    <div class="tag-items">
                        <div class="tag-tit">范围：</div>
                        <div class="tag-conbox">
                            <div class="tag-con">
                                <div class="con-items">&nbsp;&nbsp;&nbsp;
                                    <input type="number" name="fws1"  pattern="\d*" placeholder="整数"/>
                                    ~
                                    <input type="number" name="fws2" pattern="\d*"  placeholder="整数"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tag-items">
                        <div class="tag-tit">运算：</div>
                        <div class="tag-conbox">
                            <div class="tag-con">
                                <div class="con-items">&nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="algorithm[0]" value="+">
                                    加法&nbsp;&nbsp;
                                    <input type="checkbox" name="algorithm[1]" value="-">
                                    减法&nbsp;&nbsp;
                                    <input type="checkbox" name="algorithm[2]" value="x">
                                    乘法&nbsp;&nbsp;
                                    <input type="checkbox" name="algorithm[3]" value="/">
                                    除法 </div>
                            </div>
                        </div>
                    </div>
                    <div class="tag-items">
                        <div class="tag-tit">题数：</div>
                        <div class="tag-conbox">
                            <div class="tag-con">
                                <div class="con-items">&nbsp;&nbsp;&nbsp;
                                    <input type="number" name="amount"  placeholder="有效整数" />
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tag-items">
                        <div class="tag-tit">是否带答案：</div>
                        <div class="tag-conbox">
                            <div class="tag-con">
                                <div class="con-items">&nbsp;&nbsp;&nbsp;
                                    <input type="radio" name="answer" value="Y">
                                    是
                                    <input type="radio" name="answer" value="N" checked>
                                    否 </div>
                            </div>
                        </div>
                    </div>
                    <div class="tag-items">
                        <div class="tag-tit">出题：</div>
                        <div class="tag-conbox">
                            <div class="tag-con">
                                <div class="con-items">&nbsp;&nbsp;&nbsp;
                                    <input class="type-active" type="submit" name="" value="出题">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input class="type-active" type="reset" name="" value="重置">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="sort"> </div>
                <div class="search-list">
                    <ul id="J_QuestionList">
                        <li data-qid="3589675" class="uglify-man">
                            <div class="search-exam">
                                <div class="exam-head">
                                    <p class="exam-head-left"> <span>题型：计算题</span><i class="line"></i> <span>题类：真题</span><i class="line"></i> <span>难易度：普通</span> </p>
                                </div>
                                <div class="exam-con">
                                    <div class="exam-q">
                                        <ul>
                                            <s:iterator value="expressions">
                                                <li>
                                                    <s:property value="operand1"/>
                                                    <s:property value="operator"/>
                                                    <s:property value="operand2"/>
                                                    =
                                                    <s:property value="result"/>
                                                </li>
                                            </s:iterator>
                                        </ul>
                                    </div>
                                </div>
                                <div class="exam-foot">
                                    <p class="exam-foot-right"> <a class="addbtn J_AddQuestion" href="javascript:;">下载</a> </p>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</form>
<br><br><p align="center" >@2017 青岛工学院  版权所有</p>
</body>
</html>
