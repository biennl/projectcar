package actionForms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;
public class DeleteContactValidationForm extends ActionForm {
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