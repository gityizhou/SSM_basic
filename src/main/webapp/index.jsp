<%--
  Created by IntelliJ IDEA.
  User: ZhouYi
  Date: 2019/8/4
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>

    <a href="account/findAll">测试</a>

<form action="account/save" method="post">
    姓名：<input type="text" name="name"/> <br/>
    金额：<input type="text" name="money"/> <br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
