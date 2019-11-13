<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>科讯后台管理系统登录</title>
    <link rel="stylesheet" href="/hr/static/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="/hr/static/css/login.css" media="all"/>
    <style>
        /* 覆盖原框架样式 */
        .layui-elem-quote {
            background-color: inherit !important;
        }

        .layui-input, .layui-select, .layui-textarea {
            background-color: inherit;
            padding-left: 30px;
        }


    </style>


</head>

<body>
<!-- Head -->
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-sm12 layui-col-md12 zyl_mar_01">
            <blockquote class="layui-elem-quote">科讯后台管理系统登录</blockquote>
        </div>
    </div>
</div>
<!-- Head End -->

<!-- Carousel -->
<div class="layui-row">
    <div class="layui-col-sm12 layui-col-md12">
        <div class="layui-carousel zyl_login_height" id="zyllogin"
             lay-filter="zyllogin">
            <div carousel-item="">
                <div>
                    <div class="zyl_login_cont"></div>
                </div>
                <div>
                    <img src="/hr/static/img/carousel/01.jpg"/>
                </div>
                <div>
                    <div class="background">
                        <span></span><span></span><span></span> <span></span><span></span><span></span>
                        <span></span><span></span><span></span> <span></span><span></span><span></span>
                    </div>
                </div>
                <div>
                    <img src="/hr/static/img/carousel/03.jpg"/>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Carousel End -->

<!-- Footer -->
<div class="layui-row">
    <div class="layui-col-sm12 layui-col-md12 zyl_center zyl_mar_01">
        © 2019 - 科讯后台登陆界面 || 科讯后台登陆界面版权所有
    </div>
</div>
<!-- Footer End -->

<!-- LoginForm -->
<div class="zyl_lofo_main">
    <fieldset class="layui-elem-field layui-field-title zyl_mar_02">
        <legend>欢迎登陆 - 科讯人力资源管理系统</legend>
    </fieldset>
    <div class="layui-row layui-col-space15">
        <form class="layui-form zyl_pad_01" action="javascript:login()"
              id="form1">
            <div class="layui-col-sm12 layui-col-md12">
                <div class="layui-form-item">
                    <input type="text" name="username" lay-verify="required|userName"
                           autocomplete="off" value="lidong" placeholder="账号"
                           class="layui-input"> <i
                        class="layui-icon layui-icon-username zyl_lofo_icon"></i>
                </div>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <div class="layui-form-item">
                    <input type="password" name="password" lay-verify="required|pass"
                           autocomplete="off" value="123" placeholder="密码"
                           class="layui-input"> <i
                        class="layui-icon layui-icon-password zyl_lofo_icon"></i>
                </div>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <div class="layui-row">
                    <div class="layui-col-xs4 layui-col-sm4 layui-col-md4">
                        <div class="layui-form-item">
                            <input type="text"  name="vercode" id="vercode"
                                   lay-verify="required|vercodes" autocomplete="off"
                                   placeholder="验证码" class="layui-input" maxlength="4"> <i
                                class="layui-icon layui-icon-vercode zyl_lofo_icon"></i>
                        </div>
                    </div>
                    <div class="layui-col-xs4 layui-col-sm4 layui-col-md4">
                        <div class="zyl_lofo_vercode zylVerCode" onclick="zylVerCode()"></div>
                    </div>
                </div>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <button class="layui-btn layui-btn-fluid" type="submit"
                        lay-submit="" lay-filter="demo1">立即登录
                </button>
            </div>
        </form>
    </div>
</div>
<!-- LoginForm End -->

<!-- Jquery Js -->
<script type="text/javascript" src="/hr/static/js/jquery-2.2.0.min.js"></script>
<!-- Layui Js -->
<script type="text/javascript" src="/hr/static/layui/layui.js"></script>
<!-- Jqarticle Js -->
<script type="text/javascript"
        src="/hr/static/assembly/jqarticle/jparticle.min.js"></script>
<!-- ZylVerificationCode Js-->
<script type="text/javascript"
        src="/hr/static/assembly/zylVerificationCode/zylVerificationCode.js"></script>
<script>
    layui.use(['carousel', 'form'], function () {
        var carousel = layui.carousel, form = layui.form;

        //自定义验证规则
        form.verify({
            userName: function (value) {
                if (value.length < 3) {
                    return '账号必须大于三个字符';
                }
            },
            pass: [/^[\S]{3,16}$/, '密码必须3到12位，且不能出现空格'],
            vercodes: function (value) {
                //获取验证码
                var zylVerCode = $(".zylVerCode").html();
                //						value != zylVerCode
                if (zylVerCode != value) {
                    return '验证码错误（区分大小写）';
                }
            },
            content: function (value) {
                layedit.sync(editIndex);
            }
        });

        //监听提交
        //				form.on('submit(demo1)', function(data){
        //					layer.alert(JSON.stringify(data.field),{
        //						title: '最终的提交信息'
        //					})
        //					return true;
        //				});

        //设置轮播主体高度
        var zyl_login_height = $(window).height() / 1.3;
        var zyl_car_height = $(".zyl_login_height").css("cssText",
            "height:" + zyl_login_height + "px!important");

        //Login轮播主体
        carousel.render({
            elem: '#zyllogin' //指向容器选择器
            ,
            width: '100%' //设置容器宽度
            ,
            height: 'zyl_car_height',
            arrow: 'always' //始终显示箭头
            ,
            anim: 'fade' //切换动画方式
            ,
            autoplay: true //是否自动切换false true
            ,
            arrow: 'hover' //切换箭头默认显示状态||不显示：none||悬停显示：hover||始终显示：always
            ,
            indicator: 'none' //指示器位置||外部：outside||内部：inside||不显示：none
            ,
            interval: '5000' //自动切换时间:单位：ms（毫秒）
        });

        //监听轮播--案例暂未使用
        carousel.on('change(zyllogin)', function (obj) {
            var loginCarousel = obj.index;
        });

        //粒子线条
        $(".zyl_login_cont").jParticle({
            background: "rgba(0,0,0,0)", //背景颜色
            color: "#fff", //粒子和连线的颜色
            particlesNumber: 100, //粒子数量
            //disableLinks:true,//禁止粒子间连线
            //disableMouse:true,//禁止粒子间连线(鼠标)
            particle: {
                minSize: 1, //最小粒子
                maxSize: 3, //最大粒子
                speed: 30, //粒子的动画速度
            }
        });

    });

    var i;

    function login() {

        var formData = $("#form1").serialize();
        $.ajax({
            type: "post",
            url: "http://127.0.0.1/hr/user/login",
            async: true,
            datatype: "jsonp",
            data: formData,
            beforeSend: function () {
                //						layer.load()
                i = showLoad();
            },
            success: function (data) {
                closeLoad(i);
                if (data.code == 200) {
                    window.location.href = "/hr/index";
                    window.sessionStorage.setItem("username",
                        data.data.username);
                } else {
                    layer.msg(data.message);
                }

            }
        });

    }

    function showLoad() {

        return layer.msg('登录中...', {
            icon: 16,
            shade: [0.5, '#f5f5f5'],
            scrollbar: false,
            offset: 'auto',
            time: 100000
        });

    }

    function closeLoad(index) {
        layer.close(index);

    }
</script>
</body>

</html>