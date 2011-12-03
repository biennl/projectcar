package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
public class AddContactAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			
			ActionForward forward = null;
			String errors = "";
			
			//TO BE COMPLETED ...
			
			if(errors.isEmpty())
				forward = mapping.findForward("successAddContact");
			else
				forward = mapping.findForward("error");
			return forward;
	}
}