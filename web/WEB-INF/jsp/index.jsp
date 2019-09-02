<%--
  Created by IntelliJ IDEA.
  User: 刘春
  Date: 2019/4/22
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span>111111111111111111111111</span>
<h1>用户登录</h1>
<form action="/user/file/upload" name="upload" enctype="multipart/form-data" method="post">
    文件：<input type="file" name="files"/><br>
    <%--用户名：<input type="text" name="userName"><br>
    密码：<input type="password" name="passWord"><br>
    <input type="submit" value="提 交">--%>
    <input type="submit" value="上 传"/>
    <%--<input type="button" value="重 置">--%>
</form>
</body>
</html>
