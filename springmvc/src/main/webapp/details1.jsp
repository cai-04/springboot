<%--
  Created by IntelliJ IDEA.
  User: 2013040544-qishijie
  Author:cai4
  Date: 2022/10/14
  Time: 23:23
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
      <td>书籍编号</td>
      <td>书籍名称</td>
      <td>单价</td>
</tr>
    <c:forEach items="${user}" var="user">
  <tr>
    <td>
      <c:out value=" ${user.b_id}"> </c:out>
    </td>
    <td>
      <c:out value=" ${user.b_name}"> </c:out>
    </td>
    <td>
    <c:out value=" ${user.b_price}"> </c:out>
  </td>
  </tr>
</c:forEach>
</table>
</div>
</body>
</html>
