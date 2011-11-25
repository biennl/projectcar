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
  protected final String TEXT_4 = "\" >" + NL + " <html:errors/>" + NL + "   <table>" + NL + "        <tr>" + NL + "          <td align=\"center\" colspan=\"2\">" + NL + " \t\t  <font size=\"4\">Please Enter the Following Details</font>" + NL + " \t\t</tr>" + NL + " <% for(int i=0; i< fp.getControls.length; i++) {" + NL + " \tif ()" + NL + " }" + NL + " %>" + NL + "\t" + NL + "}$>" + NL + "</body>" + NL + "</html>" + NL + "$";

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
    }}
    return stringBuffer.toString();
  }
}
