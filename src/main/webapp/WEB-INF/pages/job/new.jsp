<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Job Regist</title>
</head>
<body>
    <form action="/job/create" method="POST">
        <div>
            <h1>Job Regist</h1>
        </div>
        <div>
            <select class="form-control" name="type">
                <option value="EMPLOYER">NEED A WORKER</option>
                <option value="EMPLOYEE">NEED A JOB</option>
            </select>
        </div>
        <div>
            What is the Title?<br/>
            <input name="title" type="text" class="form-control" style="width: 100%;" placeholder="Title" required="required">
        </div>
        <div>
            What is Address? (Based On Google Map)<br/>
            <input name="address" type="text" class="form-control" style="width: 100%;" placeholder="Based On Google Map" required="required">
        </div>
        <div>
            How much is Per a Hour<br/>
            <input name="wage" type="text" class="form-control" style="width: 100%;" placeholder="$ per a Week" required="required">
        </div>
        <div>
            How long is Working Time<br/>
            <input name="time" type="text" class="form-control" style="width: 100%;" placeholder="Working Time" required="required">
        </div>
        <div class="input-group date" id="datepicker">
            When will be Started<br/>
            <%--FIXME : datepicker 로 변경 --%>
            <input name="start" type="text" class="form-control" placeholder="Working Start">
            <span class="input-group-addon">
                <span class="glyphicon glyphicon-calendar"></span>
            </span>
        </div>
        <div>
            Detail<br/>
            <textarea name="content" class="form-control" rows="7" required="required" placeholder="Should be included Your Phone Number or Email"></textarea>
        </div>
        <div style="text-align: center;">
            <button class="btn btn-default">Submit</button>
        </div>
    </form>
</body>
<script type="text/javascript">
    $(function () {
        $('#datetimepicker').datetimepicker();
    });
</script>
</html>
