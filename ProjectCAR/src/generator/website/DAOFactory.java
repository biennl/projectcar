package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class DAOFactory
{
  protected static String nl;
  public static synchronized DAOFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    DAOFactory result = new DAOFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "public class DAO";
  protected final String TEXT_2 = " {" + NL + "\t\t";
  protected final String TEXT_3 = NL + "\tpublic void add";
  protected final String TEXT_4 = "(";
  protected final String TEXT_5 = "){" + NL + "\t\t// TO DO..." + NL + "\t}" + NL + "\t\t\t" + NL + "\tpublic void delete";
  protected final String TEXT_6 = "(String id){" + NL + "\t\t// TO DO..." + NL + "\t}" + NL + "\t\t\t" + NL + "\tpublic void update";
  protected final String TEXT_7 = "(String id){" + NL + "\t\t// TO DO..." + NL + "\t}" + NL + "\t\t\t" + NL + "\tpublic void find";
  protected final String TEXT_8 = "(String id){" + NL + "\t\t// TO DO..." + NL + "\t}" + NL + "}" + NL + "\t\t#" + NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument;
for(Page p : webApp.getPages()){
		if(p instanceof FormPage && ((FormPage)p).isPersist()){
		
		String fName = p.getName().substring(3);
		String params ="";
		
    stringBuffer.append(TEXT_1);
    stringBuffer.append(fName.substring(0,1).toUpperCase()+fName.substring(1));
    stringBuffer.append(TEXT_2);
    for(Control c : ((FormPage)p).getControls()){
		
		if(c instanceof TextBox || c instanceof RadioButton 
		|| c instanceof DropDownList || c instanceof CheckBox)
		{
			params+=" final String "+c.getName()+", ";		
		}}
    stringBuffer.append(TEXT_3);
    stringBuffer.append(fName.substring(0,1).toUpperCase()+fName.substring(1));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(params.substring(0,params.length()-2));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(fName.substring(0,1).toUpperCase()+fName.substring(1));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(fName.substring(0,1).toUpperCase()+fName.substring(1));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(fName.substring(0,1).toUpperCase()+fName.substring(1));
    stringBuffer.append(TEXT_8);
    
		
		}}
 

    return stringBuffer.toString();
  }
}
