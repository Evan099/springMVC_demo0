<%--
  Created by IntelliJ IDEA.
  User: lipanchen
  Date: 2020/1/14
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${name}

    商品名称：${requestScope.goods.name}<br>
    商品价格：${requestScope.goods.price}
</body>
</html>
