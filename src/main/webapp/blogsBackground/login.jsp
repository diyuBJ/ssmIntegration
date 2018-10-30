
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>异清轩博客管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="apple-touch-icon-precomposed" href="images/icon/icon.png">
    <link rel="shortcut icon" href="images/icon/favicon.ico">

    <!--弹窗 start-->
    <script src="js/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="layer/layer.js"></script>
    <!--弹窗 end-->

    <script src="js/jquery-2.1.4.min.js"></script>
    <!--[if gte IE 9]>
    <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
    <script src="js/html5shiv.min.js" type="text/javascript"></script>
    <script src="js/respond.min.js" type="text/javascript"></script>
    <script src="js/selectivizr-min.js" type="text/javascript"></script>
    <![endif]-->
    <!--[if lt IE 9]>
    <script>window.location.href='upgrade-browser.jsp';</script>
    <![endif]-->
</head>

<body class="user-select">
<div class="container">
    <div class="siteIcon"><img src="images/icon/icon.png" alt="" data-toggle="tooltip" data-placement="top" title="欢迎使用radish博客管理系统" draggable="false" /></div>
    <form action="/login.do" method="post" autocomplete="off" class="form-signin">
        <h2 class="form-signin-heading">管理员登录</h2>
        <label for="userName" class="sr-only">用户名</label>
        <input type="text" id="userName" name="uUserName" class="form-control" placeholder="请输入用户名" required autofocus autocomplete="off" maxlength="10">
        <label for="userPwd" class="sr-only">密码</label>
        <input type="password" id="userPwd" name="uPassword" class="form-control" placeholder="请输入密码" required autocomplete="off" maxlength="18">
        <a href="main.jsp"><button class="btn btn-lg btn-primary btn-block" type="submit" id="signinSubmit">登录</button></a>
    </form>

    <c:if test="${sessionScope.comeToNothing!=null}">
        <script type="text/javascript">
            //弹出一个提示层(登录失败提示)
            layer.msg('错误的用户名或密码！',{
                offset: [
                    230 //高(y)
                    ,505 //宽(x)
                ],
            });
        </script>
    </c:if>

</div>

<script src="js/bootstrap.min.js"></script>
<script>
    $('[data-toggle="tooltip"]').tooltip();
    window.oncontextmenu = function(){
        //return false ;
    };
    $('.siteIcon img').click(function(){
        window.location.reload();
    });
    $('#signinSubmit').click(function(){
        if($('#userName').val() === ''){
            $(this).text('用户名不能为空');
        }else if($('#userPwd').val() === ''){
            $(this).text('密码不能为空');
        }else{
            $(this).text('请稍后...');
        }
    });
</script>
</body>
</html>

