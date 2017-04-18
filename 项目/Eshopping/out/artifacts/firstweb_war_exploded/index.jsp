<%--
  User: zhou
  Date: 2017/4/18
  Time: 10:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>手机配件选择页面</title>
    <script>
      window.onload=function () {
          var mybutton=document.getElementById("tj");
          var tmp1=document.getElementById("phonecost").innerHTML;
          var phoneprice=tmp1.substr(1,tmp1.length-1);
          var tmp2=document.getElementById("shellcost").innerHTML;
          var shellprice=tmp2.substr(1,tmp2.length-1);
          var tmp3=document.getElementById("linecost").innerHTML;
          var lineprice=tmp2.substr(1,tmp3.length-1);
          var tmp4=document.getElementById("chargecost").innerHTML;
          var chargeprice=tmp2.substr(1,tmp4.length-1);
          var tmp5=document.getElementById("batteryecost").innerHTML;
          var batteryprice=tmp2.substr(1,tmp5.length-1);

          mybutton.onclick=function () {
              document.forms[0].action="checkout?phoneprice="+phoneprice+"&shellprice="+shellprice+"&lineprice="+lineprice+"&chargeprice="+chargeprice+"&batteryprice="+batteryprice;
              document.forms[0].submit();
          };
      };
    </script>
  </head>
  <body>
 <h1>购买人气组合</h1>
  <form method="post">
    <div style="float: left">
      <img src="image/1.jpg"><br>
      <center><div id='phonecost'>￥2499.00</div></center>
    </div>
    <img style="float: left" src="image/addsign.jpg" width="70px" height="70px"/>
    <div style="float: left">
    <img src="image/2.jpg"><br>
    <center>
      <input type="checkbox" name="ck1" value="1">
      <div id='shellcost'>￥56.00</div>
    </center>
  </div>
    <img style="float: left" src="image/addsign.jpg" width="70px" height="70px"/>
    <div style="float: left">
      <img src="image/3.jpg"><br>
      <center>
        <input type="checkbox" name="ck2" value="1">
        <div id='linecost'>￥19.80</div>
      </center>
    </div>
    <img style="float: left" src="image/addsign.jpg" width="70px" height="70px"/>
    <div style="float: left">
      <img src="image/4.jpg"><br>
      <center>
        <input type="checkbox" name="ck3" value="1">
        <div id='chargecost'>￥30.90</div>
      </center>
    </div>
    <img style="float: left" src="image/addsign.jpg" width="70px" height="70px"/>
    <div style="float: left">
      <img src="image/5.jpg"><br>
      <center>
        <input type="checkbox" name="ck4" value="1">
        <div id='batterycost'>￥99.00</div>
      </center>
    </div>
  </form>

  <p>
    <input name="button" type="button" id="tj" value="放入购物车"/>
  </p>
  </body>
</html>
