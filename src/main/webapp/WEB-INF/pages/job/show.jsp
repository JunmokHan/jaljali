<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Job Detail</title>
</head>
<body>
    <div style="text-align: center;">
        <h2>Job Detail</h2>
    </div>
    <div>
        Job Type
        <div class="form-control">
            <c:out value="${job.type}"/>
        </div>
    </div>
    <div>
        Title
        <div class="form-control">
            <c:out value="${job.title}"/>
        </div>
    </div>
    <div>
        Wage
        <div class="form-control">
            $ <c:out value="${job.wage}"/>
        </div>
    </div>
    <div>
        Working Time
        <div class="form-control">
            <c:out value="${job.workingTime}"/>
        </div>
    </div>
    <div>
        Start Date
        <div class="form-control">
            <fmt:formatDate value="${job.startDate}" pattern="yyyy-MM-dd"/>
        </div>
    </div>
    <div>
        Detail<br/>
        <div>
            <textarea name="content" class="form-control" disabled="disabled">
                <c:out value="${job.content}"/>
            </textarea>
        </div>
    </div>
</body>
</html>
