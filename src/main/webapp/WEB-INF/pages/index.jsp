<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0"/>

<head>
    <title>Main</title>
</head>
<body>
    <jsp:include page="layout/header.jsp"/>
<table>
    <thead>
        <td>Title</td>
        <td>Created</td>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${jobs.size() > 0}">
            <c:forEach items="${jobs}" var="job">
                <tr>
                    <td>
                        <c:choose>
                            <c:when test="${fn:length(job.title) > 30}">
                                <c:out value="${fn:substring(job.title, 0, 19)}"/> ...
                            </c:when>
                            <c:otherwise>
                                <c:out value="${job.title}"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <fmt:formatDate value='${job.handler.created}' pattern='dd-MM-yyyy'/>
                    </td>
                </tr>
            </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="3">
                        게시글이 없습니다.
                    </td>
                </tr>
            </c:otherwise>
        </c:choose>
    </tbody>
</table>
</body>
</html>