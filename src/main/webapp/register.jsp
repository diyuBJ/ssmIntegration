<%--
  Created by IntelliJ IDEA.
  User: Geni
  Date: 2018/10/22
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="add.do" method="post">
    姓名：<input type="text" name="sname"/><br/>
    性别：男<input type="radio" name="ssex" value="1"/>女<input type="radio" name="ssex" value="0"/><br/>
    年龄：<input type="text" name="sage"/><br/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
