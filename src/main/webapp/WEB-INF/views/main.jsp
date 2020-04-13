<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>智能环境监测平台</title>
    <link rel="stylesheet" href="${path}/static/css/style.css"/>
    <script type="text/javascript" src="${path}/static/js/common/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="//api.map.baidu.com/api?v=3.0&ak=qft2Afha7aGarAHid78qsbzBqsuiudRz"></script>
</head>
<body>
<header>
    智能环境监测平台
    <span id=localtime style=" font-size:14px; position: absolute; right: 30px; top:-20px; "></span>
</header>
<div id="content">
    <div class="content_left">
        <div class="video">
            <video autoplay="autoplay" loop="loop" class="video_cage">
                <source class="video" title="主监控位" src="${path}/static/video/test_mv02.mov"/>
            </video>
        </div>


        <!--设备信息列表 start-->
        <div class="equipment">
            <div class="title"><img src="/static/images/icon04.png"> 设备列表</div>
            <table class="equ_panel-table" border="0">
                <%--                <thead  align="center">--%>
                <%--                <tr height="50">--%>
                <%--                    <th colspan="4" style="color: #00f6ff;font-size: 20px;"><img src="${path}/static/images/icon04.png"/> 设备列表</th>--%>
                <%--                </tr>--%>
                <%--                </thead>--%>
                <tbody>
                <%--                    <tr height="50" align="center">--%>
                <%--                        <th colspan="4" style="color: #00f6ff;font-size: 20px;"><img src="${path}/static/images/icon04.png"/> 设备列表</th>--%>
                <%--                    </tr>--%>
                <tr align="center">
                    <td v-for="item in factoryHeader" style="color: #00fcff; font-size: 14px; padding: 2px 0;">{{
                        item.categories }}
                    </td>
                </tr>
                <tr v-for="y in factory.slice(0,6)" style="font-size: 14px;" align="center">
                    <td>{{ y.company }}</td>
                    <td>{{ y.dtuCnt }}</td>
                    <td>{{ y.alarm }}</td>
                    <td width="200px">
                        <button class="b1 click_pop">开启</button>
                        <button class="b2 click_pop2">关闭</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>
    <div class="content_center">
        <!--map start-->
        <div class="center_top">
            <div class="title"><img src="${path}/static/images/icon01.png"/> 设备分布</div>
            <div class="center_top_con" id="allMap">

            </div>
        </div>
        <!--map end-->

        <!--各指标统计 start-->
        <div class="center_bot">
            <div class="title"><img src="${path}/static/images/icon03.png"/> 环境监测数据统计</div>
            <div class="center_bot_con" id="container2">
            </div>
        </div>
        <!--各指标统计 end-->
    </div>
    <div class="content_right">
        <div class="report">
            <div class="report1">
                <p>告警信息</p>
                <small>{{alarm.alarm}}条</small>
            </div>
            <div class="report2">
                <p>故障信息</p>
                <small>{{alarm.fault}} 条</small>
            </div>
        </div>
        <div class="news_report">
            <div class="title"><img src="${path}/static/images/icon05.png"/> 报警记录</div>
            <div class="news_list">
                <ul>
                    <li v-for="item in almMsg.slice(0,3)" class="li02">
                        {{ item.msg }}
                    </li>
                </ul>
            </div>
        </div>
        <div class="data_box">
            <div class="title"><img src="${path}/static/images/icon06.png"/> 数据记录</div>
            <div class="data_con" id="container4">
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">

    window.onresize = $(function findDimensions() //函数：获取尺寸
    {
        //获取窗口宽度
        if (window.innerWidth)
            winWidth = window.innerWidth;
        else if ((document.body) && (document.body.clientWidth))
            winWidth = document.body.clientWidth;
        //获取窗口高度
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        //通过深入Document内部对body进行检测，获取窗口大小
        if (document.documentElement && document.documentElement.clientHeight && document.documentElement.clientWidth) {
            winHeight = document.documentElement.clientHeight;
            winWidth = document.documentElement.clientWidth;
        }
        //结果输出至两个文本框
        document.getElementById("content").style.height = winHeight + 'px';
        document.getElementById("content").style.width = winWidth + 'px';
        console.log("height:"+winHeight+",width:"+winWidth);

        document.getElementById("localtime").style.height = winHeight + 'px';
        document.getElementById("localtime").style.width = winWidth + 'px';

    })

</script>


<!--遮罩层-->
<div class="bgPop"></div>
<!--弹出框-->
<div class="pop">
    <div class="pop-top">
        报警记录
        <span class="pop-close">Ｘ</span>
    </div>
    <div class="pop-content">
        <table class="panel-table" bordercolor="#deefff" border="1">
            <thead bgcolor="#971212" align="center">
            <tr height="38">
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
            </tr>
            </thead>
            <tbody>
            <tr class="aaa" style="font-size: 16px;" align="center">
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr class="aaa" style="font-size: 16px;" align="center">
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr class="aaa" style="font-size: 16px;" align="center">
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>

            <tr class="aaa" style="font-size: 16px;" align="center">
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="pop-foot">
        <input type="button" value="确定" class="pop-cancel pop-close">
    </div>
</div>
<script>
    $(document).ready(function () {
        $('.pop-close').click(function () {
            $('.bgPop,.pop').hide();
        });
        $('.click_pop').click(function () {
            $('.bgPop,.pop').show();
        });
    })

</script>

<script type="text/javascript" src="${path}/static/js/common/jquery.min.js"></script>
<script type="text/javascript" src="${path}/static/js/common/echarts.min.js"></script>
<script type="text/javascript" src="${path}/static/js/common/china.js"></script>
<script type="text/javascript" src="${path}/static/js/common/vue.min.js"></script>
<script type="text/javascript" src="${path}/static/js/map.js"></script>
<script type="text/javascript" src="${path}/static/js/common/times.js"></script>
<script type="text/javascript" src="${path}/static/js/target.js"></script>
<script type="text/javascript" src="${path}/static/js/data.js"></script>
<script type="text/javascript" src="${path}/static/js/index.js"></script>
</body>
</html>
