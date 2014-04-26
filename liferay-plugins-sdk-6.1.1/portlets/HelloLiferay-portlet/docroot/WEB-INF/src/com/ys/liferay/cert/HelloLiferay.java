/**
 * 
 */
package com.ys.liferay.cert;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author shashantp
 *
 */
public class HelloLiferay extends MVCPortlet{
	
	/*public void enterName(ActionRequest request,ActionResponse response) 
			throws ReadOnlyException, PortletModeException, ValidatorException, IOException{
		System.out.println("Inside enter name action");
		
		String name=ParamUtil.get(request,"name","");
		PortletPreferences pref = request.getPreferences();
		pref.setValue("Name", name);
		pref.store();
		
		request.setAttribute("userName", name);
		
		response.setPortletMode(PortletMode.VIEW);
	}*/
	
	@Override
    public void doView(RenderRequest renderRequest,
            RenderResponse renderResponse) throws IOException, PortletException {
        // TODO Auto-generated method stub
        System.out.println("HelloPortlet is called!");    
        PortletRequestDispatcher dispatcher = null;
        String pageName = (String) renderRequest.getAttribute("pageName");
        if(pageName != null && pageName.equals("view")) {
            renderResponse.setContentType("text/html");
            System.out.println("********************");
            dispatcher = getPortletContext().getRequestDispatcher("/html/helloLiferay/view.jsp");
            dispatcher.include(renderRequest, renderResponse);
        } else {
            super.doView(renderRequest, renderResponse);
        }
    }
	
}
