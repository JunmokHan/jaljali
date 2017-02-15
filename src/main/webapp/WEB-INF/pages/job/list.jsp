<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%--FIXME : 처음에 받아올 목록 개수 설정, 페이징 처리--%>

<html>
<head>
    <title>Job List</title>
</head>
<body>
    <table class="table">
        <tbody>
            <c:choose>
                <c:when test="${jobs.size() > 0}">
                    <c:forEach items="${jobs}" var="job">
                        <tr onclick="location.href='/job/${job.id}'">
                            <td>
                                <div>
                                    <c:choose>
                                        <c:when test="${job.type eq 'EMPLOYER'}">
                                            구인
                                        </c:when>
                                        <c:otherwise>
                                            구직
                                        </c:otherwise>
                                    </c:choose>
                                    &nbsp; | &nbsp;
                                    $ <c:out value="${job.wage}"/>
                                    &nbsp; | &nbsp;
                                    <fmt:formatDate value='${job.handler.created}' pattern='dd/MM/yyyy'/>
                                </div>
                                <div>
                                    <c:choose>
                                        <c:when test="${fn:length(job.title) > 30}">
                                            <c:out value="${fn:substring(job.title, 0, 19)}"/> ...
                                        </c:when>
                                        <c:otherwise>
                                            <c:out value="${job.title}"/>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td style="text-align: center;">
                            Job Information does not exist
                        </td>
                    </tr>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
</body>
</html>
