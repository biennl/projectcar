
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:message key="addContact.title"/></title>
 <html:base/>
</head>
<body bgcolor="white">
 <html:form action="/addContact" >
 <html:errors/>
   <table>
        <tr>
          <td align="center" colspan="2">
 		  <font size="4">Please Enter the Following Details</font>
 		</tr>
<tr><td><label for="1">Contact ID</label></td>
<td><html:text property="tbID" size="30" maxlength="30" styleId="1"/></td></tr>
<tr><td><label for="2">First Name</label></td>
<td><html:text property="tbFirstName" size="30" maxlength="30" styleId="2"/></td></tr>
<tr><td><label for="3">Last Name</label></td>
<td><html:text property="tbLastName" size="30" maxlength="30" styleId="3"/></td></tr>
<tr><td><label for="4">Email address</label></td>
<td><html:text property="tbEmail" size="30" maxlength="30" styleId="4"/></td></tr>
<tr><td><label for="5">Date naissance</label></td>
<td><html:text property="tbDateNaissance" size="8" maxlength="12" styleId="5"/></td></tr>
<tr><td><label for="6">Sex</label></td>
<td>
<html:radio  property="sexe" value="Male">Male</html:radio>
<html:radio  property="sexe" value="Female">Female</html:radio></td></tr>
<tr><td><label for="7">Maried</label></td>
<td><html:checkbox  property="married"/></td></tr>
<tr><td><label for="8">niveau</label></td>
<td><html:select  property="niveauEtude"><html:option value="licence">licence</html:option><html:option value="master">master</html:option></html:select></td></tr>
<tr><td><html:submit  property="btnSubmit">Submit</html:submit></td></tr>
<tr><td><html:reset  property="btnReset">Reset</html:reset></td></tr> 
</table>
</html:form>
</body>
</html:html>