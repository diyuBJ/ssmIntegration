<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--<link rel="stylesheet" href="js/validate/css/style.css" />--%>
            <h1 class="page-header">操作</h1>
            <ol class="breadcrumb">
                <li><a data-toggle="modal" onclick="showAddUser(1)">增加用户</a></li>
            </ol>
            <h1 id="bti" class="page-header">管理 </h1>
            <div id="tabs" class="table-responsive">
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th><span class="glyphicon glyphicon-th-large"></span><span class="visible-lg">ID</span></th>
                        <th><span class="glyphicon glyphicon-user"></span> <span class="visible-lg">用户名</span></th>
                        <th><span class="glyphicon glyphicon-bookmark"></span><span class="visible-lg">姓名</span></th>
                        <th><span class="glyphicon glyphicon-pushpin"></span><span class="visible-lg">文章</span></th>
                        <th><span class="glyphicon glyphicon-time"></span><span class="visible-lg">上次登录时间</span></th>
                        <th><span class="glyphicon glyphicon-pencil"></span><span class="visible-lg">操作</span></th>
                    </tr>
                    </thead>
                    <tbody id="talss">
                    <c:forEach var="adim" items="${sessionScope.administrators}">
                        <tr>
                            <td>${adim.UId}</td>
                            <td>${adim.UUserName}</td>
                            <td>${adim.UName}</td>
                            <td>${adim.articlesSumMap.sum}</td>
                            <td>${adim.administratorDeadline==null?'此管理员还没留下足迹.....':adim.administratorDeadline.log_time}</td>
                            <td><a rel="1" name="see">修改</a> <a rel="1" name="delete">删除</a>  <a id='${adim.UId}' onclick="forbidden('${adim.UId}')">禁用</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
<input type="hidden" id="sum" value="50">
<div id="adduser" style="display:none" ><!--style="display:none"-->

    <form action="##" id="adduserForm" method="post">
    <table class="table" style="margin-bottom:0px;">
        <td wdith="12%">姓&nbsp;&nbsp;&nbsp;名:</td>
        <td width="88%"><input type="text" value="" class="form-control" id="uname" name="uName" maxlength="12" autocomplete="off" /></td>
        </tr>
        <tr>
            <td wdith="12%">用户名:</td>
            <td width="88%"><input type="text" value="" class="form-control" id="username" name="uUserName" maxlength="13" autocomplete="off" /></td>
        </tr>
        <tr>
            <td wdith="12%">密&nbsp;&nbsp;&nbsp;码:</td>
            <td width="88%"><input type="password" class="form-control" id="upassword" name="uPassword" maxlength="16" autocomplete="off" /></td>
        </tr>
        <tr>
            <td wdith="12%">确认密码:</td>
            <td width="88%"><input type="password" class="form-control" id="new_password" name="new_password" maxlength="16" autocomplete="off" /></td>
    </table>
    <div class="modal-footer" >
        <button type="button" class="btn btn-default" data-dismiss="modal" onclick="showAddUser(2)">取消</button>
        <button type="button" id="submit" class="btn btn-primary">提交</button>
    </div>
    </form>
</div>


<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<!--表单验证-->
<script src="js/myJS/manage-user.js"></script>

</body>
</html>
