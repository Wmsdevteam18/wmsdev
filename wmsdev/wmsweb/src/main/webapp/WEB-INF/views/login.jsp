<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login to WMS</title>
</head>
<body>

<sf:form action="authenticate" commandName="userBean">
		<%-- <sf:errors path="*"/> --%>
		username : <sf:input path="userName" type="text"/>  
		<!-- <input type="text" name="userName"/> -->
		<sf:errors path="userName"/>
		<br/>
		password :  <sf:input path="password" type="password"/> 
		<!-- <input type="text" name="password"/> -->
		<sf:errors path="password"/>
		<br/>
		<sf:button type="submit">Login</sf:button> <!-- <input type="submit" value="login"/> -->
	
</sf:form>

</body>
</html>