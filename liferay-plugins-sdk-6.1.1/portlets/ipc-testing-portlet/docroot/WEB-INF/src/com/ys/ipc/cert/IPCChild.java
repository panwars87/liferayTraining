package com.ys.ipc.cert;

import java.io.IOException;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class IPCChild
 */
public class IPCChild extends MVCPortlet {
 
	@ProcessEvent(qname="{http://liferay.com/events}firstEvent")
	public void processMyEvent(EventRequest request,EventResponse response){
		System.out.println("Inside processing event");
		String eventParamValue= request.getEvent().getValue().toString();
		response.setRenderParameter("eventParamValue", eventParamValue);
		//response.s
	}
	
	public void doView(RenderRequest request,RenderResponse response) throws IOException, PortletException{
		System.out.println("Param value: "+request.getParameter("eventParamValue"));
		super.include("/html/ipcChild/view.jsp", request, response);
	}
}
