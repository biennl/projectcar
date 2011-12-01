package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;;

public class FormPageFactory
{
  protected static String nl;
  public static synchronized FormPageFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    FormPageFactory result = new FormPageFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"" + NL + "    pageEncoding=\"ISO-8859-1\"%>" + NL + "<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %>" + NL + "<%@ taglib prefix=\"html\" uri=\"http://struts.apache.org/tags-html\" %>" + NL + "<%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\" %>" + NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + NL + "" + NL + "<html:html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" + NL + "<title><bean:message key=\"";
  protected final String TEXT_3 = ".title\"/></title>" + NL + " <html:base/>" + NL + "</head>" + NL + "<body bgcolor=\"white\">" + NL + " <html:form action=\"";
  protected final String TEXT_4 = ".do\" >" + NL + " <html:errors/>" + NL + "   <table>" + NL + "        <tr>" + NL + "          <td align=\"center\" colspan=\"2\">" + NL + " \t\t  <font size=\"4\">Please Enter the Following Details</font>" + NL + " \t\t</tr>";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = " " + NL + "</table>" + NL + "</html:form>" + NL + "</body>" + NL + "</html:html>" + NL + "$";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     DynamicWebApp webApp = (DynamicWebApp) argument;
	for(Page p : webApp.getPages()){
		if(p instanceof FormPage){
		 FormPage fp = (FormPage) p ;
    stringBuffer.append(TEXT_2);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_4);
     int count = 0;for(int i=0; i< fp.getControls().size(); i++) {
 	
 	String balise = "";
 	Control control = fp.getControls().get(i);
 	if (control instanceof Label)
 	{	
 		Label label =(Label)control;count++;
 		balise +="<tr><td><label for=\""+(count)+"\">"+label.getText()+"</label></td>";
 	}else if(control instanceof TextBox) {
 		balise +="<td><html:text property=\""+ control.getName()+ "\" size=\""+ ((TextBox)control).getSize()+ "\"";
 		balise +=" maxlength=\""+ ((TextBox)control).getMaxLength()+ "\" styleId=\""+(count)+"\"";
 		balise +="/></td></tr>";
 	}else if(control instanceof CheckBox) {
 		balise +="<td><html:checkbox "+" property=\""+ control.getName()+ "\"";
 		balise +="/></td></tr>";
 	}else if(control instanceof SubmitButton) {
 		balise +="<tr><td><html:submit "+" property=\""+ control.getName()+ "\">"+((SubmitButton)control).getText()+"</html:submit>";
 		balise +="</td></tr>";
 	}else if(control instanceof ResetButton) {
 		balise +="<tr><td><html:reset "+" property=\""+ control.getName()+ "\">"+((ResetButton)control).getText()+"</html:reset>";
 		balise +="</td></tr>";
 	}else if(control instanceof NormalButton) {
 		balise +="<tr><td><html:button "+" property=\""+ control.getName()+ "\">"+((NormalButton)control).getText()+"</html:button>";
 		balise +="</td></tr>";
 	}else if(control instanceof Link) {
 		balise +="<tr><td><html:link "+" property=\""+ control.getName()+ "\">"+((Link)control).getText()+"</html:link>";
 		balise +="</td></tr>";
 	}else if(control instanceof RadioButton) {
 		balise +="<html:radio "+" property=\""+ control.getName()+ "\" value="+((RadioButton)control).getValue()+ ">"+((RadioButton)control).getText();
 		balise +="</html:radio>";
 		balise +="</td></tr>";
 	}else if(control instanceof DropDownList) {
 		balise +="<td><html:select "+" property=\""+ control.getName()+ "\">";
 		DropDownList list = (DropDownList)control;
 		for(int j = 0; j< list.getElements().size(); i++)
 		{
 			balise += "<html:option value=\""+list.getElements().get(i).getValue()+"\">";
 			balise +=list.getElements().get(i).getValue()+"</html:option>";
 		} 
 		balise +="</html:select></td></tr>";
 	
}
    stringBuffer.append(TEXT_5);
    stringBuffer.append(balise);
     }
    stringBuffer.append(TEXT_6);
    }}
    return stringBuffer.toString();
  }
}
