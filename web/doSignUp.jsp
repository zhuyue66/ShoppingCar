
<%@ page import="Model.UserModel" %>
<%@ page import="bean.UserBean" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/16
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<%
    UserModel model = new UserModel();
    UserBean bean = new UserBean();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String confirmPassword = request.getParameter("confirmPassword");

    if (!"".equals(password) && password.equals(confirmPassword)) {
        bean.setUsername(username);
        bean.setPassword(password);
        try {
            model.signUp(bean);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("注册成功");
        response.sendRedirect("signIn.jsp");
        System.out.println("注册成功");
    }else {
        System.out.println("填写正确信息");
    }
%>
</body>
</html>
