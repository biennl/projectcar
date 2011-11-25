package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class ActionsFactory
{
  protected static String nl;
  public static synchronized ActionsFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionsFactory result = new ActionsFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package org.lip6.struts.servletAction;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "" + NL + "import org.apache.struts.action.*;" + NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument; 
	for(Page p : webApp.getPages()){
		if(p instanceof NormalPage){
    stringBuffer.append(TEXT_1);
    }}
    return stringBuffer.toString();
  }
}
