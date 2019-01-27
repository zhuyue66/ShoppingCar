<%@ page import="java.sql.SQLException" %>
<%@ page import="bean.ThingBean" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.ThingModel" %><%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/16
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详细</title>
</head>
<body>

<%
    ThingModel model = new ThingModel();
    ThingBean bean = new ThingBean();
    String id = request.getParameter("id");
    bean.setId(Integer.parseInt(id));
    List<ThingBean> list = null;
    try {
        list = model.getThingDetail(bean);
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>


<div style="text-align:right;font-size:20px;">
    <a href="car.jsp">我的购物车</a>
    <a href="things.jsp">物品</a>
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
                <span style="font-size: large; ">描述</span>
            </div>
        </td>
    </tr>
</table>

<table width="66%" border="1" align="center">
    <tr>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; "><%=list.get(0).getThingName()%></span>
            </div>
        </td>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; "><%=list.get(0).getThingPrice()%></span>
            </div>
        </td>
        <td align="center" width="25%">
            <div align="center">
                <span style="font-size: large; "><img src="<%=list.get(0).getThingImg()%>" height="200" width="300"></span>
            </div>
        </td>
    </tr>
</table>

<form action="doAdd.jsp">
    <table width="66%" border="1" align="center">
        <tr>
            <td align="center">
                <span style="font-size: large; ">填写数量</span>
                <input type="text" name="thingNumber">
            </td>
            <td align="center">
                <span style="font-size: large; "><input type="submit" value="添加到购物车"></span>
            </td>
        </tr>
    </table>
</form>

<%
    ThingBean tempBean = new ThingBean();
    tempBean.setId(list.get(0).getId());
    tempBean.setThingName(list.get(0).getThingName());
    tempBean.setThingPrice(list.get(0).getThingPrice());
    session.setAttribute("thing", tempBean);
%>
</body>
</html>
