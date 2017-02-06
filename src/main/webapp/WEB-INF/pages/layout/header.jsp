<%--Class 정하고 CSS 먹여서 padding 이나 Border 줄 것--%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0"/>

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
        <a href="/house" style="color: azure;" class="glyphicon glyphicon-home"></a>
    </li>
    <li role="presentation">
        <a href="#" style="color: azure;" class="glyphicon glyphicon-envelope"></a>
    </li>
    <li role="presentation">
        <a href="/job" style="color: azure;" class="glyphicon glyphicon-usd"></a>
    </li>
    <li role="presentation" style=" float: right;">
        <a id="create" style="color: azure;" class="glyphicon glyphicon-pencil"></a>
    </li>
</ul>