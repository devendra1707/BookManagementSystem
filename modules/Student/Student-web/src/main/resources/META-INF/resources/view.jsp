 <script>
function myFunction() {
  alert("Your Data is Deleted");
}
</script>
<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:renderURL var="addStudentRenderURL">
    <portlet:param name="mvcPath" value="/add-student.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addStudentRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Student
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>Student Name</th>
        <th>Branch</th>
        <th>Email</th>
        <th>Mobile</th>
        <th colspan="2" style="width: 100px">Action</th>
    </tr>
    <c:forEach items="${studentList}" var="student">  
  
        <portlet:renderURL var="updateStudentRenderURL">
            <portlet:param name="mvcPath" value="/update-student.jsp"/>
          	<portlet:param name="rollNo" value="${student.rollNo}"/>
            <portlet:param name="name" value="${student.name}"/>
            <portlet:param name="branch" value="${student.branch}"/>
            <portlet:param name="email" value="${student.email}"/>
            <portlet:param name="mobile" value="${student.mobile}"/>
        </portlet:renderURL>
        
        <portlet:actionURL name="deleteStudent" var="deleteStudentActionURL">
            <portlet:param name="rollNo" value="${student.getRollNo()}"/>
        </portlet:actionURL>
                
        <tr> 
            
            <td>${student.getName()}</td>
            <td>${student.getBranch()}</td>
            <td>${student.getEmail()}</td>
            <td>${student.getMobile()}</td>
            <td class="text-center" style="width: 50px">
                <a href="<%=updateStudentRenderURL%>" class="btn  btn-primary btn-default btn-sm px-3 py-2" >
                <i class ="glyphicon glyphicon-edit">Edit</i>
                </a>
                
            </td> 
            
            <td class="text-center" style="width:50px" >
                <a  href="<%=deleteStudentActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-3 py-2"
                  > 

                    <i class ="glyphicon glyphicon-remove"  onclick="myFunction()" >
                    DEl</i>
                </a>
            </td>
                                                 
         </tr>
    </c:forEach>
</table>
