<%@ taglib prefix="c" uri="jakarta.tags.core" %> <!--nho import do-->
<!doctype html>
<html>
<head>
    <title>Thanks for joining our email list </title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>

<body>
<div>
    <h3>Thanks for joining our email list</h3>

    <p>Here is the information that you entered:</p>

    <label>Email: </label>
    <span>${user.email}</span><br><br>
    <label>First Name: </label>
    <span>${user.firstName}</span><br><br>
    <label>Last Name: </label>
    <span>${user.lastName}</span><br><br>
    <label>Date of Birth: </label>
    <span>${user.birth}</span><br><br>

    <c:if test="${user.option !=null}">
        <span>Hear about us: ${user.option}</span><br><br>
    </c:if>

    <c:if test="${user.select1 !=null}">
        <span>Receive: ${user.select1}</span><br><br>
    </c:if>

    <c:if test="${user.select2 !=null}">
        <span>Receive: ${user.select2}</span><br><br>
    </c:if>


    <label>Contact: </label>
    <span>${user.contacts}</span><br><br>
    <hr>
    <p>To enter another email address, click on the Back
        button in your browser or the Return button shown
        below.</p>

    <form action="" method="post">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return", id="submit">
    </form>
</div>
</body>
</html>
