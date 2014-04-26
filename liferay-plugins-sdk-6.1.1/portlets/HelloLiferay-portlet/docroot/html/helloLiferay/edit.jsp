<%@page import="javax.portlet.ActionRequest"%>
<%@ page import="com.ys.actions.cert.PrintNameActionCommand" %>
<%@page import="com.liferay.util.bridges.mvc.ActionCommand"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay" %>

<portlet:defineObjects />

<liferay:actionURL name="enterName" var="enterNameAction"></liferay:actionURL>

<portlet:actionURL var="actionCommandURL">
	<portlet:param name="<%=ActionRequest.ACTION_NAME %>" value="PrintName"/>
	<portlet:param name="mvcPath" value="/html/helloLiferay/view.jsp" />
</portlet:actionURL>

<p>Please enter Your Name.</p>

<fieldset>
<form action="<%= actionCommandURL %>" method="post" name='<portlet:namespace/>fmAc1'>
	<label for="<portlet:namespace />name"></label>
	<input type="text" name="<portlet:namespace />name" />

	<input type="submit" value="Submit" />
</form>
</fieldset>