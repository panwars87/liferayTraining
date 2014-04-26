<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet"  prefix="liferay" %>

<portlet:defineObjects />

<div>Enter UserName...</div>

<liferay:actionURL name="checkName" var="checkNameAction"></liferay:actionURL>

<fieldset>
	<form method="post" action="<%= checkNameAction %>">
		<label for="<portlet:namespace />paramName"></label>
		<input type="text" name="<portlet:namespace />paramName" />
		
		<button type="submit">Submit Name!</button>
	</form>
</fieldset>
