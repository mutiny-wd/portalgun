<%--
  Created by IntelliJ IDEA.
  User: mutiny
  Date: 2018/11/17
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="/lib/bootstrap3.3.7/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/register.css">
</head>
<body>
<%
    String info=(String)request.getAttribute("error");
    if("已存在用户名或邮箱".equals(info))
        out.println("<script>alert('已存在用户名或邮箱');</script>");
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
        <%--登录主窗口--%>
        <div id="center" class="col-md-8">
            <div id="register">注&nbsp;&nbsp;&nbsp;册</div>
            <form id="registerform" class="center-block">
                <div id="RegisterBlock" class="text-left " >
                    <div class="form-group">
                        <label for="Email">创建你的邮箱</label><span id="hintEmail"></span>
                        <input type="email" class="form-control" id="Email" name="Email" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <label for="Name">用户名</label><span id="hintName"></span>
                        <input type="text" class="form-control" id="Name" name="Name" placeholder="Name">
                    </div>
                    <div class="form-group">
                        <label for="Password">输入密码</label><span id="hintPassword"></span>
                        <input type="password" class="form-control" id="Password" name="Password" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <label for="RPassword">重复输入密码</label><span id="hintRPassword"></span>
                        <input type="password" class="form-control" id="RPassword" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <label for="Number">你的手机号码</label><span id="hintNumber"></span>
                        <input type="text" class="form-control" id="Number" name="Number" placeholder="PhoneNumber">
                    </div>
                    <!--性别-->
                    <div class="radio">
                        <label>
                            <input type="radio" name="optionsRadios" id="Boy" value="boy" checked>男
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="optionsRadios" id="Girl" value="girl">女
                        </label>
                    </div>
                    <div id="RegisterBTNBlock" class="text-right center-block">
                        <button type="submit" class="btn btn-info btn-lg ">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
                        <input type="reset" class="btn btn-error btn-lg " value="重&nbsp;&nbsp;&nbsp;&nbsp;置" >
                    </div>

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




<script src="/lib/jquery3.3.1/jquery-3.3.1.js" type="text/javascript"></script>
<script src="/lib/bootstrap3.3.7/js/bootstrap.js" type="text/javascript"></script>
<script src="js/register.js" type="text/javascript"></script>
</body>
</html>
