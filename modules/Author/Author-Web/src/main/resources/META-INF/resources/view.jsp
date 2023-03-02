 <script>
function myFunction() {
  alert("Your Data is Deleted");
}
</script>
<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:renderURL var="addAuthorRenderURL">
    <portlet:param name="mvcPath" value="/add-author.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addAuthorRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Author
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>Author Id</th>
        <th>Author Name</th>
        <th>Book Name</th>
        <th colspan="2" style="width: 100px">Action</th>
    </tr>
   <c:forEach items="${authorList}" var="author"> 
    
            <!-- Update Author -->
		 <portlet:renderURL var="updateAuthorRenderURL">
            <portlet:param name="mvcPath" value="/update-author.jsp"/>
            <portlet:param name="authorId" value="${author.authorId}"/>
            <portlet:param name="id" value="${author.id}"/>
            <portlet:param name="name" value="${author.name}"/>
            <portlet:param name="authorBook" value="${author.authorBook}"/>
           
        </portlet:renderURL>
        
        <!-- Delete Author -->
    <portlet:actionURL name="deleteAuthor" var="deleteAuthorActionURL">
		         <portlet:param name="authorId" value="${author.getAuthorId()}"/>
		</portlet:actionURL>
                
        <tr> 
            
            <td>${author.getId()}</td>
            <td>${author.getName()}</td>
            <td>${author.getAuthorBook()}</td>
            <td class="text-center" style="width: 50px">
                <a href="<%=updateAuthorRenderURL%>" class="btn  btn-primary btn-default btn-sm px-3 py-2" >
                <i class ="glyphicon glyphicon-edit">Edit</i>
                </a>
                
            </td> 
            
            <td class="text-center" style="width:50px" >
                <a  href="<%=deleteAuthorActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-3 py-2"
                  > 

                    <i class ="glyphicon glyphicon-remove"  onclick="myFunction()" >
                    DEl</i>
                </a>
            </td>
                                                 
         </tr>
    </c:forEach>
</table>
