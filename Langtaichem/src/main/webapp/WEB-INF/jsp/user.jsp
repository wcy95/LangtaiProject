<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 16-12-30
  Time: 下午11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>邯郸市朗泰化工科技有限公司</title>
    <Link Rel="SHORTCUT ICON" href="http://7xj52s.com1.z0.glb.clouddn.com/logo.png">
    <script src="http://apps.bdimg.com/libs/jquery/1.7.2/jquery.min.js"></script>
</head>
<body>
    <h1>aaa</h1>
    <c:forEach items="${users}" var="user">
        ${user.username}<br>
    </c:forEach>
</body>
</html>
