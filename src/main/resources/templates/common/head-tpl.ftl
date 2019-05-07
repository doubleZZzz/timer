<div class="el-header">
    <div class="container" style="position: relative;">
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/index">首页</a></li>

            <#--判断是否有登录,及session中是否有共享-->
        <#if loginfo??>
            <li>
                <a class="el-current-user" href="/personal">用户名:${loginfo.username}</a>
            </li>
            <li><a href="/recharge">账户充值 </a></li>
            <li><a href="/login.html">注销 </a></li>
        <#else>

            <li><a href="/login.html">登录</a></li>
            <li><a href="/register.html">快速注册</a></li>
        </#if>
            <li><a href="#">帮助</a></li>
        </ul>
    </div>
</div>
