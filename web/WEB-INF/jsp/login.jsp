<%--
  Created by IntelliJ IDEA.
  User: 刘春
  Date: 2019/5/15
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            width: 500px;
            height: 300px;
            margin: 0 auto;
        }
        h2,form{
            margin: 30px 80px;
        }
        form ul li{
            list-style: none;
            line-height: 40px;
        }
    </style>
    <script type="text/javascript" src="../plugins/jquery-3.4.0.js"></script>
</head>
<body>
<h2>登录界面</h2>
<form action="/login" method="post">
    <ul>
        <li>用户名：<input type="text" name="username"><label class="error" style="display: none"></label></li>
        <li>密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"></li>
        <li><input id="login" type="submit" value="登录" style="margin-left: 100px;width: 50px"></li>
    </ul>
</form>
<script type="text/javascript">
    function checkUserName() {
        $.ajax({
            url:"/check",
            data:{username:$("[name=username]").val()},
            dataType:"json",
            success:function (data) {
                if(data&&data.check){
                    $("label.error").text("用户存在").css({"display":"inline","color":"green"});
                }else {
                    $("label.error").text("用户不存在").css({"display":"inline","color":"red"});
                }
            }
        })
    }
    $("[name=username]").blur(checkUserName);
</script>
</body>
</html>
