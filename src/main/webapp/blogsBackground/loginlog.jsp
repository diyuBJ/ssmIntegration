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
                <li><a href="/Loginlog/delete/action/all">清除所有登录记录</a></li>
                <li><a href="/Loginlog/delete/action/current">清除本人登录记录</a></li>
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
                            <td><a rel="1">删除</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <footer class="message_footer">
                <nav>
                    <ul class="pagination pagenav">
                        <div id="demo3"></div>
                    </ul>
                </nav>
            </footer>
<input type="hidden" id="sum" value="${sessionScope.logSum==null ? 0 : sessionScope.logSum}">
<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<script>
    layui.use(['laypage', 'layer'], function() {
        var laypage = layui.laypage
            , layer = layui.layer;
        //自定义首页、尾页、上一页、下一页文本
        laypage.render({
            elem: 'demo3'
            ,theme: '#1E9FFF' //自定义颜色
            ,count: $("#sum").val() //总记录数，从服务端得到
            ,layout: [ 'prev', 'page', 'next', 'limit'] //开启的功能
            ,limit: 10//每页显示记录数
            ,limits:[10, 20, 30]
            ,first: '首页'
            ,last: '末页'
            ,prev: '<em>«</em>'
            ,next: '<em>»</em>'
            ,jump: function(obj, first){//回调
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数
                //首次不执行
                if(!first){
                    // do something
                    $.ajax({
                        type: 'post',
                        url:"/trackmod.do",
                        data: {"curr":obj.curr,"limit":obj.limit},
                        async:true,
                        datatype:"json",
                        resultType:"json",
                        cache:false, //不缓存此页面
                        success:function (data){
                            // console.log(data);
                            var lists= JSON.parse(data);
                            var vals='';
                            for (obj in lists){
                               vals=vals+ "<tr> <td>"+lists[obj].logId+"</td> <td class='article-title'>"+lists[obj].administrator.uUserName+"</td> <td>"+lists[obj].logTime+"</td> <td>"+lists[obj].logIp+"</td> <td><a rel='1'>删除</a></td> </tr>"
                            }
                            $("#tbl").html(vals);
                        }
                    });
                }
            }
        });
    });



</script>
</body>
</html>
