<%--
  Created by IntelliJ IDEA.
  User: 大名：斯巴达
  Date: 2020/4/10
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
  <head>
    <title>展示学员</title>
    <script src="../../js/jquery-2.1.0.min.js"></script>
  </head>
  <body>
  <table border="1" >
    <tr>
      <th>姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>学号</th>
      <th>QQ</th>
      <th>邮箱</th>
    </tr>
      <c:forEach items="${list}" var="user">
          <tr>
              <td>${user.name}</td>
              <td>${user.sex}</td>
              <td>${user.age}</td>
              <td>${user.stuId}</td>
              <td>${user.qq}</td>
              <td>${user.email}</td>
          </tr>
      </c:forEach>
      <div style="color:red">欢迎您：${admin}</div>
  </table>
  </body>
</html>
