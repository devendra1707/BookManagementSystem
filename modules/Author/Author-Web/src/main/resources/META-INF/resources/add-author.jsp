<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:actionURL name="addAuthor" var="addAuthorActionURL"/>
            
                
<h2>Add Book Details in here !</h2>
 
<aui:form action="<%=addAuthorActionURL %>" name="authorForm" method="POST">
   <aui:input name="id" type="number">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>
 
    <aui:input name="name" >
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>
   
    <aui:input name="authorBook">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input> 
 
    
 
    <aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>