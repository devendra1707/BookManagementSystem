<%@ include file="init.jsp"%>
<portlet:defineObjects/>
 
<portlet:actionURL name="updateAuthor" var="updateAuthorActionURL"/>
 
<aui:form action="<%=updateAuthorActionURL%>" name="authorForm" method="POST"/>
 
<%
    String authorId = renderRequest.getParameter("authorId");
    String id = renderRequest.getParameter("id");
    String name = renderRequest.getParameter("name");
    String authorBook = renderRequest.getParameter("authorBook");
    
%>
<aui:form action="<%= updateAuthorActionURL %>" method="post" >
    <aui:input name="authorId" type="hidden" value="<%=Long.parseLong(authorId)%>"/>
    <aui:input name="id" type="number" value="${author.id}"/>
    <aui:input name="name" type="text" value="${author.name}"/>
    <aui:input name="authorBook" type="text" value="${author.authorBook}" />
    <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>