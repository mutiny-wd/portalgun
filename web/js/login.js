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

//密码验证
$("#Password").focus(function () {
    $("#hintPassword").html("请输入密码").css("color","blue");
});
$("#Password").blur(function () {
    var password =$("#Password").val();
    if(password = "")
    {
        $("#hintPassword").html("密码不能为空").css("color","red");
        return 0;
    }
    else
    {
        $("#hintPassword").html("");
    }
})

