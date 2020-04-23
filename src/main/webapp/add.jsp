<%--
  Created by IntelliJ IDEA.
  User: 大名：斯巴达
  Date: 2020/4/10
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学员</title>
</head>
<body>
<form action="user/addUser" method="post">
    <div >
        <label for="name">姓名：</label>
        <input type="text"  id="name" name="name" placeholder="请输入姓名">
    </div>

    <div >
        <label>性别：</label>
        <input type="radio" name="sex" value="男" checked="checked"/>男
        <input type="radio" name="sex" value="女"/>女
    </div>

    <div >
        <label for="age">年龄：</label>
        <input type="text"  id="age" name="age" placeholder="请输入年龄">
    </div>

    <div >
        <label>学号：</label>
        <input type="text" id="stuId" name="stuId" placeholder="请输入姓名">
    </div>

    <div >
        <label for="qq">QQ：</label>
        <input type="text"  id="qq" name="qq" placeholder="请输入QQ号码"/>
    </div>

    <div >
        <label for="email">Email：</label>
        <input type="text"  id="email" name="email" placeholder="请输入邮箱地址"/>
    </div>
        <input type="submit" value="提交" />
        <input  type="reset" value="重置" />
        <input  type="button" value="返回" />
</form>
</body>
</html>
