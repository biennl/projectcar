package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import webapp.*;;

public class SimpleToXML
{
  protected static String nl;
  public static synchronized SimpleToXML create(String lineSeparator)
  {
    nl = lineSeparator;
    SimpleToXML result = new SimpleToXML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    return stringBuffer.toString();
  }
}
