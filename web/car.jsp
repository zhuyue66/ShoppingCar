<%@ page import="java.util.List" %>
<%@ page import="bean.CarBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Model.CarModel" %><%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/16
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>

<div style="text-align:right;font-size:20px;">
    <a href="things.jsp">物品</a>
</div>

<%
    CarModel model = new CarModel();
    List<CarBean> list = new ArrayList<>();
    try {
        list = model.queryCar();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>

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
                <span style="font-size: large; ">数量</span>
            </div>
        </td>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; ">删除</span>
            </div>
        </td>
    </tr>
</table>


<%for (CarBean bean : list) {%>
<table width="66%" border="1" align="center">
    <tr>
        <td align="center" width="25%">
            <div align="center"><%=bean.getCarThingName()%></div>
        </td>
        <td align="center" width="25%">
            <div align="center"><%=bean.getCarThingPrice()%></div>
        </td>
        <td align="center" width="25%">
            <div align="center"><%=bean.getCarThingNumber()%></div>
        </td>
        <td align="center" width="25%">
            <div align="center"><a href="deleteCarThing.jsp?id=<%=bean.getId()%>">删除
            </a></div>
        </td>
    </tr>
</table>
<%}%>

<table width="66%" border="1" align="center">
    <tr>
        <td align="center">
            <span style="font-size: large; ">总金额：</span>
        </td>
        <td align="center"><span style="font-size: large; "><%=model.carSum()%></span></td>
    </tr>
</table>
</body>
</html>
