package actionForms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 

public class LoginValidationForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private String tbUsername;
	public String getTbUsername(){
		return this.tbUsername;
	}	
	public void setTbUsername(String val){
		this.tbUsername = val;
	}
		
		
	private String tbPass;
	public String getTbPass(){
		return this.tbPass;
	}	
	public void setTbPass(String val){
		this.tbPass = val;
	}
		
		
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		setTbUsername(null);
		setTbPass(null);
		
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
			
			ActionErrors errors = new ActionErrors(); 
			
			
				if (getTbUsername() == null || getTbUsername().length() < 1)
				{
					errors.add("TbUsername", new ActionMessage("error.login.TbUsername"));
				}	
			
				if (getTbPass() == null || getTbPass().length() < 1)
				{
					errors.add("TbPass", new ActionMessage("error.login.TbPass"));
				}	
			
			
			//TO BE COMPLETED ...
			
			return errors;
	}
}