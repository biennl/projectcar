package generator.website;

import java.util.Iterator;
import java.util.*;
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
  protected final String TEXT_1 = "package actionForms;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.*;" + NL + "" + NL + "public class ";
  protected final String TEXT_2 = "ValidationForm extends ActionForm {" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL + "\t";
  protected final String TEXT_3 = NL + "\tprivate String ";
  protected final String TEXT_4 = ";" + NL + "\tpublic String get";
  protected final String TEXT_5 = "(){" + NL + "\t\treturn this.";
  protected final String TEXT_6 = ";" + NL + "\t}\t" + NL + "\tpublic void set";
  protected final String TEXT_7 = "(String val){" + NL + "\t\tthis.";
  protected final String TEXT_8 = " = val;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_9 = NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void reset(ActionMapping mapping, HttpServletRequest request) {" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic ActionErrors validate(ActionMapping mapping," + NL + "\t\t\tHttpServletRequest request) {" + NL + "\t\t\t" + NL + "\t\t\tActionErrors errors = new ActionErrors(); " + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_11 = NL + "\t\t\t\tif (get";
  protected final String TEXT_12 = "() == null || get";
  protected final String TEXT_13 = "().length() < 1)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\terrors.add(\"";
  protected final String TEXT_14 = "\", new ActionMessage(\"error.";
  protected final String TEXT_15 = ".";
  protected final String TEXT_16 = "\"));" + NL + "\t\t\t\t}\t" + NL + "\t\t\t";
  protected final String TEXT_17 = NL + "\t\t\t" + NL + "\t\t\t//TO BE COMPLETED ..." + NL + "\t\t\t" + NL + "\t\t\treturn errors;" + NL + "\t}" + NL + "}" + NL + "$";

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
     String resetString = "" ; 
	ArrayList<String> getters = new ArrayList<String> ();
	
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
      resetString +="set"+c.getName().substring(0,1).toUpperCase()+c.getName().substring(1)+"(null);\n\t\t";
	getters.add(c.getName().substring(0,1).toUpperCase()+c.getName().substring(1));
	
	}}
    stringBuffer.append(TEXT_9);
    stringBuffer.append(resetString);
    stringBuffer.append(TEXT_10);
     for(String getter : getters)
			{
    stringBuffer.append(TEXT_11);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_16);
    } 
    stringBuffer.append(TEXT_17);
    }}
    return stringBuffer.toString();
  }
}
