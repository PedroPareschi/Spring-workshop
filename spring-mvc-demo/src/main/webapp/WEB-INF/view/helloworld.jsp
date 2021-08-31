<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"

          href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
Hello World of Spring
<br><br>

Student name: ${param.studentName}

<br><br>

The message: ${message}

<br><br>

<img src="${pageContext.request.contextPath}/resources/images/image.png" alt="Spring">

</body>
</html>
