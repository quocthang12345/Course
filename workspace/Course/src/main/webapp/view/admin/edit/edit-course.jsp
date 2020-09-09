<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/common/taglib.jsp"%>
 <c:url var="courseURL" value="/admin-home"/> 
 <c:url var="courseAPI" value="/api/course"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit-Course</title>
</head>
<body>
<div class="background-edit">
	<div class="container">
        <div class="row position-direct">
            <div class="box-edit col-12 col-sm-12 col-lg-6 col-md-6">
                    <div class="card">
                        <div class="card-body box-wrap">
                            <div class="box-form">
                                <div class="row">
                                <div class="text-center col-12 col-sm-12"><h3>Edit Page</h3></div>
                                <form:form class="form-edit" id="formSubmit" modelAttribute="course" action="<c:url value='/admin-home/edit-course' />">
                                        <div class="form-group col-12 col-sm-12">
                                            <label>Name of the course</label>
                                            <form:input path="courseName" cssClass="form-control" value="${course.courseName}" placeholder="Enter name course....." />
                                        </div>
                                        <div class="form-group  col-12 col-sm-12">
                                            <label>Thumbnail</label>
                                            <input type="file" class="form-control-file file" value="Choose Files"/>
                                        </div>
                                        <div class="form-group col-12 col-sm-12">
                                            <label>Description of the course</label>
                                            <form:input path="courseDescription" cssClass="form-control" value="${course.courseDescription}" placeholder="Enter description course....." />
                                        </div>
                                        <div class="form-group  col-12 col-sm-12">
                                            <label>Content of the course</label>
                                            <form:textarea path="courseContent" class="form-control" value="${course.courseContent}" rows="5" ></form:textarea>
                                        </div>
                                        <c:if test="${not empty course.id}">
	                                        <div class="form-group col-12 col-sm-12">
	                                            <button type="button" class="btn btn-primary btn-lg" id="btnEdit">Update</button>
	                                        </div>
                                        </c:if>
                                        <c:if test="${empty course.id}">
	                                        <div class="form-group col-12 col-sm-12">
	                                            <a type="button" class="btn btn-primary btn-lg" id="btnEdit">Insert</a>
	                                        </div>
                                        </c:if>
                                        <form:hidden path="id" value="${course.id}"/>
                                </form:form>
                            </div>
                        </div>
                        </div>
                    </div>
            </div>
    	</div>
	</div>
</div>

<script>
$('#btnEdit').click(function(e){
    e.preventDefault();
    var data = {};
    var formData = $('#formSubmit').serializeArray();
    $.each(formData,function(i,v){
        data[""+v.name+""] = v.value;
    });
    var id = $('#id').val();
    if(id == ""){
        addItem(data);
    }else{
        updateItem(data);
    }
    function addItem(data){
        $.ajax({
           url : "${courseAPI}",
           type : "POST",
           contentType: "application/json",
           data: JSON.stringify(data),
           dataType: "json",
           success: function (result){
        	   window.location.href = "${courseURL}";
           },
           error: function (error){
        	   window.location.href = "${courseURL}";
           },
        });
    }
    function updateItem(data){
        $.ajax({
           url : "${courseAPI}",
           type : "PUT",
           contentType: "application/json",
           data: JSON.stringify(data),
           dataType: "json",
           success: function (result){
        	   window.location.href = "${courseURL}";
           },
           error: function (error){
        	   window.location.href = "${courseURL}";
           },
        });
    }
});
</script>
</body>
</html>