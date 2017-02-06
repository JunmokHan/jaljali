<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>House Post Regist</title>
</head>
<body>
    <form action="/house/create" method="POST">
        <div>
            <select class="form-control" name="type">
                <option value="SHARE">SHARE </option>
                <option value="RENT">RENT </option>
            </select>
        </div>
        <div>
            What is the Title?<br/>
            <input type="text" class="form-control" style="width: 100%;" placeholder="Title" required="required">
        </div>
        <div>
            What is Address? (Based On Google Map)<br/>
            <input type="text" class="form-control" style="width: 100%;" placeholder="Based On Google Map" required="required">
        </div>
        <div>
            How much is per a Week<br/>
            <input type="text" class="form-control" style="width: 100%;" placeholder="$ per a Week" required="required">
        </div>
        <div>
            How many people in this room?<br/>
            <input type="text" class="form-control" placeholder="People">
        </div>
        <div>
            Detail<br/>
            <textarea class="form-control" rows="7" required="required"></textarea>
        </div>
        <div style="text-align: center;">
            <button type="button" class="btn btn-default">Submit</button>
        </div>
    </form>
</body>
</html>
