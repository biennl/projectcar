package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;;

public class ResourcesFileFactory
{
  protected static String nl;
  public static synchronized ResourcesFileFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    ResourcesFileFactory result = new ResourcesFileFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "\t\t";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "\t\t\t";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "\t\t\t";
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = "\t\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = "\t\t\t\t\t" + NL + "\t\t";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = "\t\t\t\t\t" + NL + "\t\t";
  protected final String TEXT_14 = NL + "\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     DynamicWebApp webApp = (DynamicWebApp) argument; 
    stringBuffer.append(TEXT_1);
    for (Page p : webApp.getPages()){
		String pageName = p.getName();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(pageName+".title="+p.getTitle());
    stringBuffer.append(TEXT_3);
    if(p instanceof NormalPage){
			for(NormalControl c : ((NormalPage)p).getControls()){
    stringBuffer.append(TEXT_4);
    stringBuffer.append(pageName+"."+c.getName()+".text="+c.getText());
    stringBuffer.append(TEXT_5);
    }
		} else if(p instanceof FormPage){
			for(Control c : ((FormPage)p).getControls()){
				String controlText="";
				String errorText="";
				String validEmail="";
				String validDate ="";
				String format = "";
				if(c instanceof FormButton)
					controlText = ((FormButton)c).getText();
				else if(c instanceof NormalControl)
					controlText = ((NormalControl)c).getText();
				else if ((c instanceof TextBox) && ((TextBox)c).isRequired() )
					errorText = c.getName().substring(0,1).toUpperCase()+c.getName().substring(1);
				if(c instanceof EmailBox)
					validEmail = c.getName().substring(0,1).toUpperCase()+c.getName().substring(1);
				if(c instanceof DateBox){
					validDate = c.getName().substring(0,1).toUpperCase()+c.getName().substring(1);
					DateFormat dateFormat = ((DateBox)c).getFormat();
				    format = (dateFormat == DateFormat.DAY_MONTH_YEAR) ? "jj-mm-aaaa" : "aaaa-mm-jj";
					}
				if(!controlText.isEmpty()){
    stringBuffer.append(TEXT_6);
    stringBuffer.append(pageName+"."+c.getName()+".text="+controlText);
    stringBuffer.append(TEXT_7);
    }
				if(!errorText.isEmpty()){
    stringBuffer.append(TEXT_8);
    stringBuffer.append("error."+pageName+"."+errorText+"="+errorText+" is required | ");
    stringBuffer.append(TEXT_9);
    }
				if(!validEmail.isEmpty()){
    stringBuffer.append(TEXT_10);
    stringBuffer.append("error."+pageName+"."+validEmail+".Validation"+"="+validEmail+" is not valid! (example@upmc.fr)| ");
    stringBuffer.append(TEXT_11);
    }
		 if(!validDate.isEmpty()){
    stringBuffer.append(TEXT_12);
    stringBuffer.append("error."+pageName+"."+validDate+".Validation"+"="+validDate+" is not valid! (" +format+")| ");
    stringBuffer.append(TEXT_13);
    } 	
		}
    stringBuffer.append(TEXT_14);
    }}
    return stringBuffer.toString();
  }
}
