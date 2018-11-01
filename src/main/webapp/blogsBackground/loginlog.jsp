<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
            <h1 class="page-header">操作</h1>
            <ol class="breadcrumb">
                <li><a onclick="ifDeleteAll('',null,2)">清除所有登录记录</a></li>
                <li><a onclick="ifDeleteAll('${sessionScope.administrator.UUserName}','${sessionScope.administrator.UId}',1);">清除本人登录记录</a></li>
            </ol>
            <h1 class="page-header">管理 <span class="badge">${sessionScope.logSum==null ? 0 : sessionScope.logSum}</span></h1>
            <div class="table-responsive">
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">ID</span></th>
                        <th><span class="glyphicon glyphicon-user"></span> <span class="visible-lg">用户</span></th>
                        <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">时间</span></th>
                        <th><span class="glyphicon glyphicon-adjust"></span> <span class="visible-lg">IP</span></th>
                        <th><span class="glyphicon glyphicon-remove"></span> <span class="visible-lg">操作</span></th>
                    </tr>
                    </thead>
                    <tbody id="tbl">
                    <c:forEach var="l" items="${sessionScope.logList}">
                        <tr>
                            <td>${l.logId}</td>
                            <td class="article-title">${l.administrator.UUserName}</td>
                            <td>${l.logTime}</td>
                            <td>${l.logIp}</td>
                            <td><a rel="1" onclick="ifDelete('${l.administrator.UUserName}',${l.logId})">删除</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div id="tsData">
                    <c:if test="${sessionScope.logSum<1}">

                        <h2 style="text-align: center;">没有相关数据....</h2>

                    </c:if>
                </div>
            </div>

            <footer class="message_footer">
                <nav>
                    <ul id="fye" class="pagination pagenav">
                        <c:if test="${sessionScope.logSum>=1}">
                            <div id="demo3"></div>
                        </c:if>
                    </ul>
                </nav>
            </footer>
<input type="hidden" id="sum" value="${sessionScope.logSum==null ? 0 : sessionScope.logSum}">
<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<script src="js/myJS/loginlog.js"></script>
</body>
</html>
