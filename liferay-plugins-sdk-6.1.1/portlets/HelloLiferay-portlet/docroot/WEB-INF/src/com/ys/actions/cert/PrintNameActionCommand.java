/**
 * 
 */
package com.ys.actions.cert;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.ActionCommand;

/**
 * @author shashantp
 *
 */
public class PrintNameActionCommand implements ActionCommand{

	@Override
	public boolean processCommand(PortletRequest request, PortletResponse response)
			throws PortletException {
			System.out.println("PrintNameActionCommand : Inside enter name action");
		
		String name=ParamUtil.get(request,"name","");
		System.out.println("Fetched name is : "+name);
		
		return true;
	}	
}
