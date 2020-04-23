<%--
  Created by IntelliJ IDEA.
  User: 大名：斯巴达
  Date: 2020/4/14
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="admin/login" method="post"/>
    <div >
        <label for="name">用户名：</label>
        <input type="text"  id="name" name="adminName" placeholder="请输入用户名"/>
    </div>
    <div >
        <label for="name">密码：</label>
        <input type="password"  id="password" name="password" placeholder="请输入密码"/>
    </div>
    <div>
        <input type="submit" value="登录"/>
    </div>
    <div style="color:red">${error_msg}</div>
</form>
</body>
</html>
