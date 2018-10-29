<%--
  Created by IntelliJ IDEA.
  User: Geni
  Date: 2018/10/29
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <title>请升级你的浏览器</title>
    <link rel="apple-touch-icon-precomposed" href="images/icon/icon.png">
    <link rel="shortcut icon" href="images/icon/favicon.ico">
    <style type="text/css">
        html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video {
            border: 0;
            font-size: 100%;
            font: inherit;
            vertical-align: baseline;
            margin: 0;
            padding: 0;
        }
        article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {
            display: block;
        }
        body {
            line-height: 1;
        }
        ol, ul {
            list-style: none;
        }
        blockquote, q {
            quotes: none;
        }
        blockquote:before, blockquote:after, q:before, q:after {
            content: none;
        }
        table {
            border-collapse: collapse;
            border-spacing: 0;
        }
        a {
            text-decoration: none;
            color: #0072c6;
        }
        a:hover {
            text-decoration: none;
            color: #004d8c;
        }
        body {
            width: 960px;
            margin: 0 auto;
            padding: 10px;
            font-size: 14px;
            line-height: 24px;
            color: #454545;
            font-family: 'Microsoft YaHei UI', 'Microsoft YaHei', DengXian, SimSun, 'Segoe UI', Tahoma, Helvetica, sans-serif;
        }
        h1 {
            font-size: 40px;
            line-height: 80px;
            font-weight: 100;
            margin-bottom: 10px;
        }
        h2 {
            font-size: 20px;
            line-height: 25px;
            font-weight: 100;
            margin: 10px 0;
        }
        p {
            margin-bottom: 10px;
        }
        hr {
            margin: 20px 0;
            border: 0;
            border-top: 1px solid #dadada;
        }
        img {
            width: 34px;
            height: 34px;
            border: 0;
            float: left;
            margin-right: 10px;
        }
        span {
            display: block;
            font-size: 12px;
            line-height: 12px;
        }
        .footer {
            margin-top: 2em;
            text-align: center;
        }
        .clean {
            clear: both;
        }
        .browser {
            padding: 10px 0;
        }
        .browser li {
            width: 146px;
            height: 34px;
            line-height: 22px;
            float: left;
            list-style: none;
            background: url(images/browser.jpg) no-repeat;
            padding-left: 40px
        }
        .browser .browser-firefox {
            background-position: 0 -34px;
        }
        .browser .browser-safari {
            background-position: 0 -68px;
        }
        .browser .browser-ie {
            background-position: 0 -102px;
        }
    </style>
</head>
<body>
<h1>是时候升级你的浏览器了</h1>
<p>你正在使用 Internet Explorer 的过期版本（IE6、IE7、IE8 或使用该内核的浏览器）。这意味着在升级浏览器前，你将无法访问此网站。</p>
<hr>
<h2>请注意：Windows XP 及 IE6、IE7、IE8 的支持已经结束</h2>
<p>自 2014 年 4 月 8 日起，Microsoft 不再为 Windows XP 和 Internet Explorer 8 及以下版本提供相应支持和更新。如果你继续使用这些，你将可能受到病毒、间谍软件和其他恶意软件的攻击，无法确保个人信息的安全。请参阅 <a href="http://windows.microsoft.com/zh-cn/windows/end-support-help" title="" target="_blank">Microsoft 关于 Windows XP 支持已经结束的说明</a> 。</p>
<hr>
<h2>更先进的浏览器</h2>
<p>推荐使用以下浏览器的最新版本。如果你的电脑已有以下浏览器的最新版本则直接使用该浏览器访问<b id="referrer"></b>即可。</p>
<ul class="browser">
    <li class="browser-chrome"><a href="http://www.google.cn/chrome/browser/index.jsp?hl=zh-CN&standalone=1"> 谷歌浏览器<span>Google Chrome</span></a></li>
    <li class="browser-firefox"><a href="http://download.firefox.com.cn/releases/stub/official/zh-CN/Firefox-latest.exe"> 火狐浏览器<span>Mozilla Firefox</span></a></li>
    <li class="browser-safari"><a href="http://www.apple.com/cn/safari/"> 苹果浏览器<span>Apple Safari</span></a></li>
    <li class="browser-ie"><a href="http://windows.microsoft.com/zh-cn/internet-explorer/download-ie"> IE浏览器<span>Internet Explorer</span></a></li>
    <div class="clean"></div>
</ul>
<hr>
<h2>为什么会出现这个页面？</h2>
<p>如果你不知道升级浏览器是什么意思，请请教一些熟练电脑操作的朋友。如果你使用的不是IE6/7/8，而是360浏览器、QQ浏览器、搜狗浏览器等，出现这个页面是因为你使用的不是该浏览器的最新版本，升级至最新即可。</p>
<hr>
<h2>一起抵制IE6、IE7、IE8</h2>
<p>为了兼容这个曾经的浏览器霸主，网页设计人员需要做大量的代码工作。对于普通用户而言，低版本IE更是一个岌岌可危的安全隐患，在Windows历史上几次大的木马病毒事件都是利用IE漏洞进行传播。所以，请和我们一起抵制IE6、IE7、IE8！</p>
<p class="footer">&copy; 2016 POWERED BY WY ALL RIGHTS RESERVED</p>
</body>
</html>