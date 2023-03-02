<%@ include file="init.jsp"%>
<portlet:defineObjects/>
 
<portlet:actionURL name="updateBook" var="updateBookActionURL"/>
 
<aui:form action="<%=updateBookActionURL%>" name="bookForm" method="POST"/>
 
<%
    String bookId = renderRequest.getParameter("bookId");
    String name = renderRequest.getParameter("name");
    String author = renderRequest.getParameter("author");
    String date = renderRequest.getParameter("date");
    
%>
<aui:form action="<%= updateBookActionURL %>" method="post" >
    <aui:input name="bookId" type="hidden" value="<%=Long.parseLong(bookId)%>"/>
    <aui:input name="name" type="text" value="${book.name}"/>
    <aui:input name="author" type="text" value="${book.author}"/>
    <aui:input name="date" type="date" value="${book.date}" />
    <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>