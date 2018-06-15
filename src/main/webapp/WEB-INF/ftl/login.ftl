<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <base id="ctx" href="${ctx}">
    <title>Title</title>
    <!--引入bootstrap样式-->
    <link href="${request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <!--引入jquery脚本-->
    <script src="../../bootstrap/js/jquery.min.js" type="text/javascript"></script>
    <!--引入bootstrap脚本-->
    <script src="../../bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            $("#mybutton").click(function () {
                alert("我是登陆页面")
            });
        });

    </script>
</head>
<body>
    登录页面
    <button id="mybutton">点我</button>
</body>
</html>