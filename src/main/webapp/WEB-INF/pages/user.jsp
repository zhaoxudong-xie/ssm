<%--
  Created by IntelliJ IDEA.
  User: 大名：斯巴达
  Date: 2020/5/15
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <label for="name">姓名：</label>
    <input type="text"  id="name" name="name" value="${user.name}"/>
</div>

<div >
    <label>性别：</label>
    <input type="text"  id="sex" name="sex" value="${user.sex}"/>
</div>

<div >
    <label for="age">年龄：</label>
    <input type="text"  id="age" name="age" value="${user.age}"/>
</div>

<div >
    <label>学号：</label>
    <input type="text" id="stuId" name="stuId" value="${user.stuId}"/>
</div>

<div >
    <label for="qq">QQ：</label>
    <input type="text"  id="qq" name="qq" value="${user.qq}"/>
</div>

<div >
    <label for="email">Email：</label>
    <input type="text"  id="email" name="email" value="${user.email}"/>
</div>
<div>
    <a href="/user/update?id=${sid}">更新信息</a>
</div>
</body>
</html>
