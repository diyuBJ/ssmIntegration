<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="ckeditor/ckeditor.js"></script>
            <div class="row">
                <form action="/Article/update" method="post" class="add-article-form">
                    <div class="col-md-9">
                        <h1 class="page-header">文章修改</h1>
                        <div class="form-group">
                            <label for="article-title" class="sr-only">标题</label>
                            <input type="text" id="article-title" name="title" class="form-control" placeholder="在此处输入标题" required autofocus autocomplete="off">
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>内容</span></h2>
                            <textarea name="editor1" id="editor1" rows="10" cols="80">
                                这是测试的文章内容这是测试的文章内容这是测
                                试的文章内容这是测试的文章内容这是测试的文章内
                                容这是测试的文章内容这是测试的文章内容这是测试的
                                文章内容这是测试的文章内容这是测试的文章内容这是测
                                试的文章内容这是测试的文章内容这是测试的文章内容这是测
                                试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文
                                章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测
                                试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测
                                试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文
                                章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是
                                测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章
                                内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的
                                文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容这是
                                测试的文章内容这是测试的文章内容这是测试的文章内容这是测试的文章内容.
                            </textarea>
                            </div>

                    </div>
                    <div class="col-md-3">
                        <h1 class="page-header">操作</h1>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>栏目</span></h2>
                            <div class="add-article-box-content">
                                <ul class="category-list">
                                    <li>
                                        <label>
                                            <input name="category" type="radio" value="1">
                                            这是栏目 <em class="hidden-md">( 栏目ID: <span>1</span> )</em></label>
                                    </li>
                                    <li>
                                        <label>
                                            <input name="category" type="radio" value="2">
                                            这是栏目 <em class="hidden-md">( 栏目ID: <span>2</span> )</em></label>
                                    </li>
                                    <li>
                                        <label>
                                            <input name="category" type="radio" value="3" checked>
                                            这是栏目 <em class="hidden-md">( 栏目ID: <span>3</span> )</em></label>
                                    </li>
                                    <li>
                                        <label>
                                            <input name="category" type="radio" value="4">
                                            这是栏目 <em class="hidden-md">( 栏目ID: <span>4</span> )</em></label>
                                    </li>
                                    <li>
                                        <label>
                                            <input name="category" type="radio" value="5">
                                            这是栏目 <em class="hidden-md">( 栏目ID: <span>5</span> )</em></label>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>标签</span></h2>
                            <div class="add-article-box-content">
                                <input type="text" class="form-control" placeholder="输入新标签" value="测试,文章" name="tags" autocomplete="off">
                                <span class="prompt-text">多个标签请用英文逗号,隔开</span> </div>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>标题图片</span></h2>
                            <div class="add-article-box-content">
                                <input type="text" class="form-control" placeholder="点击按钮选择图片" id="pictureUpload" name="titlepic" autocomplete="off">
                            </div>
                            <div class="add-article-box-footer">
                                <button class="btn btn-default" type="button" ID="upImage">选择</button>
                            </div>
                        </div>
                        <div class="add-article-box">
                            <h2 class="add-article-box-title"><span>发布</span></h2>
                            <div class="add-article-box-content">
                                <p><label>状态：</label><span class="article-status-display">已发布</span></p>
                                <p><label>公开度：</label><input type="radio" name="visibility" value="0" checked/>公开 <input type="radio" name="visibility" value="1" />加密</p>
                                <p><label>发布于：</label><span class="article-time-display"><input style="border: none;" type="datetime" name="time" value="2016-01-09 17:29:37" /></span></p>
                            </div>
                            <div class="add-article-box-footer">
                                <button class="btn btn-primary" type="submit" name="submit">更新</button>
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
