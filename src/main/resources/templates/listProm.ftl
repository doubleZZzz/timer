<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试平台</title>
<#include "common/links-tpl.ftl" />
    <link type="text/css" rel="stylesheet" href="/css/account.css"/>
    <script type="text/javascript" src="/js/plugins/jquery.twbsPagination.min.js"></script>
    <script type="text/javascript" src="/js/plugins-override.js"></script>
    <script type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript">
        /*翻页*/
       /* $(function () {
            $('#pagination').twbsPagination({

            });
        });*/
    </script>
</head>
<body>

<!-- 网页顶部导航 -->
<#include "common/head-tpl.ftl" />
<!-- 网页导航 -->
<#assign currentNav="personal" />
<#include "common/navbar-tpl.ftl" />

<div class="container">
    <div class="row">
        <!--导航菜单-->
        <div class="col-sm-3">
        <#assign currentNav="listProm" />
        </div>
        <!-- 功能页面 -->
        <div class="col-sm-9">
            <#--<form action="/listProm" name="searchForm" id="searchForm" class="form-inline" method="post">
                <input type="hidden" id="currentPage" name="currentPage" value="1"/>
                <div class="form-group">
                    <label>时间范围</label>
                    <input type="text" class="form-control beginDate" name="beginDate" onclick="WdatePicker()"
                           value='${(qo.beginDate?string("yyyy-MM-dd"))!""}'/>
                </div>
                <div class="form-group">
                    <label></label>
                    <input type="text" class="form-control endDate" name="endDate" onclick="WdatePicker()"
                           value='${(qo.endDate?string("yyyy-MM-dd"))!""}'/>
                </div>
                <div class="form-group">
                    <label>状态</label>
                    <select class="form-control" name="state" id="state">
                        <option value="-1">全部</option>
                        <option value="0">登录失败</option>
                        <option value="1">登录成功</option>
                    </select>
                &lt;#&ndash;下拉框的选中&ndash;&gt;
                    <script>
                        $("#state option[value=${qo.state}]").attr("selected", true);
                    </script>


                </div>
                <div class="form-group">
                    <button type="submit" id="query" class="btn btn-success"><i class="icon-search"></i> 查询</button>
                </div>
            </form>-->

            <div class="panel panel-default" style="margin-top: 20px;">
                <div class="panel-heading">
                    活动列表
                </div>
                <table class="table table-striped">
                    <thead>

                    <tr>
                        <th>活动编号</th>
                        <th>活动名称</th>
                        <th>上级活动ID</th>
                        <th>活动开始时间</th>
                        <th>活动结束时间</th>
                        <th>报名开始时间</th>
                        <th>报名结束时间</th>
                        <th>报名状态</th>
                        <th>活动状态</th>
                    </tr>

                    </thead>
                    <tbody>
                    <#list proms.listData as item>
                    <tr>
                        <td>${item.CREATOR_ORG_ID}</td>
                        <td>${item.CREATOR_ORG_NAME}</td>
                        <td>${item.UP_PROM_ID}</td>
                        <td>${item.START_TIME?string("yyyy-MM-dd HH:mm:ss")}</td>
                        <td>${item.END_TIME?string("yyyy-MM-dd HH:mm:ss")}</td>
                        <td>${item.REGISTER_START_TIME?string("yyyy-MM-dd HH:mm:ss")}</td>
                        <td>${item.REGISTER_END_TIME?string("yyyy-MM-dd HH:mm:ss")}</td>
                        <td>${item.REGISTER_STATUS}</td>
                        <td>${item.STATUS}</td>
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

<#include "common/footer-tpl.ftl" />
</body>
</html>