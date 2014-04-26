/**
 * 
 */
package com.ys.ipc.cert;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletModeException;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author shashantp
 *
 */
public class IPCParent extends MVCPortlet{

	public void checkName(ActionRequest request,ActionResponse response) 
			throws ReadOnlyException, PortletModeException, ValidatorException, IOException{
		System.out.println("Inside check name action");
		
		String name=ParamUtil.get(request,"paramName","");
		response.setRenderParameter("foo", name);
		
		QName qname = new QName("http://liferay.com/events","firstEvent");
		response.setEvent(qname,"Event processed this : "+name);
		//response.sendRedirect("/web/guest/sample");
		
		//super.sendRedirect(request, response);
	}
	
}
