package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;

public class StrutsConfigFactory
{
  protected static String nl;
  public static synchronized StrutsConfigFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    StrutsConfigFactory result = new StrutsConfigFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" + NL + "<!DOCTYPE struts-config PUBLIC" + NL + "\"-//Apache Software Foundation//DTD Struts Configuration 1.1//EN\"" + NL + "\"http://jakarta.apache.org/struts/dtds/struts-config_1_3.dtd\">" + NL + "<struts-config>";
  protected final String TEXT_2 = NL + "<form-beans>";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "</form-beans>" + NL + "<action-mappings>";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "</action-mappings>" + NL + "" + NL + "" + NL + "" + NL + "<!-- ========== message file =========================== -->" + NL + "<message-resources parameter=\"Resources\" />" + NL + "</struts-config>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp dwa = (DynamicWebApp) argument; 
    stringBuffer.append(TEXT_1);
     String action="", formbean = ""; 
     for(Page p : dwa.getPages())
{
	if( p instanceof NormalPage )
	{
		EList<NormalControl> normalControls =((NormalPage)p).getControls() ;
		
		for(NormalControl control : normalControls)
		{
			if (control instanceof Link)
			{
				Link link = (Link)control;
				action +="\n <action path=\"/"+ link.getDestination().getName()+"Link\" forward =\"/pages/"+ link.getDestination().getName()+".jsp\" />";
			}
		}		
		
	}else 	
	if( p instanceof FormPage ){
			
		NormalPage success =((FormPage)p).getSuccessTarget();
		NormalPage error = ((FormPage)p).getErrorTarget();
		String name=p.getName().substring(0,1).toUpperCase()+p.getName().substring(1);
		
		action += "\n<action path=\"/"+p.getName()+"\"" +" type=\"servlets."+name+"Action\" "; 
		action += "name=\""+p.getName()+"ValidationForm\" scope=\"request\" > " ;
		if( success != null)
		{
			action +="\n <forward name=\""+ success.getName()+"\" path =\"/pages/"+ success.getName()+".jsp\" />";
		}
		if( error != null)
		{
			action +="\n <forward name=\""+ error.getName()+"\" path =\"/pages/"+ error.getName()+".jsp\" />";
		}
		action += "\n</action>";
 
	formbean += "<form-bean name=\""+p.getName()+"ValidationForm\" type=\"actionForm."+name+"ValidationForm\"/>\n";

	}
    }
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(formbean);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(action);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
