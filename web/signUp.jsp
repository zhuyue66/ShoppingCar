<%--
  Created by IntelliJ IDEA.
  User: zhuda
  Date: 2018/12/12
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div style="width: 100%; text-align: center">
    <h1 align="center">注册</h1>
    <form action="doSignUp.jsp" method="post">
        <table width="52%" border="50" align="center">
            <tr>
                <td align="center" width="43%">
                    <div align="center">用户名：</div>
                </td>
                <td align="center" width="57%">
                    <div align="left">
                        <input type="text" name="username">
                    </div>
                </td>
            </tr>
            <tr>
                <td align="center" width="43%">
                    <div align="center">密码：</div>
                </td>
                <td align="center" width="57%">
                    <div align="left">
                        <input type="text" name="password">
                    </div>
                </td>
            </tr>
            <tr>
                <td align="center" width="43%">
                    <div align="center">确认密码：</div>
                </td>
                <td align="center" width="57%">
                    <div align="left">
                        <input type="text" name="confirmPassword">
                    </div>
                </td>
            </tr>
        </table><br>
        <input type="submit" value="注册">
        <input type="reset" value="取消"><br><br>
    </form>
</div>
</body>
</html>
