<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="ckeditor/ckeditor.js"></script>
            <div class="row">
                <form action="test.php" method="post" class="add-article-form">
                    <div class="col-md-9">
                        <h1 class="page-header">撰写新公告</h1>
                        <div class="form-group">
                            <label for="article-title" class="sr-only">标题</label>
                            <input type="text" id="article-title" name="title" class="form-control" placeholder="在此处输入标题" required autofocus autocomplete="off">
                        </div>
                        <div class="form-group">
                            <label for="editor1" class="sr-only">内容</label>
                            <textarea name="editor1" id="editor1" rows="10" cols="80"></textarea>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>关键字</span></h2>
                            <div class="add-article-box-content">
                                <input type="text" class="form-control" placeholder="请输入关键字" name="keywords" autocomplete="off">
                                <span class="prompt-text">多个标签请用英文逗号,隔开。</span>
                            </div>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>描述</span></h2>
                            <div class="add-article-box-content">
                                <textarea class="form-control" name="describe" autocomplete="off"></textarea>
                                <span class="prompt-text">描述是可选的手工创建的内容总结，并可以在网页描述中使用</span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <h1 class="page-header">操作</h1>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>发布</span></h2>
                            <div class="add-article-box-content">
                                <p><label>状态：</label><span class="article-status-display">未发布</span></p>
                                <p><label>公开度：</label><input type="radio" name="visibility" value="0" checked/>公开 <input type="radio" name="visibility" value="1" />加密</p>
                                <p><label>发布于：</label><span class="article-time-display"><input style="border: none;" type="datetime" name="time" value="2016-01-09 17:29:37" /></span></p>
                            </div>
                            <div class="add-article-box-footer">
                                <button class="btn btn-primary" type="submit" name="submit" onclick="a()">发布</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
<script>
    // Replace the <textarea id="editor1"> with a CKEditor
    // instance, using default configuration.
    p_desc=CKEDITOR.replace( 'editor1' );
    console.log(p_desc.getData()); //取包含html代码的值
</script>

