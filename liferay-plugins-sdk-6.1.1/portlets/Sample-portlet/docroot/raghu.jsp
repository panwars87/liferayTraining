<%@include file="../init.jsp" %>

<% String redirect = ParamUtil.getString(request, "redirect"); %>

Hello Portlet..... <aui:button value="Back!" onClick="<%=redirect %>"></aui:button>

