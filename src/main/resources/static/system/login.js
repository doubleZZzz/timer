$(function(){

    function checkPhoneNumber(phone) {
        return (/^1[34578]\d{9}$/.test(phone));
    };

    //添加方法
    jQuery.validator.addMethod("isPhone", function (phone, element) {
        return checkPhoneNumber(phone);
    }, "无效的手机号格式");

    $('#loginForm').validate({

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

        rules: {
            username: {
                required: true,
                remote: "/loinUsername"
            },
            password: {
                required: true,
            }
        },
        messages: {
            username: {
                required: "手机号必填",
                remote: "用户名不存在"
            },
            password: {
                required: "密码必填"
            }
        },

        submitHandler: function (form) {
            //使用ajax方式提交
            $(form).ajaxSubmit(function (data) {
                if (data.success) {
                    $.messager.confirm("提示", "登录成功", function () {
                        window.location.href = "/personal";
                    })
                } else {
                    $.messager.alert("提示", data.msg);
                }
            })
        },
    })

})