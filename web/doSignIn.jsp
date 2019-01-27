
<%@ page import="java.sql.SQLException" %>
<%@ page import="Model.UserModel" %>
<%@ page import="bean.UserBean" %><%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/16
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%
    UserModel model = new UserModel();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    UserBean user = new UserBean();
    user.setUsername(username);
    user.setPassword(password);
    try {
        if (model.signIn(user)) {
            if ("save".equals(request.getParameter("save_password"))) {
                Cookie nameCookie = new Cookie("username", username);
                nameCookie.setMaxAge(86400 * 7);
                Cookie passwordCookie = new Cookie("password", password);
                passwordCookie.setMaxAge(86400 * 7);
                response.addCookie(nameCookie);
                response.addCookie(passwordCookie);
                System.out.println("写入Cookies:" + username + " " + password + " ");
            }
            System.out.println("登陆成功");
            response.sendRedirect("things.jsp");
        } else {
            response.sendRedirect("signIn.jsp");
            System.out.println("登陆失败");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
</body>
</html>
