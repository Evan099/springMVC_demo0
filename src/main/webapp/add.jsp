<%--
  Created by IntelliJ IDEA.
  User: lipanchen
  Date: 2020/1/14
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addGoods" method="post">


    <table>
        <tr>
            <td>名称：</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td>价格：</td>
            <td><input type="text" name="price"></td>
        </tr>

    </table>

    <button type="submit">提交</button>
</form>


</body>
</html>
