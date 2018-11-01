<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="ckeditor/ckeditor.js"></script>

            <div class="row">
                <form action="#" method="post" class="add-article-form" id="addArticleForm" autocomplete="off" onsubmit="return saveArticle();">
                <%--<form action="/addArticle.do" method="post" class="add-article-form">--%>
                    <div class="col-md-9">
                        <h1 class="page-header">撰写新文章</h1>
                        <div class="form-group">
                            <label for="aTitle" class="sr-only">标题</label>
                            <input type="text" id="aTitle" name="aTitle" class="form-control" placeholder="在此处输入标题" required autofocus autocomplete="off">
                        </div>
                        <div class="add-article-box">
                            <%--<h2 class="add-article-box-title"><span>内容</span></h2>--%>
                            <textarea name="aContent" id="editor1" rows="10" cols="80" autocomplete="off" class="form-control" required autofocus>

                            </textarea>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <h1 class="page-header">操作</h1>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>栏目</span></h2>
                            <div class="add-article-box-content">
                                <ul class="category-list" id="ul1">

                                </ul>
                            </div>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>标签</span></h2>
                            <div class="add-article-box-content">
                                <input type="text" class="form-control" placeholder="输入新标签" name="label" id="label" autocomplete="off" class="form-control" required autofocus >
                                <span class="prompt-text">多个标签请用英文逗号,隔开</span> </div>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>标题图片</span></h2>
                            <div class="add-article-box-content">

                                <%--<input type="image" id="imgs" src=""/>--%>
                                <input type="file" onchange="imageUpload(this)" class="form-control" placeholder="点击按钮选择图片" id="pictureUpload" name="titlepic" autocomplete="off" class="form-control" required autofocus>
                            </div>
                            <%--<div class="add-article-box-footer">--%>
                                <%--<button class="btn btn-default" type="button" ID="upImage">选择</button>--%>
                            <%--</div>--%>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>发布</span></h2>
                            <div class="add-article-box-content">
                                <p><label>状态：</label><span class="article-status-display">未发布</span></p>
                                <p><label>公开度：</label><input type="radio" name="aStatusBar" id="aStatusBar1" value="0" checked/>公开 <input type="radio" name="aStatusBar" id="aStatusBar2" value="1" />加密</p>
                                <%--<p><label>发布于：</label><span class="article-time-display"><input style="border: none;" type="datetime" name="aStatusBar" value="2016-01-09 17:29:37" /></span></p>--%>
                            </div>
                            <div class="add-article-box-footer">
                                <button class="btn btn-primary" type="submit" name="submit" onclick="aaa()">发布</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>

<script>
    //标题图片地址
    var img="";
    // 编辑器
    p_desc=CKEDITOR.replace( 'editor1' );
    console.log(p_desc.getData()); //取包含html代码的值
    function imageUpload(obj) {
        //解决C:\fakepath问题
        var oFReader = new FileReader();
        var file =obj.files[0];
        oFReader.readAsDataURL(file);
        oFReader.onloadend = function(oFRevent){
            var src = oFRevent.target.result;

            $('#aTitleImg').val(src);
        }
        //判断图片格式
        var fileName=obj.value;
        var suffixIndex=fileName.lastIndexOf(".");
        var suffix=fileName.substring(suffixIndex+1).toUpperCase();
        if(suffix!="BMP"&&suffix!="JPG"&&suffix!="JPEG"&&suffix!="PNG"&&suffix!="GIF"){
            layer.msg( "请上传图片（格式BMP、JPG、JPEG、PNG、GIF等）!");
            var file = $("#pictureUpload");
            file.after(file.clone().val(""));
            file.remove();
            return;
        }

        var formData = new FormData();
        formData.append('file', $('#pictureUpload')[0].files[0]);  //添加图片信息的参数
        $.ajax({
            type: "POST",
            url: "/fileUploadPage.do",
            data:formData,
            processData: false,
            contentType: false,
            // encType:"multipart/form-data",
            success: function(data) {
                img=data;
            }
        });

    }
    //提交
    function saveArticle() {
        var aStatusBar = $("input[name='aStatusBar']:checked").val();
        var pId = $("input[name='programa.pId']:checked").val();
        if (p_desc.getData()=="") {
            layer.msg("内容不能为空");
            return false;
        }
        $.ajax({
            type: "POST",
            // encType:"multipart/form-data",
            url: "/addArticle.do",
            data : {"aTitle":$("#aTitle").val(),"aContent":p_desc.getData(),"aTitleImg":img,"label":$("#label").val(),"aStatusBar":aStatusBar,"programa.pId":pId},
            dataType:"JSON",
            resultType:"JSON",
            success: function(data) {
            }
        });
        $('#addArticleForm').find('input[type=text],select,input[type=hidden]').each(function() {
            $(this).val('');
        });
        // porgramaDate();
        layer.msg("添加文章成功")
        $("#main").html("");
        $("#main").load("article.jsp");
        // return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
    }

    //栏目数据
    $.ajax({
        url:"/selevtPrograma.do",
        type:"post",
        data:{},
        dataType:"JSON",
        resultType:"JSON",
        // cache:false,
        async:true,
        success:function(data){
            $("#ul1").html("");
            $.each(data,function(i,val){
               i==1? $("#ul1").append("<li> <label><input name=\"programa.pId\" type=\"radio\" value=\""+val.pId+"\" checked> "+val.pName+"<em class=\"hidden-md\">( 栏目ID: <span>"+val.pId+"</span> )</em></label> </li>"):$("#ul1").append("<li> <label><input name=\"programa.pId\" type=\"radio\" value=\""+val.pId+"\" > "+val.pName+"<em class=\"hidden-md\">( 栏目ID: <span>"+val.pId+"</span> )</em></label> </li>")
            })
        }
    })
</script>
