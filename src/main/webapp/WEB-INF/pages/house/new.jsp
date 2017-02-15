<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>House Regist</title>
</head>
<body>
    <form action="/house/create" method="POST">
        <div style="text-align: center;">
            <h2>House Regist</h2>
        </div>
        <div>
            What kind of Share?
            <select class="form-control" name="type">
                <option value="SHARE">SHARE</option>
                <option value="RENT">RENT</option>
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
            How much is per a Week?<br/>
            <input name="price" type="text" class="form-control" style="width: 100%;" placeholder="$ per a Week" required="required">
        </div>
        <div>
            How many People in this Room?<br/>
            <input name="people" type="text" class="form-control" placeholder="People" required="required">
        </div>
        <div>
            Detail<br/>
            <textarea name="content" class="form-control" rows="7" placeholder="Should be included Your Phone Number or Messenger ID" required="required"></textarea>
        </div>
        <div style="text-align: center;">
            <button class="btn btn-default">Submit</button>
        </div>
    </form>
</body>
</html>
