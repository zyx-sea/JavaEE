<%--
  User: zhou
  Date: 2016/10/27
  Time: 13:25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <link href="../Css/shopping_cart_new.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="../Css/style.css">
</head>

<jsp:include page="/WEB-INF/jsp/part/header.jsp"/>
<body style="padding-bottom:82px">
<div class="logo_line">
</div>
<div id="header"></div>
<div class="add_line" id="district">
    <div class="w960">
        <div class="address" id="dp_adress"> <span class="icon_adr">&nbsp;</span>配送地址：
            <div class="select_add"> <span class="text fn-select-address">北京市东城区</span>
                <div class="area_pop" style="display:none;"> <a href="javascript:district.close()" class="close"></a>
                    <ul class="tab">
                        <li id="ap_province" class="fn-show-province"><a href="javascript:void(0)" id="selected_111">北京</a></li>
                        <li id="ap_city" class="fn-show-city"><a href="javascript:district.show_city_init(this)" id="selected_1">北京市</a></li>
                        <li id="ap_area" class="fn-show-area choose"><a href="javascript:district.show_area_init(this)" id="selected_1110101">东城区</a></li>
                        <li id="ap_village" style="display:none" class="fn-show-village"><a href="javascript:district.show_village_init(this)" id="selected_-1">请选择</a></li>
                    </ul>
                    <ul class="list list_notaligned fn-adress">
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="w960" id="cart">
        <div id="LoginFalse" class="login_tip"><span class="icon"></span>您还没有登录！登录后购物车的商品将保存到您的帐号中<a href="javascript:cart.cartLogin()" class="btn">立即登录</a></div>
        <ul class="shopping_title" id="j_carttitle">
            <li class="f1">&nbsp;</li>
            <li class="f2">商品信息</li>
            <li class="f3">单价（元）</li>
            <li class="f4">数量</li>
            <li class="f4">金额（元）</li>
            <li class="f5">操作</li>
        </ul>
        <div class="fn-shops" id="J_cartContent">
            <div class="fn-shop">
                <table border="0" cellspacing="0" cellpadding="0" class="shop_title">
                    <tbody>
                    </tbody>
                </table>
                <div class="shopping_list">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tbody data-stock="29185" data-offline="false" data-productid="24042118" data-timestamp="1476520382000" data-orderforspupormo="0">
                        <tr id="tr_81650326" class="bb_none">
                            <td class="row_img"><a href="#/24042118.html" target="_blank" dd_name="查看详情"> <img onmouseout="$(this).parent().next().hide()" onmouseover="$(this).parent().next().show()" src="Images/24042118-1_m.jpg" width="80" height="80"> </a>
                                <div style="display: none;" class="img_big"><a href="#/24042118.html" dd_name="查看详情" target="_blank"><img src="../购物车-当当网_files/24042118-1_b.jpg"></a><span class="arrow"></span></div></td>
                            <td class="row_name"><div class="name"> <a href="#/24042118.html" title="为热爱而活（苏芒签名版 马云冯小刚作序 当当全国独家预售）" target="_blank" dd_name="查看详情" style="word-break:break-all;  word-wrap:break-word;"><span class="booking">[预售]</span>为热爱而活（苏芒签名版 马云冯小刚作序 当当全国独家预售）</a></div></td>
                            <td class="row3"><span>¥32.00</span></td>
                            <td data-minbuy="0" class="fn-count-tip row3 "><span class="amount fn-updatecount " data-value="1"><a dd_name="减少数量" href="#">-</a>
                  <input data-value="1" value="1" type="text">
                  <a dd_name="增加数量" href="#">+</a></span></td>
                            <td class="row4"><span class="red">¥0.00</span></td>
                            <td class="row5 "><span><a href="javascript:void(0)" data-item="81650326" class="fn-remove-product" dd_name="删除普通品">删除</a></span></td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr class="total">
                            <td class="row1">&nbsp;</td>
                            <td class="row_img">店铺合计</td>
                            <td colspan="2">&nbsp;</td>
                            <td colspan="3" class="row4"><span class="red big ooline alignright">¥0.00</span></td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
                <div class="shipping_add" style="display:none;"></div>
            </div>
        </div>
    </div>
    <div style="position:static;bottom:-20px;z-index: 101;width:100%;left:0px;">
        <div class="shopping_total" id="J_totalMoneyBlock">
            <div class="shopping_total_right"> <a class="total_btn fn-checkout" href="javascript:;" id="checkout_btn" dd_name="结算">结&nbsp;&nbsp;算</a>
                <div class="subtotal">
                    <p><span class="cartsum">总计(不含运费)：</span><span id="payAmount" class="price">¥32.00</span></p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
