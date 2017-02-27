<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Class 정하고 CSS 먹여서 padding 이나 Border 줄 것--%>


<script>
    $(function () {
        var page = '${page}';
        var pageArr = page.split("/");
        var createPage = pageArr[0];
        $('#create').attr("href", "/"+createPage+"/create");

        $(document).ready();
    });
</script>
<ul class="nav nav-pills" style="background-color: rebeccapurple;">
    <div>
        <p style="color: whitesmoke;">
        본 페이지는 모바일에 최적화 되어 있습니다.
        </p>
    </div>
    <li role="presentation">
        <%--FIXME : login 시 사용자 정보 수정 화면, 비로그인시 회원가입 화면 --%>
        <%--<c:choose>--%>
            <%--<c:when test="">--%>
                <%--<a href="#" style="color: whitesmoke;" class="glyphicon glyphicon-user"></a>--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <a href="#" style="color: whitesmoke;" class="glyphicon glyphicon-user"></a>
            <%--</c:otherwise>--%>
        <%--</c:choose>--%>
    </li>
    <li role="presentation">
        <a href="/house" style="color: whitesmoke;" class="glyphicon glyphicon-home"></a>
    </li>
    <li role="presentation">
        <a href="/job" style="color: whitesmoke;" class="glyphicon glyphicon-usd"></a>
    </li>
    <li role="presentation" style=" float: right;">
        <a id="create" style="color: whitesmoke;" class="glyphicon glyphicon-pencil"></a>
    </li>
</ul>