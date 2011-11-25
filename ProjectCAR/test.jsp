
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
	<h1><bean:message key="label.header"/> </h1>
	<div>
		<a href="/TutorialStruts/ContactCreation.do"><bean:message key="hlink.addContact"/></a>
	</div>
	
	<div>
		<a href="/TutorialStruts/ListContactDisplaying.do"><bean:message key="hlink.displayListOfContact"/></a>
	</div>
</body>
</html>