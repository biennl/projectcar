<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:message key="main.title"/></title>
</head>
<body>
		<div>
			Welcome to project CAR 2011!
		</div>
	
		<div>
			<a href="addContact.do"><bean:message key="lAddContact.text"/></a>
		</div>
	
		<div>
			<a href="updateContact.do"><bean:message key="lUpdateContact.text"/></a>
		</div>
	
		<div>
			<a href="deleteContact.do"><bean:message key="lDeleteContact.text"/></a>
		</div>
	
</body>
</html>