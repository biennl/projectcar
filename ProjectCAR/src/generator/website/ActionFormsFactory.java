package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class ActionFormsFactory
{
  protected static String nl;
  public static synchronized ActionFormsFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionFormsFactory result = new ActionFormsFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package actionForms;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.*;" + NL + "public class ";
  protected final String TEXT_2 = "ValidationForm extends ActionForm {" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL + "\t";
  protected final String TEXT_3 = NL + "\tprivate String ";
  protected final String TEXT_4 = ";" + NL + "\tpublic String get";
  protected final String TEXT_5 = "(){" + NL + "\t\treturn this.";
  protected final String TEXT_6 = ";" + NL + "\t}\t" + NL + "\tpublic void set";
  protected final String TEXT_7 = "(String val){" + NL + "\t\tthis.";
  protected final String TEXT_8 = " = val;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_9 = NL + "\t@Override" + NL + "\tpublic ActionErrors validate(ActionMapping mapping," + NL + "\t\t\tHttpServletRequest request) {" + NL + "\t\t\t//TO BE COMPLETED ..." + NL + "\t\t\treturn null;" + NL + "\t}" + NL + "}" + NL + "$";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument; 
	for(Page p : webApp.getPages()){
		if(p instanceof FormPage){
			String name=p.getName().substring(0,1).toUpperCase()+p.getName().substring(1);
    stringBuffer.append(TEXT_1);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_2);
    for(Control c : ((FormPage)p).getControls()){
		if(c instanceof TextBox){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(c.getName().substring(0,1).toUpperCase());
    stringBuffer.append(c.getName().substring(1));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(c.getName().substring(0,1).toUpperCase());
    stringBuffer.append(c.getName().substring(1));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_8);
    }}
    stringBuffer.append(TEXT_9);
    }}
    return stringBuffer.toString();
  }
}
