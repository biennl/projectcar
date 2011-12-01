package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;;

public class NormalPageFactory
{
  protected static String nl;
  public static synchronized NormalPageFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    NormalPageFactory result = new NormalPageFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"" + NL + "    pageEncoding=\"ISO-8859-1\"%>" + NL + "<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %>" + NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + NL + "<html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" + NL + "<title><bean:message key=\"";
  protected final String TEXT_2 = ".title\"/></title>" + NL + "</head>" + NL + "<body>";
  protected final String TEXT_3 = NL + "\t\t<div>" + NL + "\t\t\t<a href=\"";
  protected final String TEXT_4 = "Link.do\"><bean:message key=\"";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ".text\"/></a>" + NL + "\t\t</div>" + NL + "\t";
  protected final String TEXT_7 = NL + "\t\t<div>" + NL + "\t\t\t";
  protected final String TEXT_8 = NL + "\t\t</div>" + NL + "\t";
  protected final String TEXT_9 = NL + "</body>" + NL + "</html>" + NL + "$";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    DynamicWebApp webApp = (DynamicWebApp) argument;
	for(Page p : webApp.getPages()){
		if(p instanceof NormalPage){
    stringBuffer.append(TEXT_1);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_2);
    for(NormalControl control : ((NormalPage)p).getControls()){
		if(control instanceof Link){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(((Link)control).getDestination().getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(control.getName());
    stringBuffer.append(TEXT_6);
    }else if(control instanceof Label){
    stringBuffer.append(TEXT_7);
    stringBuffer.append(((Label)control).getText());
    stringBuffer.append(TEXT_8);
    }}
    stringBuffer.append(TEXT_9);
    }}
    return stringBuffer.toString();
  }
}
