<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<liferay-util:include page="/html/portlet/blogs/search.jsp" useCustomPage="false" />

<liferay-util:buffer var="html">
    <liferay-util:include page="/html/portlet/blogs/search.portal.jsp" />
</liferay-util:buffer>

<%
html = StringUtil.add(
	"Didn't find what you were looking for? Ask Panwar Bhai Liferay wale.... " +
		        "try again!",
	html,
    
    "\n");
%>

<%= html %>