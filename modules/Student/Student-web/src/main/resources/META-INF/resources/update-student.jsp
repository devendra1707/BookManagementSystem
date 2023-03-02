<%@ include file="init.jsp"%>
<portlet:defineObjects/>
 
<portlet:actionURL name="updateStudent" var="updateStudentActionURL"/>
 
<aui:form action="<%=updateStudentActionURL%>" name="studentForm" method="POST"/>
 
<%
    String rollNo = renderRequest.getParameter("rollNo");
    String name = renderRequest.getParameter("name");
    String branch = renderRequest.getParameter("branch");
    String email = renderRequest.getParameter("email");
    String mobile = renderRequest.getParameter("mobile");
    
%>
<aui:form action="<%= updateStudentActionURL %>" method="post" >
    <aui:input name="rollNo" type="hidden" value="<%=Long.parseLong(rollNo)%>"/>
    <aui:input name="name" type="text" value="${student.name}"/>
    <aui:input name="branch" type="text" value="${student.branch}"/>
    <aui:input name="email" type="email" value="${student.email}" />
    <aui:input name="mobile" type="number" value="${student.mobile}" />
    <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>