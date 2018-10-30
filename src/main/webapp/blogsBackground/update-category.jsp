<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
            <h1 class="page-header">修改栏目</h1>
            <form action="/Category/update" method="post">
                <div class="form-group">
                    <label for="category-name">栏目名称</label>
                    <input type="text" id="category-name" name="name" value="前端技术" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
                    <span class="prompt-text">这将是它在站点上显示的名字。</span> </div>
                <div class="form-group">
                    <label for="category-alias">栏目别名</label>
                    <input type="text" id="category-alias" name="alias" value="web" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
                    <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
                <button class="btn btn-primary" type="submit" name="submit">更新</button>
            </form>
