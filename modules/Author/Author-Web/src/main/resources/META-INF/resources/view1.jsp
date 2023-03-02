<%@page import="com.armantec.bms.author.model.Author"%>
<%@page import="java.util.List"%>
<%@page import="com.armantec.bms.author.service.AuthorLocalServiceUtil"%>

<%@ include file="init.jsp"%>
 
<%
List<Author> authorList = AuthorLocalServiceUtil.getAuthors(0, AuthorLocalServiceUtil.getAuthorsCount());
request.setAttribute("authorList", authorList);
%>

<body>

<!-- Add Author -->

 <portlet:renderURL var="addAuthorRenderURL">
    <portlet:param name="mvcPath" value="/add-author.jsp"/>
</portlet:renderURL>

<div class="mb-5">
    <a href="<%= addAuthorRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Author
    </a>
</div>  
	

<!-- View Author -->
  <table id="example" class="display nowrap" style="width:100%">
    <thead class="thead-dark">
      <tr>
         <th>Author Id</th>
        <th>Author Name</th>
        <th>Book Name</th>
        
        <th>Update</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${authorList}" var="author">
    
    	<!-- Delete Author -->
    <portlet:actionURL name="deleteAuthor" var="deleteAuthorActionURL">
		         <portlet:param name="authorId" value="${author.getAuthorId()}"/>
		</portlet:actionURL>
			        
			        <!-- Update Author -->
		 <portlet:renderURL var="updateAuthorRenderURL">
            <portlet:param name="mvcPath" value="/update-author.jsp"/>
            <portlet:param name="authorId" value="${author.authorId}"/>
            
            <portlet:param name="id" value="${author.id}"/>
            <portlet:param name="name" value="${author.name}"/>
            <portlet:param name="authorBook" value="${author.authorBook}"/>
           
        </portlet:renderURL>
    
    				<!-- View Author -->
       <tr>
     	    <td>${author.getId()}</td>
            <td>${author.getName()}</td>
            <td>${author.getAuthorBook()}</td>
            
            
            	<!-- Update Author -->
            	
       		<td class="text-center" style="width: 50px">
                <a href="<%=updateAuthorRenderURL%>" class="btn  btn-primary btn-default btn-sm px-2 py-1" >
                <i class ="glyphicon glyphicon-edit">UPDATE</i>
                </a>
            </td>
       	        
       	        	<!-- Delete Author -->
            <td> 
      			<a href="<%=deleteAuthorActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-2 py-1"
                    onclick="return confirm('Are you sure you want to delete this item?');"> 
                    <i class ="glyphicon glyphicon-edit">DELETE</i>
                </a>
              </td>
           </tr>     
    </c:forEach>
     
    </tbody>
  </table>
</body>