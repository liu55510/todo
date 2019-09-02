<%--
  Created by IntelliJ IDEA.
  User: 刘春
  Date: 2019/5/20
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <table border="1">
        <c:forEach items="${allUser}" var="item">
            <tr>
                <td>${item.id}</td>
                <c:choose>
                    <c:when test="${item.id==1}">
                        <td>销售人员</td>
                    </c:when>
                    <c:when test="${item.id==2}">
                        <td>采购人员</td>
                    </c:when>
                    <c:when test="${item.id==3}">
                        <td>管理员</td>
                    </c:when>
                </c:choose>
                <td>${item.username}</td>
                <td>${item.password}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
