<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
            <div class="row">
                <div class="col-md-5" id="category1">
                    <h1 class="page-header">添加</h1>
                    <form action="#" method="post" id="showDataForm" autocomplete="off" onsubmit="return saveReport();">
                        <div class="form-group">
                            <label for="category-name">栏目名称</label>
                            <input type="text" id="category-name" name="pName" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
                            <span class="prompt-text">这将是它在站点上显示的名字。</span> </div>
                        <div class="form-group">
                            <label for="category-alias">栏目别名</label>
                            <input type="text" id="category-alias" name="pAlias" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
                            <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
                        <div class="add-article-box-content">
                            <p><label>状态：</label><input type="radio" name="pState" value="1" checked/>公开 <input type="radio" name="pState" value="0" />隐藏</p>
                        </div>
                        <button class="btn btn-primary" type="submit" name="submit">添加新栏目</button>
                    </form>
                </div>
                <div class="col-md-7">
                    <h1 class="page-header">管理 <span class="badge" id="sp1">${programas.size()}</span></h1>
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
                            <tbody id="tbo1">

                            <%--<c:forEach items="${programas}" var="i">--%>
                                <%--<tr>--%>
                                    <%--<td>${i.PId}</td>--%>
                                    <%--<td>${i.PName}</td>--%>
                                    <%--<td>${i.PAlias}</td>--%>
                                    <%--<td>${i.articleList.size()}</td>--%>
                                    <%--<td><a href="#" onclick="loadscategory('update-category.jsp')">修改</a> <a rel="1">删除</a></td>--%>
                                <%--</tr>--%>
                            <%--</c:forEach>--%>
                            </tbody>
                        </table>
                        <span class="prompt-text"><strong>注：</strong>删除一个栏目也会删除栏目下的文章,请谨慎删除!</span> </div>
                </div>
            </div>
        </div>
    </div>
</section>

<script src="js/bootstrap.min.js"></script>
<script src="js/admin-scripts.js"></script>
<script>


    //导入页 面
    function loadscategory(url,id) {
        localStorage.pid=id;
        $("#category1").html("");
        $("#category1").load(url);
    }
    function saveReport() {
        $.ajax({
            type: "POST",
            url: "/addPrograma.do",
            data : $('#showDataForm').serializeArray(),
            dataType:"JSON",
            resultType:"JSON",
            success: function(data) {
            }
        });
        $('#showDataForm').find('input[type=text],select,input[type=hidden]').each(function() {
            $(this).val('');
        });
        porgramaDate();
        layer.msg("添加栏目成功")
        $("#main").html("");
        $("#main").load("category.jsp");
        // return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
    }

    function porgramaDate(){
        console.log("selevtPrograma1")
        //栏目数据
        $.ajax({
            url:"/selevtPrograma.do",
            type:"post",
            data:{},
            dataType:"JSON",
            resultType:"JSON",
            // cache:false,
            async:false,
            success:function(data){
                $("#tbo1").html("");
                $("#sp1").html(data.length)
                $.each(data,function(i,val){
                    $("#tbo1").append("<tr><td>"+(i+1)+"</td><td>"+val.pName+"</td><td>"+val.pAlias+"</td><td>"+val.articleList.length+"</td><td><a href=\"#\" onclick=\"loadscategory('update-category.jsp','"+val.pId+"')\">修改</a> <a href=\"#\" onclick=\"del("+val.pId+")\">删除</a></td></tr>")
                })
            }
        })
        console.log("selevtPrograma2")
    }
    //绑数据
    porgramaDate();


    //是否确认删除
    function del(pid) {
        layer.msg('您真的要删除此栏目吗？</br>栏目文章也会删掉哦！', {
            time: 20000, //20s后自动关闭
            anim:0, //窗体弹出的效果 0~6
            btn: ['点错了', '确认删除'],
            offset: [
                150 //高(y)
                ,600 //宽(x)
            ],
            btn1: function (index, layero) {
                // alert("取消")
                layer.close(index); //如果设定了yes或者btn1回调，需进行手工关闭
            },
            btn2: function(index, layero){
                $.ajax({
                    url:"/delPrograma.do",
                    type:"post",
                    data:{"pId":pid},
                    dataType:"JSON",
                    resultType:"JSON",
                    success:function(data){

                    }
                })
                console.log("删除")
                layer.msg('删除成功');
                porgramaDate();
                $("#main").html("");
                $("#main").load("category.jsp");

            }
        });
    }
</script>


