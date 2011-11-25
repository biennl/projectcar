package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class WebConfigToXML
{
  protected static String nl;
  public static synchronized WebConfigToXML create(String lineSeparator)
  {
    nl = lineSeparator;
    WebConfigToXML result = new WebConfigToXML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" id=\"WebApp_ID\" version=\"2.5\">" + NL + "  <display-name>";
  protected final String TEXT_2 = "</display-name>" + NL + "  <welcome-file-list>";
  protected final String TEXT_3 = NL + "    <welcome-file>";
  protected final String TEXT_4 = "</welcome-file>";
  protected final String TEXT_5 = NL + "  </welcome-file-list>" + NL + "    <!-- Configuration de l'action servlet -->" + NL + "  <servlet>" + NL + "        <servlet-name>action</servlet-name>" + NL + "        <servlet-class>org.apache.struts.action.ActionServlet</servlet-class>" + NL + "        <init-param>" + NL + "            <param-name>config</param-name>" + NL + "            <param-value>/WEB-INF/struts-config.xml</param-value>" + NL + "        </init-param>" + NL + "        <load-on-startup>1</load-on-startup>" + NL + "    </servlet>" + NL + "    <servlet-mapping>" + NL + "        <servlet-name>action</servlet-name>" + NL + "        <url-pattern>*.do</url-pattern>" + NL + "    </servlet-mapping>" + NL + "    <resource-ref>" + NL + "    \t<description></description>" + NL + "    \t<res-ref-name></res-ref-name>" + NL + "    \t<res-type></res-type>" + NL + "    \t<res-auth></res-auth>" + NL + "    </resource-ref>" + NL + "    <session-config>" + NL + "        <session-timeout></session-timeout>" + NL + "    </session-config>" + NL + "</web-app>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(webApp.getName());
    stringBuffer.append(TEXT_2);
    for(Page p: webApp.getPages()){if(p.isDefault()){
    stringBuffer.append(TEXT_3);
    stringBuffer.append("pages/"+p.getName()+".jsp");
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
