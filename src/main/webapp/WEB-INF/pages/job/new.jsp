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
            <input name="workingTime" type="text" class="form-control" style="width: 100%;" placeholder="Working Time" required="required">
        </div>
        <div>
            When will be Started<br/>
            <%--FIXME : datepicker 로 변경 --%>
            <input name="startDate" type="text" class="form-control" placeholder="YYYY-MM-DD">
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
</html>
