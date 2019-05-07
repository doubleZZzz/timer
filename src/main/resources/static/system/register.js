$(function () {

    function checkPhoneNumber(phone) {
        return (/^1[34578]\d{9}$/.test(phone));
    };

    //添加方法
    jQuery.validator.addMethod("isPhone", function (phone, element) {
        return checkPhoneNumber(phone);
    }, "无效的手机号格式");

    //发送验证码
    $('#sendVerifyCode').click(function () {
        //1.判断手机号的格式
        var phone = $('#phoneNumber').val();
        if (!checkPhoneNumber(phone)) {
            $.messager.popup("请输入正确的手机号码");
            return;
        }
        //2.点击之后就需要禁用按钮
        var btn = $(this);
        btn.attr('disabled', true);
        //3.发送请求 去后台发送短信
        $.post("/messageVerifyCode", {"phone": phone}, function (data) {
            //4.回调函数的成功与失败情况
            if (data.success) {
                $.messager.alert("温馨提示", "发送成功");
                var time = 10;
                var interval = window.setInterval(function () {
                    time = time - 1;

                    btn.html(time + "s后重新发送");

                    //当时间倒数完之后可以重新发送
                    if (time <= 0) {
                        window.clearInterval(interval);
                        btn.html("重新发送");
                        btn.attr('disabled', false);
                    }

                }, 1000);
            } else {
                //发送失败
                $.messager.alert("提示",data.msg);
                //5.2.恢复按钮
                btn.html("重新发送");
                btn.attr("disabled",false);
            }
        })
    })


    $("#registerForm").validate({

        //覆盖提示错误样式
        errorClass: "text-danger",
        //当元素验证未通过时执行
        highlight: function (element, errorClass) {
            $(element).closest("div.form-group").addClass('has-error').removeClass('has-success');
        },
        //当元素验证通过之后执行
        unhighlight: function (element, errorClass, validClass) {
            $(element).closest("div.form-group").addClass('has-success').removeClass('has-error');
        },

        //submitHandler :当整个表单验证通过之后 ,触发该回调方法 ,submitHandler会阻止掉表单的默认提交
        submitHandler: function (form) {
            //使用ajax方式提交
            $(form).ajaxSubmit(function (data) {
                if (data.success) {
                    $.messager.confirm("提示", "注册成功", function () {
                        window.location.href = "/login.html";
                    })
                } else {
                    $.messager.alert("提示", data.msg);
                }
            })
        },
        rules: {
            username: {
                required: true,
                rangelength: [11, 11],
                remote: "/existUsername"
            },
            password: {
                required: true,
                rangelength: [4, 16],
            },
            confirmPwd: {
                required: true,
                rangelength: [4, 16],
                equalTo: '#password'
            },
            verifycode: {
                required: true,
                rangelength: [4, 4],

            }
        },
        messages: {
            username: {
                required: "手机号必填",
                rangelength: "手机号为{0}位",
                remote: "手机号码已存在"
            },
            password: {
                required: "密码必填",
                rangelength: "密码为{0}-{1}位"
            },
            confirmPwd: {
                required: "密码校验",
                rangelength: "校验密码为{0}-{1}位",
                equalTo: '两次密码不一致'
            },
            verifycode: {
                required: "验证码必填",
                rangelength: "验证码为{0}位"
            }
        },

    });

});
