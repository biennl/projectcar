
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:message key="login.title"/></title>
 <html:base/>
</head>
<body bgcolor="white">
 <html:form action="/login" >
 <html:errors/>
   <table>
        <tr>
          <td align="center" colspan="2">
 		  <font size="4">Please Enter the Following Details</font>
 		</tr>
<tr><td><label for="1">User name</label></td>
<td><html:text property="tbUsername" size="30" maxlength="30" styleId="1"/></td></tr>
<tr><td><label for="2">Password</label></td>
<td><html:password property="tbPass" size="30" styleId="2"/></td></tr>
<tr><td><html:submit  property="btnSubmit">Submit</html:submit></td></tr>
<tr><td><html:reset  property="btnReset">Reset</html:reset></td></tr> 
</table>
</html:form>
</body>
</html:html>