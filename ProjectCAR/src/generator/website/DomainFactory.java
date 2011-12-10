package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class DomainFactory
{
  protected static String nl;
  public static synchronized DomainFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    DomainFactory result = new DomainFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t\t";
  protected final String TEXT_2 = NL + "\t\tpublic class ";
  protected final String TEXT_3 = " {" + NL + "\t\t";
  protected final String TEXT_4 = NL + "\t\t" + NL + "\t\tprivate String ";
  protected final String TEXT_5 = ";" + NL + "\t\tpublic String get";
  protected final String TEXT_6 = "(){" + NL + "\t\t\treturn this.";
  protected final String TEXT_7 = ";" + NL + "\t\t}\t" + NL + "\t\tpublic void set";
  protected final String TEXT_8 = "(String val){" + NL + "\t\t\tthis.";
  protected final String TEXT_9 = " = val;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t\t}" + NL + "\t\t#" + NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument;
for(Page p : webApp.getPages()){
		if(p instanceof FormPage && ((FormPage)p).isPersist()){
		
    stringBuffer.append(TEXT_1);
     int n = p.getName().length();
		String fName = p.getName().substring(3);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(fName.substring(0,1).toUpperCase()+fName.substring(1));
    stringBuffer.append(TEXT_3);
    for(Control c : ((FormPage)p).getControls()){
		
		if(c instanceof TextBox || c instanceof RadioButton 
		|| c instanceof DropDownList || c instanceof CheckBox)
		{
    stringBuffer.append(TEXT_4);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(c.getName().substring(0,1).toUpperCase());
    stringBuffer.append(c.getName().substring(1));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(c.getName().substring(0,1).toUpperCase());
    stringBuffer.append(c.getName().substring(1));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_9);
    }}
    stringBuffer.append(TEXT_10);
    }}
 

    return stringBuffer.toString();
  }
}
