<%--
  Created by IntelliJ IDEA.
  User: mutiny
  Date: 2018/11/13
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <title>main page</title>
    <link rel="stylesheet" type="text/css" href="/lib/bootstrap3.3.7/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body>
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
                    <div class="col-md-6 text-center">新用户请注册</div>
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
                            <li><a href="#">主站</a></li>
                            <li><a href="#">登录</a></li>
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
        <%--登录主窗口--%>
        <div id="center" class="col-md-8">
            <div id="login">登&nbsp;&nbsp;&nbsp;录</div>
            <div id="picture"></div>
            <div class="division"></div>
            <form id="loginform" method="post" action="/LoginController">
                <div class="form-group" id="EmailBox">
                    <label for="Email">Email address/User</label><span id="hintEmail"></span>
                    <input type="email" class="form-control " id="Email" placeholder="Email/User">
                </div>
                <div class="form-group" id="PasswordBox">
                    <label for="Password">Password</label><span id="hintPassword"></span>
                    <input type="password" class="form-control" id="Password" placeholder="Password">
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Check me out
                    </label>
                </div>
                <div id="LoginBlock" class="text-right">
                    <input type="submit" id="butt" class="btn btn-success btn-lg" value="登录">
                    <a type="button" class="btn btn-info btn-lg" href="/register.jsp">注册</a>
                </div>

            </form>
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
<script src="/js/login.js" type="text/javascript"></script>