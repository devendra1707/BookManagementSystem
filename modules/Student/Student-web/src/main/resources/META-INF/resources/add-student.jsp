<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:actionURL name="addStudent" var="addStudentActionURL"/>
            
                
<h2>Add Student Details in here !</h2>
 
<aui:form action="<%=addStudentActionURL %>" name="studentForm" method="POST">
    <aui:input name="name" >
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
    </aui:input>
     
    <aui:input name="branch" >
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
    </aui:input>
 
    <aui:input name="email" >
         <aui:validator name="required"/>
         <aui:validator name="email"/>
    </aui:input> 
 
     <aui:input name="mobile" >
         <aui:validator name="required"/>
         <aui:validator name="number"/>
    </aui:input> 
 
    <aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>