<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/Article/checkAll" method="post" >
    <h1 class="page-header">操作</h1>
    <ol class="breadcrumb">
        <li><a href="add-notice.jsp">增加公告</a></li>
    </ol>
    <h1 class="page-header">管理 <span class="badge">3</span></h1>
    <div class="table-responsive">
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">标题</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="checkbox" class="input-control" name="checkbox[]" value="" /></td>
                <td class="article-title">这是测试的公告标题这是测试的公告标题这是测试的公告标题这是测试的公告标题</td>
                <td>2015-12-03</td>
                <td><a href="">修改</a> <a rel="6">删除</a></td>
            </tr>
            <tr>
                <td><input type="checkbox" class="input-control" name="checkbox[]" value="" /></td>
                <td class="article-title">这是测试的公告标题这是测试的公告标题这是测试的公告标题这是测试的公告标题</td>
                <td>2015-12-03</td>
                <td><a href="">修改</a> <a rel="6">删除</a></td>
            </tr>
            <tr>
                <td><input type="checkbox" class="input-control" name="checkbox[]" value="" /></td>
                <td class="article-title">这是测试的公告标题这是测试的公告标题这是测试的公告标题这是测试的公告标题</td>
                <td>2015-12-03</td>
                <td><a href="">修改</a> <a rel="6">删除</a></td>
            </tr>
            </tbody>
        </table>
    </div>
    <footer class="message_footer">
        <nav>
            <div class="btn-toolbar operation" role="toolbar">
                <div class="btn-group" role="group"> <a class="btn btn-default" onClick="select()">全选</a> <a class="btn btn-default" onClick="reverse()">反选</a> <a class="btn btn-default" onClick="noselect()">不选</a> </div>
                <div class="btn-group" role="group">
                    <button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</button>
                </div>
            </div>
            <ul class="pagination pagenav">
                <li class="disabled"><a aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
                <li class="active"><a>1</a></li>
                <li class="disabled"><a aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
        </nav>
    </footer>
</form>




<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<script>
    //是否确认删除
    $(function(){
        $("#main table tbody tr td a").click(function(){
            var name = $(this);
            var id = name.attr("rel"); //对应id
            if (event.srcElement.outerText == "删除")
            {
                if(window.confirm("此操作不可逆，是否确认？"))
                {
                    $.ajax({
                        type: "POST",
                        url: "/Article/delete",
                        data: "id=" + id,
                        cache: false, //不缓存此页面
                        success: function (data) {
                            window.location.reload();
                        }
                    });
                };
            };
        });
    });
</script>


