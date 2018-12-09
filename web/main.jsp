<%@ page import="javax.sound.midi.SysexMessage" %><%--
  Created by IntelliJ IDEA.
  User: mutiny
  Date: 2018/12/8
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Portalgun</title>
    <link rel="stylesheet" type="text/css" href="/lib/bootstrap3.3.7/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/main.css">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
</head>
<body>
<%
    String success=(String)request.getSession().getAttribute("success");
    String user=(String)request.getAttribute("currentUser");
    System.out.println(success);
    if("y".equals(success))
        out.println("<script>$('#user').text();</script>");// TODO: 2018/12/9 待解决 登录成功后改变#user
%>
<div id="container">
    <%--头部--%>
    <div id="header" class="container-fluid">
        <%--logo--%>
        <div id="logo"></div>
        <%--导航1--%>
        <div id="nav1">

            <div class="container">
                <%--栅格系统3-6-3--%>
                <div class="row">
                    <div class="col-md-3 text-left">Portalgun</div>
                    <div class="col-md-6 text-center" id="user">新用户请注册</div>
                    <div class="col-md-3 text-right"></div>

                </div>
            </div>
        </div>
        <%--导航2--%>
        <div id="nav2">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                                data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">Brand</a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                        <%--导航栏左边--%>
                        <ul class="nav navbar-nav">
                            <li><a href="/main.jsp">主站</a></li>
                            <li><a href="/login.jsp">登录</a></li>
                        </ul>

                        <%--导航栏右边--%>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#">Link</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                   aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </div>

    </div>

</div>
<%--主体--%>
<div id="content" class="container-fluid">
    <div class="row">
        <%--左边栏--%>
        <div id="left" class="col-md-2">

        </div>
        <%--主窗口--%>
        <div id="center" class="col-md-8">
            <%--轮播图--%>
            <div class="slideBox">
                <ul>
                    <li><img src="/img/main/s5.jpg" alt="" width="942" height="300"/></li>
                    <li><img src="/img/main/s4.jpg" alt="" width="942" height="300"/></li>
                    <li><img src="/img/main/s3.jpg" alt="" width="942" height="300"/></li>
                    <li><img src="/img/main/s6.jpg" alt="" width="942" height="300"/></li>
                    <li><img src="/img/main/s2.jpg" alt="" width="942" height="300"/></li>
                    <li><img src="/img/main/s1.jpg" alt="" width="942" height="300"/></li>
                </ul>
                <div class="spanBox">
                    <span class="active">1</span>
                    <span>2</span>
                    <span>3</span>
                    <span>4</span>
                    <span>5</span>
                    <span>6</span>
                </div>
                <div class="prev"><img src="/img/main/back_alt.png" width="15" height="50" alt=""/></div>
                <div class="next"><img src="/img/main/forward_alt.png" width="15" height="50" alt=""/></div>
            </div>
            <%--板块--%>
            <div id="article">
                <div id="model1" class="model">
                    <div class="name">科技</div>
                </div>
                <div id="model2" class="model">
                    <div class="name">科技</div>
                </div>
                <div id="model3" class="model">
                    <div class="name">科技</div>
                </div>
            </div>
        </div>
        <%--右边栏--%>
        <div id="right" class="col-md-2">

        </div>
    </div>
    <%--底部--%>
    <div id="footer">
        <div id="text">
            <span>关于我们</span>&nbsp;&nbsp;&nbsp;&nbsp;
            <span>加入我们</span>
        </div>
    </div>
</div>



</body>
</html>
<script src="/lib/jquery3.3.1/jquery-3.3.1.js" type="text/javascript"></script>
<script src="/lib/bootstrap3.3.7/js/bootstrap.js" type="text/javascript"></script>
<script src="/js/main.js" type="text/javascript"></script>