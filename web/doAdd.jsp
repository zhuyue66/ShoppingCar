<%@ page import="java.sql.SQLException" %>
<%@ page import="bean.ThingBean" %>
<%@ page import="Model.CarModel" %>
<%@ page import="Model.ThingModel" %>
<%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/16
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    CarModel model = new CarModel();
    ThingModel thingModel = new ThingModel();
    ThingBean bean = (ThingBean) session.getAttribute("thing");
    int thingNumber = Integer.parseInt(request.getParameter("thingNumber"));
    bean.setThingNumber(thingNumber);
    int newNumber;
    try {
        if (thingNumber < 0) {
            response.sendRedirect("things.jsp");
        }else {
            model.addToCar(bean);
            newNumber = thingModel.queryThingNumber(bean) - thingNumber;
            bean.setThingNumber(newNumber);
            if (newNumber > 0) {
                response.sendRedirect("car.jsp");
                thingModel.updateThing(bean);
            } else {
                response.sendRedirect("things.jsp");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
</body>
</html>
