<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<html>
<head>
    <title>House List</title>
</head>
<body>
    <table>
        <colgroup>
            <col width="10%">
            <col width="*">
            <col width="15%">
        </colgroup>
        <thead>
        <td style="text-align: center;">Type</td>
        <td style="text-align: center;">Title</td>
        <td style="text-align: center;">Created</td>
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${houses.size() > 0}">
                <c:forEach items="${houses}" var="house">
                    <tr>
                        <td style="text-align: center;">
                            <c:choose>
                                <c:when test="${house.type eq 'SHARE'}">
                                    쉐어
                                </c:when>
                                <c:otherwise>
                                    렌트
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td style="text-align: center;">
                            <c:choose>
                                <c:when test="${fn:length(house.title) > 30}">
                                    <c:out value="${fn:substring(house.title, 0, 19)}"/> ...
                                </c:when>
                                <c:otherwise>
                                    <c:out value="${house.title}"/>
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <fmt:formatDate value='${house.handler.created}' pattern='dd/MM/yyyy'/>
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
