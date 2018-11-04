<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--<form action="/Article/checkAll" method="post" >--%>
    <h1 class="page-header">操作</h1>
    <ol class="breadcrumb">
        <li><a href="#" onclick="loads('add-article.jsp')">增加文章</a></li>
    </ol>
    <h1 class="page-header">管理 <span class="badge" id="span1">${articlesum}</span></h1>
    <input type="hidden" id="asum" value="${articlesum}"/>
    <div class="table-responsive">
            <div class="input-group">
                <input type="text" id="criteria" class="form-control" style="width:330px" autocomplete="off" placeholder="键入关键字搜索" maxlength="20">
                <input type="hidden" id="criteria1" value=""/>
                <a  class="btn btn-default" onclick="z()">搜索</a>
            </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">标题</span></th>
                <th><span class="glyphicon glyphicon-list"></span> <span class="visible-lg">栏目</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-tag"></span> <span class="visible-lg">标签</span></th>
                <th class="hidden-sm"><span class="glyphicon glyphicon-star"></span> <span class="visible-lg">状态</span></th>
                <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">日期</span></th>
                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
            </tr>
            </thead>
            <tbody id="atbody">
            <c:forEach items="${sessionScope.articles}" var="i">
                <tr>
                    <td><input type="checkbox" class="input-control" name="checkbox[]" value="${i.AId}" /></td>
                    <td class="article-title">${i.ATitle}</td>
                    <td>${i.programa.PName}</td>
                    <td class="hidden-sm">${i.label}</td>
                    <td class="hidden-sm">${i.AStatusBar==1?"公开":"隐藏"}</td>
                    <td>${i.ATime}</td>
                    <td><a href="#" onclick="loads('update-article.jsp')">修改</a> <a onclick="delArticle('${i.AId}')">删除</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <footer class="message_footer">
        <nav>
            <div class="btn-toolbar operation" role="toolbar">
                <div class="btn-group" role="group"> <a class="btn btn-default" onClick="select()">全选</a> <a class="btn btn-default" onClick="reverse()">反选</a> <a class="btn btn-default" onClick="noselect()">不选</a> </div>
                <div class="btn-group" role="group">
                    <a class="btn btn-default" onclick="delselect()" title="删除全部选中" >删除</a>
                </div>
            </div>
            <div id="articleDemo"></div>
        </nav>
    </footer>
<%--</form>--%>


<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/article.js"></script>



