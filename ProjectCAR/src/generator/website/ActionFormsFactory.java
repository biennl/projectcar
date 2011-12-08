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
  protected final String TEXT_1 = "package actionForms;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.*;" + NL + "import java.util.regex.Matcher;  " + NL + "import java.util.regex.Pattern; " + NL + "" + NL + "public class ";
  protected final String TEXT_2 = "ValidationForm extends ActionForm {" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL + "\t";
  protected final String TEXT_3 = NL + "\tprivate String ";
  protected final String TEXT_4 = ";" + NL + "\tpublic String get";
  protected final String TEXT_5 = "(){" + NL + "\t\treturn this.";
  protected final String TEXT_6 = ";" + NL + "\t}\t" + NL + "\tpublic void set";
  protected final String TEXT_7 = "(String val){" + NL + "\t\tthis.";
  protected final String TEXT_8 = " = val;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_9 = NL + "\t\tpublic boolean isValidEmailAddress(String emailAddress){  " + NL + "   \t\t\tString  expression=\"^[\\\\w\\\\-]+(\\\\.[\\\\w\\\\-]+)*@([A-Za-z0-9-]+\\\\.)+[A-Za-z]{2,4}$\";  " + NL + "   \t\t\tCharSequence inputStr = emailAddress;  " + NL + "   \t\t\tPattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  " + NL + "   \t\t\tMatcher matcher = pattern.matcher(inputStr);  " + NL + "   \t\t\treturn matcher.matches(); " + NL + "   \t\t}" + NL + "\t";
  protected final String TEXT_10 = NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void reset(ActionMapping mapping, HttpServletRequest request) {" + NL + "\t\t";
  protected final String TEXT_11 = NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic ActionErrors validate(ActionMapping mapping," + NL + "\t\t\tHttpServletRequest request) {" + NL + "\t\t\t" + NL + "\t\t\tActionErrors errors = new ActionErrors(); " + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_12 = NL + "\t\t\t\tif (get";
  protected final String TEXT_13 = "() == null || get";
  protected final String TEXT_14 = "().length() < 1)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\terrors.add(\"";
  protected final String TEXT_15 = "\", new ActionMessage(\"error.";
  protected final String TEXT_16 = ".";
  protected final String TEXT_17 = "\"));" + NL + "\t\t\t\t}\t" + NL + "\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\t\t\tif (get";
  protected final String TEXT_19 = "() == null || get";
  protected final String TEXT_20 = "().length() < 1)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\terrors.add(\"";
  protected final String TEXT_21 = "\", new ActionMessage(\"error.";
  protected final String TEXT_22 = ".";
  protected final String TEXT_23 = "\"));" + NL + "\t\t\t\t\t} else {" + NL + "\t\t\t\t\t\tif(!isValidEmailAddress(get";
  protected final String TEXT_24 = "()))" + NL + "\t\t\t\t\t\t\terrors.add(\"";
  protected final String TEXT_25 = "Validation\", new ActionMessage(\"error.";
  protected final String TEXT_26 = ".";
  protected final String TEXT_27 = ".Validation\"));" + NL + "\t\t\t\t\t}\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_28 = NL + "\t\t\t\tif(get";
  protected final String TEXT_29 = "() != null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tif(!isValidEmailAddress(get";
  protected final String TEXT_30 = "()))" + NL + "\t\t\t\t\t\t\terrors.add(\"";
  protected final String TEXT_31 = "Validation\", new ActionMessage(\"error.";
  protected final String TEXT_32 = ".";
  protected final String TEXT_33 = ".Validation\"));" + NL + "\t\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_34 = NL + "\t\t\t" + NL + "\t\t\t//TO BE COMPLETED ..." + NL + "\t\t\t" + NL + "\t\t\treturn errors;" + NL + "\t}" + NL + "}" + NL + "#";

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
	ArrayList<TextBox> getters = new ArrayList<TextBox> ();
	boolean hasEmailBox = false;	
	boolean hasDateBox = false;
	for(Control c : ((FormPage)p).getControls()){
	if(c instanceof EmailBox) hasEmailBox = true;
	if( !hasDateBox && c instanceof DateBox) hasDateBox = true;
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
	getters.add((TextBox)c);
	}}
	if(hasEmailBox){
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(resetString);
    stringBuffer.append(TEXT_11);
     for(TextBox c : getters)
			{
				String getter = c.getName().substring(0,1).toUpperCase()+c.getName().substring(1);
				if(((TextBox)c).isRequired() && !(c instanceof EmailBox)){				
			
    stringBuffer.append(TEXT_12);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_17);
    } else if(c instanceof EmailBox){
				if(((EmailBox)c).isRequired()){
    stringBuffer.append(TEXT_18);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_27);
    } else {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(p.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(getter);
    stringBuffer.append(TEXT_33);
    } 
			}
		}
    stringBuffer.append(TEXT_34);
    }}
    return stringBuffer.toString();
  }
}
