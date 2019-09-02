<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户添加</title>
    <link href="/hr/static/css/index.css" rel="stylesheet" type="text/css"/>
    <link href="/hr/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="/hr/static/layui/css/layui.css" media="all"/>
</head>

<body>
<mvc:form modelAttribute="user" action="javascript:update()" cssClass="form-horizontal" id="form1">
    <mvc:hidden path="uId"/>
    <div class="col-lg-6">
        <div class="form-group">
            <label class="col-lg-4 control-label">用户名称<span
                    style="color: red;">&nbsp;*</span></label>
            <div class="col-lg-5">
                <mvc:input path="uName" readonly="true" cssClass="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-lg-4 control-label">真实姓名<span
                    style="color: red;">&nbsp;*</span></label>
            <div class="col-lg-5">
                <mvc:input path="trueName" cssClass="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-lg-4 control-label">原密码<span
                    style="color: red;">&nbsp;*</span></label>
            <div class="col-lg-5">
                <input class="form-control" required type="text" name="lastPassword">
            </div>
        </div>

        <div class="form-group">
            <label class="col-lg-4 control-label">新密码<span
                    style="color: red;">&nbsp;*</span></label>
            <div class="col-lg-5">
                <input class="form-control" required type="text" name="uPassword">
            </div>
        </div>

        <div class="form-group">
            <label class="col-lg-4 control-label">用户身份<span
                    style="color: red;">&nbsp;*</span></label>
            <div class="col-lg-5">
                <mvc:select path="roleId" cssClass="form-control">
                    <mvc:option value="0">请选择</mvc:option>
                    <mvc:options items="${roles}" itemValue="roleId" itemLabel="roleName"/>
                </mvc:select>
                <span class="help-block"></span>
            </div>
        </div>

        <div class="col-lg-offset-5">
            <a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
            <button class="btn btn-success" type="submit">保存</button>
        </div>
    </div>
    </div>
</mvc:form>
<script src="/hr/static/js/jquery-2.2.0.min.js"></script>
<script type="text/javascript" src="/hr/static/js/layer_v2.1/layer/layer.js"></script>
<script>

    function update() {

        var formData = $("#form1").serialize();
        var i;
        $.ajax({
            url: "/hr/user/usermodify",
            data: formData,
            type: "post",
            beforeSend: function () {
                //						layer.load()
                i = layer.msg('请稍后...', {
                    icon: 16,
                    shade: [0.5, '#f5f5f5'],
                    scrollbar: false,
                    offset: 'auto',
                    time: 10000
                });
            },
            success: function (data) {
                layer.close(i);
                if (data.code == 200) {
                    layer.msg(data.message, {
                            icon: 1,
                            time: 2000 //2秒关闭（如果不配置，默认是3秒）
                        }, function () {
                            window.location.href = "/hr/user/users";
                        }
                    )
                } else {
                    layer.msg(data.message, {
                            icon: 2,
                            time: 3000 //2秒关闭（如果不配置，默认是3秒）
                        }
                    )
                }


            }


        })


    }


</script>
</body>

</html>