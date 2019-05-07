<div class="navbar navbar-default el-navbar">
	<div class="container">
		<div class="navbar-header">
			<a href="/">
				<img alt="Brand" src="/images/logo.png">
			</a>
		</div>
		<ul class="nav navbar-nav">
			<li id="index"><a href="/listProm">首页</a></li>
			<li id="personal"><a href="/listProm">个人中心</a></li>
		</ul>
	</div>
</div>

<#--判断变量是否为空-->
<#if currentNav??>
    <script>
		$(function () {

			<#--使用id来添加选中属性,-->
			$("#${currentNav}").addClass("active")
        });
	</script>
</#if>