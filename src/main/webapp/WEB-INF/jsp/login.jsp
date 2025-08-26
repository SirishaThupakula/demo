
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

<head>
<title>First Web Application</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>
</head>
<script type="text/javascript">

</script>

<body>
    <font color="red">${errorMessage}</font>
    <form method="post" >
        Name : <input type="text" name="cossName" />
        Email : <input type="email" name="cossEmail" />
        Mobile:<input type="text" name="cossMobile" />
        <input type="submit" />

        <%--<form method="post" modelAttribute="cossStudent" action="/login" name="cossStudent">
        Name : <form:input path="cossName" id="fname" />
        Email : <form:input path="cossEmail" id="cemail"/>
        Mobile: <form:input path="cossMobile" id="cmobile"/>
        <input type="submit" />--%>
    </form>
</body>

</html>