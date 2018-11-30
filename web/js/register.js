//邮箱验证
$("#Email").focus(function () {
    $("#hintEmail").html("请输入完整的邮箱").css("color","blue");
    return 0;
});
$("#Email").blur(function () {

    var email = $("#Email").val();
    if(email == "")
    {
        $("#hintEmail").html("邮箱不能为空").css("color","red");
        return 0;

    }
    else if (!email.match(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/))
    {
        $("#hintEmail").html("邮箱格式不正确").css("color","red");
        return 0;
    }
    else
    {
        $("#hintEmail").html("");
    }
});


//用户名验证
$("#Name").focus(function () {
    $("#hintName").html("请输入用户名").css("color","blue");
    return 0;
});
$("#Name").blur(function () {

    var name = $("#Name").val();
    if(name == "")
    {
        $("#hintName").html("用户名不能为空").css("color","red");
        return 0;

    }
    // else if ()
    // {
    //     //数据库检查重名
    //
    //
    //
    // }
    else
    {
        $("#hintName").html("");
    }
});


//密码验证
$("#Password").focus(function () {
    $("#hintPassword").html("请输入密码").css("color","blue");
    return 0;
});
$("#Password").blur(function () {

    var password = $("#Password").val();
    if(password == "")
    {
        $("#hintPassword").html("密码不能为空").css("color","red");
        return 0;

    }
    else
    {
        $("#hintPassword").html("");
    }
});


//重复密码验证
$("#RPassword").focus(function () {
    $("#hintRPassword").html("请重复输入密码").css("color","blue");
    return 0;
});
$("#RPassword").blur(function () {

    var rpassword = $("#RPassword").val();
    if(rpassword == "")
    {
        $("#hintRPassword").html("密码不能为空").css("color","red");
        return 0;

    }
    else if(rpassword != $("#Password").val())
    {
        $("#hintRPassword").html("密码不一致").css("color","red");
        return 0;
    }
    else
    {
        $("#hintRPassword").html("");
    }
});


//手机号验证
$("#Number").focus(function () {
    $("#hintNumber").html("请输入手机号").css("color","blue");
    return 0;
});
$("#Number").blur(function () {

    var number = $("#Number").val();
    var myreg=/^[1][3,4,5,7,8][0-9]{9}$/;
    if(number == "")
    {
        $("#hintNumber").html("手机号不能为空").css("color","red");
        return 0;

    }
    else if(!myreg.test(number))
    {
        $("#hintNumber").html("手机号格式不正确").css("color", "red");
    }
    else
    {
        $("#hintNumber").html("").css("color", "red");
    }
});