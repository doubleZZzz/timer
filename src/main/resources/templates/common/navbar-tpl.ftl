<div class="navbar navbar-default el-navbar">
	<div class="container">
		<div class="navbar-header">
			<a href="/">
				<img alt="Brand" src="/images/logo.png">
			</a>
		</div>
		<ul class="nav navbar-nav">
			<li id="index"><a href="/index">首页</a></li>
			<li id="invest"><a href="/invest">我要投资</a></li>
			<li id="borrow"><a href="/borrow">我要借款</a></li>
			<li id="personal"><a href="/personal">个人中心</a></li>
			<li><a href="#">新手指引</a></li>
			<li><a href="#">关于我们</a></li>
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