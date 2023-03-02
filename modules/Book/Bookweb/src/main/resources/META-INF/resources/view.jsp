 <script>
function myFunction() {
  alert("Your Data is Deleted");
}
</script>
<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:renderURL var="addBookRenderURL">
    <portlet:param name="mvcPath" value="/add-book.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addBookRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Book
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>Book Name</th>
        <th>Author Name</th>
        <th>Book Publish Date</th>
        <th colspan="2" style="width: 100px">Action</th>
    </tr>
    <c:forEach items="${bookList}" var="book">  
    
        <portlet:renderURL var="updateBookRenderURL">
            <portlet:param name="mvcPath" value="/update-book.jsp"/>
            <portlet:param name="bookId" value="${book.bookId}"/>
            <portlet:param name="name" value="${book.name}"/>
            <portlet:param name="author" value="${book.author}"/>
            <portlet:param name="date" value="${book.date}"/>
        </portlet:renderURL>
        
        <portlet:actionURL name="deleteBook" var="deleteBookActionURL">
            <portlet:param name="bookId" value="${book.getBookId()}"/>
        </portlet:actionURL>
                
        <tr> 
            
            <td>${book.getName()}</td>
            <td>${book.getAuthor()}</td>
            <td>${book.getDate()}</td>
            <td class="text-center" style="width: 50px">
                <a href="<%=updateBookRenderURL%>" class="btn  btn-primary btn-default btn-sm px-3 py-2" >
                <i class ="glyphicon glyphicon-edit">Edit</i>
                </a>
                
            </td> 
            
            <td class="text-center" style="width:50px" >
                <a  href="<%=deleteBookActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-3 py-2"
                  > 

                    <i class ="glyphicon glyphicon-remove"  onclick="myFunction()" >
                    DEl</i>
                </a>
            </td>
                                                 
         </tr>
    </c:forEach>
</table>
