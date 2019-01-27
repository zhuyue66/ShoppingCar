<%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/12
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="bean.ThingBean" %>
<%@ page import="Model.ThingModel" %>
<%@ page import="java.sql.SQLException" %>
<jsp:useBean id="thingBean" scope="session" class="bean.ThingBean"/>

<%
    ThingModel model = new ThingModel();
    List<ThingBean> list = null;
    try {
        list = model.queryThing();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>

<html>
<head>
    <title>物品</title>
</head>
<body>

<div style="text-align:right;font-size:20px;">
    <a href="car.jsp">我的购物车</a>
</div>

<table width="66%" border="10" align="center">
    <tr>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; ">物品</span>
            </div>
        </td>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; ">单价</span>
            </div>
        </td>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; ">还剩</span>
            </div>
        </td>
    </tr>
</table>
<br>

<%for (ThingBean bean : list) {%>
<table width="66%" border="1" align="center">
    <tr>
        <td align="center" width="33%">
            <div align="center"><a href="thingDetails.jsp?id=<%=bean.getId()%>"><%=bean.getThingName()%>
            </a></div>
        </td>
        <td align="center" width="33%">
            <div align="center"><%=bean.getThingPrice()%>
            </div>
        </td>
        <td align="center" width="33%">
            <div align="center"><%=bean.getThingNumber()%>
            </div>
        </td>
    </tr>
</table>
<%}%>

</body>
</html>
