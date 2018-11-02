<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
            <h1 class="page-header">修改栏目</h1>
<form action="#" method="post" id="showDataForm1" autocomplete="off" onsubmit="return updateReport();">
                <div class="form-group">
                    <label for="pName">栏目名称</label>
                    <input type="hidden" value="" id="pId" name="pId"/>
                    <input type="text" id="pName" name="pName" value="" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
                    <span class="prompt-text">这将是它在站点上显示的名字。</span> </div>
                <div class="form-group">
                    <label for="pAlias">栏目别名</label>
                    <input type="text" id="pAlias" name="pAlias" value="" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
                    <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
                <div class="add-article-box-content">
                    <p><label>状态：</label><input type="radio" id="pState1" name="pState" value="1" />公开 <input type="radio" id="pState2" name="pState" value="0" />隐藏</p>
                </div>
                <button class="btn btn-primary" type="submit" name="submit">更新</button>
            </form>
<script>
    $("#pName").blur(function(){
        var value=$(this).val();
        if(value.length>18){
            $(this).val("");
            layer.msg('栏目名称只能输入18个字符');
        }
    });
    $("#pAlias").blur(function(){
        var value=$(this).val();
        var regex = /^[a-zA-Z0-9][\w-]{1,18}$/g;
        if(!regex.test(value)){
            $(this).val("");
            layer.msg('长度18个字符,只能包含字母,数字和连字符（-）');
        }
    });
    $.ajax({
        type: "POST",
        url: "/getProgramaById.do",
        data : {"pId":localStorage.pid},
        dataType:"JSON",
        resultType:"JSON",
        success: function(data) {
            //清空数据
            localStorage.clear();
            $("#pId").val(data.pId);
            $("#pName").val(data.pName);
            $("#pAlias").val(data.pAlias);
            if(data.pState==1){
                $("#pState1").attr("checked",'checked');
            }else{
                $("#pState2").attr("checked",'checked');
            }

        }
    });

    function updateReport() {
        $.ajax({
            type: "POST",
            url: "/updatePrograma.do",
            data : $('#showDataForm1').serializeArray(),
            async:true,
            success: function(data) {
                $('#showDataForm1').find('input[type=text],select,input[type=hidden]').each(function() {
                    $(this).val('');
                });
                layer.msg("修改栏目成功")
                $("#main").html("");
                $("#main").load("category.jsp");
            }
        });
        return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
    }
</script>