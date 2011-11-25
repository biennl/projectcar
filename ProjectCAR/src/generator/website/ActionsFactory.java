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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".servlets;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "import org.apache.struts.action.*;" + NL + "public class ";
  protected final String TEXT_3 = "Action extends Action {" + NL + "\tpublic ActionForward execute(ActionMapping mapping, ActionForm form," + NL + "\t\t\tHttpServletRequest request, HttpServletResponse response)" + NL + "\t\t\tthrows Exception {" + NL + "\t}" + NL + "}" + NL + "$";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument; 
	for(Page p : webApp.getPages()){
		if(p instanceof FormPage){
			String name=p.getName().substring(0,1).toUpperCase()+p.getName().substring(1);
    stringBuffer.append(TEXT_1);
    stringBuffer.append(webApp.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_3);
    }}
    return stringBuffer.toString();
  }
}
