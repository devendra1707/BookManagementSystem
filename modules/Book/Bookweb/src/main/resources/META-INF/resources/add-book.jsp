<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:actionURL name="addBook" var="addBookActionURL"/>
            
                
<h2>Add Book Details in here !</h2>
 
<aui:form action="<%=addBookActionURL %>" name="bookForm" method="POST">
    <aui:input name="name" >
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
    </aui:input>
 
    <aui:input name="author" >
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
    </aui:input>
 
    <aui:input name="date" type="date" >
         <aui:validator name="required"/>
         <aui:validator name="date"/>
    </aui:input> 
 
    
 
    <aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>