
<%@ page import="java.sql.SQLException" %>
<%@ page import="Model.CarModel" %>
<%@ page import="bean.ThingBean" %>

<%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/17
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除购物车某项</title>
</head>
<body>
<%
    CarModel model = new CarModel();
    ThingBean bean = new ThingBean();
    int id = Integer.parseInt(request.getParameter("id"));
    bean.setId(id);
    try {
        if (model.deleteThing(bean)) {
            response.sendRedirect("car.jsp");
        } else {
            response.sendRedirect("car.jsp");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

%>
</body>
</html>
