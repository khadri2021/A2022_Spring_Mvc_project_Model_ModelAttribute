<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<div align="center">
<h2> Login Form </h2>
<hr>
<form:form action="hit" method="post" modelAttribute="loginForm">
 User <form:input   path="name"/> <br>
 Password <form:input path="pass"/> <br>
 <input type="submit"  value="login"/> <br>
</form:form>

<div>
 
