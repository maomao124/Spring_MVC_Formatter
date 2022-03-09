<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_Formatter
  File name(文件名): addUser
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/9
  Time(创建时间)： 12:54
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test1" method="post">
    用户名：<input type="text" name="name"/>
    <br>
    年龄：<input type="text" name="age"/>
    <br>
    身高：<input type="text" name="height"/>
    <br>
    创建日期：<input type="text" name="createDate"/>
    <br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
