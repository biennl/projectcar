package actionForms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class AddContactValidationForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private String tbID;
	public String getTbID(){
		return this.tbID;
	}	
	public void setTbID(String val){
		this.tbID = val;
	}
	
	private String tbFirstName;
	public String getTbFirstName(){
		return this.tbFirstName;
	}	
	public void setTbFirstName(String val){
		this.tbFirstName = val;
	}
	
	private String tbLastName;
	public String getTbLastName(){
		return this.tbLastName;
	}	
	public void setTbLastName(String val){
		this.tbLastName = val;
	}
	
	private String tbEmail;
	public String getTbEmail(){
		return this.tbEmail;
	}	
	public void setTbEmail(String val){
		this.tbEmail = val;
	}
	
	
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		setTbID(null);
		setTbFirstName(null);
		setTbLastName(null);
		setTbEmail(null);
		
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
			
			ActionErrors errors = new ActionErrors(); 
			
			
				if (getTbID() == null || getTbID().length() < 1)
				{
					errors.add("TbID", new ActionMessage("TbID is required"));
				}	
			
				if (getTbFirstName() == null || getTbFirstName().length() < 1)
				{
					errors.add("TbFirstName", new ActionMessage("TbFirstName is required"));
				}	
			
				if (getTbLastName() == null || getTbLastName().length() < 1)
				{
					errors.add("TbLastName", new ActionMessage("TbLastName is required"));
				}	
			
				if (getTbEmail() == null || getTbEmail().length() < 1)
				{
					errors.add("TbEmail", new ActionMessage("TbEmail is required"));
				}	
			
			
			//TO BE COMPLETED ...
			
			return errors;
	}
}