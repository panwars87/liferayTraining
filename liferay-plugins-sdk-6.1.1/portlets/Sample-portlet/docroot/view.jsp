<%@include file="../init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);	
%>

This is the <b>Sample</b> portlet.
<br />
User id is := <%= themeDisplay.getUserId() %>

<portlet:renderURL var="raghuLink">
	<portlet:param name="mvcPath" value="/raghu.jsp"/>
	<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:renderURL>

<aui:button value="click Me!" onClick="<%=raghuLink.toString() %>"/>