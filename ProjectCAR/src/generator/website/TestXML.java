package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;;

public class TestXML
{
  protected static String nl;
  public static synchronized TestXML create(String lineSeparator)
  {
    nl = lineSeparator;
    TestXML result = new TestXML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"" + NL + "    pageEncoding=\"ISO-8859-1\"%>" + NL + "<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %>" + NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + NL + "<html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" + NL + "<title><bean:message key=\"main.title\"/></title>" + NL + "</head>" + NL + "<body>" + NL + "\t<h1><bean:message key=\"label.header\"/> </h1>" + NL + "\t<div>" + NL + "\t\t<a href=\"/TutorialStruts/ContactCreation.do\"><bean:message key=\"hlink.addContact\"/></a>" + NL + "\t</div>" + NL + "\t";
  protected final String TEXT_2 = NL + "\t<div>" + NL + "\t\t<a href=\"/TutorialStruts/ListContactDisplaying.do\"><bean:message key=\"hlink.displayListOfContact\"/></a>" + NL + "\t</div>" + NL + "</body>" + NL + "</html>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    try { FileWriter output = new FileWriter("./templates/abc.jspjet");BufferedWriter writer = new BufferedWriter(output);
	writer.write("OK");
			writer.close();} catch (IOException e) {
			e.printStackTrace();
		}
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
