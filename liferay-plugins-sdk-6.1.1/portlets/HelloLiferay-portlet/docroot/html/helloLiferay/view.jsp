<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
	String name = (String)request.getAttribute("userName");
%>


<div>
	<span>Welcome to Hello Liferay Portlet.</span>
</div>
<div>
	<%if(name != null){ %>
	<p>Entered user name is : <%=name %></p>
	<%} %>
</div>