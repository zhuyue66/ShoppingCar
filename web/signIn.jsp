<%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/11/21
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" import="javax.servlet.http.Cookie" %>


<%
  String username = "";
  String password = "";

  Cookie[] cookies = request.getCookies();
  if (cookies != null) {
    for (int i = 0; i < cookies.length; i++) {
      //对cookies中的数据进行遍历，找到用户名、密码的数据
      if ("username".equals(cookies[i].getName())) {
        username = cookies[i].getValue();
      } else if ("password".equals(cookies[i].getName())) {
        password = cookies[i].getValue();
      }
    }
  }


%>

<html>
<head>
  <title>登录</title>
</head>
<body>
<div style="width: 100%; text-align: center">
  <h1 align="center">登录</h1>
  <form action="things.jsp" method="post">
    <table width="52%" border="50" align="center">
      <tr>
        <td align="center" width="43%">
          <div align="center">用户名：</div>
        </td>
        <td align="center" width="57%">
          <div align="left">
            <input type="text" name="username" value="<%=username%>">
          </div>
        </td>
      </tr>
      <tr>
        <td align="center" width="43%">
          <div align="center">密码：</div>
        </td>
        <td align="center" width="57%">
          <div align="left">
            <input type="password" name="password" value="<%=password%>">
          </div>
        </td>
      </tr>
    </table><br>
    <input type="submit" value="登录">
    <input type="reset" value="取消"><br><br>
    <input type="checkbox" value="save" name="save_password">记住密码<br><br>
    <a href="signUp.jsp">注册</a>
  </form>
</div>
</body>
</html>


