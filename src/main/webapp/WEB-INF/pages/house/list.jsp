<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<%--FIXME : 처음에 받아올 목록 개수 설정, 페이징 처리--%>

<html>
<head>
    <title>House List</title>
</head>
<body>
    <table class="table">
        <tbody>
            <c:choose>
                <c:when test="${houses.size() > 0}">
                    <c:forEach items="${houses}" var="house">
                        <tr onclick="location.href='/house/${house.id}'">
                            <td>
                                <div>
                                    <%-- FIXME : 버튼 또는 이미지화 시킬 것--%>
                                    <h5>
                                    <c:choose>
                                        <c:when test="${house.type eq 'SHARE'}">
                                            SHARE
                                        </c:when>
                                        <c:otherwise>
                                            RENT
                                        </c:otherwise>
                                    </c:choose>
                                    &nbsp; | &nbsp;
                                    $ <c:out value="${house.price}"/>
                                    &nbsp; | &nbsp;
                                    <fmt:formatDate value='${house.handler.created}' pattern='dd/MM/yyyy'/>
                                    </h5>
                                </div>
                                <div>
                                    <c:choose>
                                        <c:when test="${fn:length(house.title) > 30}">
                                            <c:out value="${fn:substring(house.title, 0, 16)}"/> ...
                                        </c:when>
                                        <c:otherwise>
                                            <c:out value="${house.title}"/>
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
                            House Information does not exist
                        </td>
                    </tr>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
</body>
</html>
