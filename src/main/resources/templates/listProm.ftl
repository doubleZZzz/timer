<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试平台</title>
<#include "common/links-tpl.ftl" />

</head>
<body>

<div class="container">
    <div class="row">

        <div class="panel panel-default" style="margin-top: 20px;">
            <div class="panel-heading">
                活动列表
            </div>

            <table class="table table-hover">
                <thead>
                <tr>
                    <th>活动编号</th>
                    <th>活动名称</th>
                <#-- <th>上级活动ID</th>-->
                    <th>活动开始时间</th>
                    <th>活动结束时间</th>
                    <th>报名开始时间</th>
                    <th>报名结束时间</th>
                    <th>报名状态</th>
                    <th>活动状态</th>
                    <th>操作</th>
                </tr>

                </thead>
                <tbody>
                <#list proms as item>
                <tr>
                    <td>${item.CREATOR_ORG_ID}</td>
                    <td>${item.CREATOR_ORG_NAME}</td>
                <#--<td>${item.UP_PROM_ID}</td>-->
                    <td>${item.START_TIME}</td>
                    <td>${item.END_TIME}</td>
                    <td>${item.REGISTER_START_TIME}</td>
                    <td>${item.REGISTER_END_TIME}</td>
                    <td>${item.REGISTER_STATUS}</td>
                    <td>${item.STATUS}</td>
                    <td>
                        <a href="#">查看详情</a> |
                        <a href="#">点击报名</a>
                    </td>
                </tr>
                </#list>
                </tbody>
            </table>
            <div style="text-align: center;">
                <ul id="pagination" class="pagination"></ul>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>