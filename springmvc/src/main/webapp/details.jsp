<%--
  Created by IntelliJ IDEA.
  User: 2013040544-qishijie
  Author:cai4
  Date: 2022/10/14
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <table border="1">
        <tr>
            <td>标签</td>
            <td>值</td>
        </tr>

        <tr>
            <td>书籍编号</td>
            <td><c:out value="${user.b_id}"> </c:out></td>
        </tr>
        <tr>
            <td>书籍名称</td>
            <td><c:out value="${user.b_name}"> </c:out></td>
        </tr>
        <tr>
            <td>单价</td>
            <td><c:out value="${user.b_price}"> </c:out></td>
        </tr>
    </table>
</div>
</body>
</html>
