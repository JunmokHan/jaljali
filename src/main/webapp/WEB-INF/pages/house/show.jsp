<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>House Detail</title>
</head>
<body>
    <div style="text-align: center;">
        <h2>House Detail</h2>
    </div>
    <div>
        Share Type
        <div class="form-control">
            <c:out value="${house.type}"/>
        </div>
    </div>
    <div>
        Title
        <div class="form-control">
            <c:out value="${house.title}"/>
        </div>
    </div>
    <div>
        Address
        <div class="form-control">
            <c:out value="${house.address}"/>
        </div>
    </div>
    <div>
        Price
        <div class="form-control">
            <c:out value="${house.price}"/>
        </div>
    </div>
    <div>
        People
        <div class="form-control">
            <c:out value="${house.people}"/>
        </div>
    </div>
    <div>
        Detail<br/>
        <div>
            <textarea name="content" class="form-control" disabled="disabled">
                <c:out value="${house.content}"/>
            </textarea>
        </div>
    </div>
</body>
</html>
