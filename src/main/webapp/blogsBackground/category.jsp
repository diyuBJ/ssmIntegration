<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

            <div class="row">
                <div class="col-md-5" id="category1">
                    <h1 class="page-header">添加</h1>
                    <form action="/Category/add" method="post" autocomplete="off">
                        <div class="form-group">
                            <label for="category-name">栏目名称</label>
                            <input type="text" id="category-name" name="name" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
                            <span class="prompt-text">这将是它在站点上显示的名字。</span> </div>
                        <div class="form-group">
                            <label for="category-alias">栏目别名</label>
                            <input type="text" id="category-alias" name="alias" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
                            <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
                        <%--<div class="form-group">--%>
                            <%--<label for="category-fname">父节点</label>--%>
                            <%--<select id="category-fname" class="form-control" name="fid">--%>
                                <%--<option value="0" selected>无</option>--%>
                                <%--<option value="1">前端技术</option>--%>
                                <%--<option value="2">后端程序</option>--%>
                                <%--<option value="3">管理系统</option>--%>
                                <%--<option value="4">授人以渔</option>--%>
                                <%--<option value="5">程序人生</option>--%>
                            <%--</select>--%>
                            <%--<span class="prompt-text">栏目是有层级关系的，您可以有一个“音乐”分类目录，在这个目录下可以有叫做“流行”和“古典”的子目录。</span> </div>--%>
                        <div class="add-article-box-content">
                            <p><label>状态：</label><input type="radio" name="visibility" value="0" checked/>公开 <input type="radio" name="visibility" value="1" />隐藏</p>
                        </div>
                        <button class="btn btn-primary" type="submit" name="submit">添加新栏目</button>
                    </form>
                </div>
                <div class="col-md-7">
                    <h1 class="page-header">管理 <span class="badge">3</span></h1>
                    <div class="table-responsive">
                        <table class="table table-striped table-hover">
                            <thead>
                            <tr>
                                <th><span class="glyphicon glyphicon-paperclip"></span> <span class="visible-lg">ID</span></th>
                                <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">名称</span></th>
                                <th><span class="glyphicon glyphicon-list-alt"></span> <span class="visible-lg">别名</span></th>
                                <th><span class="glyphicon glyphicon-pushpin"></span> <span class="visible-lg">总数</span></th>
                                <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>前端技术</td>
                                <td>web</td>
                                <td>125</td>
                                <td><a href="#" onclick="loadscategory('update-category.jsp')">修改</a> <a rel="1">删除</a></td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>后端程序</td>
                                <td>program</td>
                                <td>185</td>
                                <td><a href="#" onclick="loadscategory('update-category.jsp')">修改</a> <a rel="2">删除</a></td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>管理系统</td>
                                <td>cms</td>
                                <td>223</td>
                                <td><a href="update-category.jsp">修改</a> <a rel="3">删除</a></td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>授人以渔</td>
                                <td>tutorial</td>
                                <td>12</td>
                                <td><a href="update-category.jsp">修改</a> <a rel="4">删除</a></td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>程序人生</td>
                                <td>code</td>
                                <td>35</td>
                                <td><a href="update-category.jsp">修改</a> <a rel="5">删除</a></td>
                            </tr>
                            </tbody>
                        </table>
                        <span class="prompt-text"><strong>注：</strong>删除一个栏目也会删除栏目下的文章和子栏目,请谨慎删除!</span> </div>
                </div>
            </div>
        </div>
    </div>
</section>

<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<script>
    //是否确认删除
    $(function(){
        $("#main table tbody tr td a").click(function(){
            var name = $(this);
            var id = name.attr("rel"); //对应id
            if (event.srcElement.outerText === "删除")
            {
                if(window.confirm("此操作不可逆，是否确认？"))
                {
                    $.ajax({
                        type: "POST",
                        url: "/Category/delete",
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

    //导入页 面
    function loadscategory(url) {
        $("#category1").html("");
        $("#category1").load(url);
    }
    $.ajax({
        url:"/selevtPrograma.do",
        type:"POST",
        data:{},
        dataType:"JSON",
        resultType:"JSON",
        success:function(data){
            $.each(data,function(i,val){
                alert(val.pName)
            })
        }
    })
</script>


