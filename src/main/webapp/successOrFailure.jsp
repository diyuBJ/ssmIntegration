<%--
  Created by IntelliJ IDEA.
  User: Geni
  Date: 2018/10/22
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    function goTo(url){
        //延迟三秒后弹出“延迟3秒执行！”
        var timeout = setTimeout(function () {
            location=url; //延迟5秒后执行
        },5000)
    }
</script>
<body>
<input type="hidden" id="yc"/>
<c:if test="${requestScope.state == 'success' }">
成功！
</c:if>
<c:if test="${requestScope.state == 'failure' }">
失败！
</c:if>
<br/>
<h1></h1>

</body>
<script type="text/javascript">
    goTo(document.getElementById("yc"));
</script>
</html>
