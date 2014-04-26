<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
	String name=(String)request.getParameter("foo");
	String eventName=(String)request.getParameter("eventParamValue");
%>

<div>
		<p>IPC Child Portlet </p>
		<%if(name != null){ %>
		<p>Name enter is : <%=name %></p>
		<br />
		<p><%=eventName %></p>
		<%} %>
</div>