package actionForms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 

public class UpdateContactValidationForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
			
			ActionErrors errors = new ActionErrors(); 
			
			
			
			//TO BE COMPLETED ...
			
			return errors;
	}
}