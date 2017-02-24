<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Class 정하고 CSS 먹여서 padding 이나 Border 줄 것--%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0"/>

<link rel="stylesheet" href="/style/css/style.css">
<%--FIXME : 화면 크기 별 CSS(글자 크기, 간격 조절, 크기 조절) 파일 생성 --%>

<script>
    $(function () {
        var page = '${page}';
        var pageArr = page.split("/");
        var createPage = pageArr[0];
        $('#create').attr("href", "/"+createPage+"/create");
    })
</script>
<ul class="nav nav-pills" style="background-color: rebeccapurple;">
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