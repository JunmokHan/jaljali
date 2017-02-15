<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--<% request.setCharacterEncoding("euc-kr"); %>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>

<head>
    <title>Main</title>
</head>
<body>
    <jsp:include page="layout/header.jsp"/>
    <jsp:include page="${page}.jsp"/>
</body>

</html>