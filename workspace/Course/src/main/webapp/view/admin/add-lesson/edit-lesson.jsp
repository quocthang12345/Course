<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="/common/taglib.jsp"%>
<c:url value="/admin-home/edit-lesson" var="LessonURL"/>
<c:url value="/api/lesson" var="LessonAPI" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit-Lesson</title>
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
                                <div class="text-center col-12 col-sm-12"><h3>Edit Lesson</h3></div>
                                <form:form id="formSubmit" modelAttribute="lesson" cssClass="form-edit" action="<c:url value='/admin-home/edit-lesson'/>">
                                        <div class="form-group col-12 col-sm-12">
                                            <label>Name of the lesson</label>
                                            <form:input path="lessonName" value="${lesson.lessonName}" cssClass="form-control" placeholder="Enter name course....." />
                                        </div>
                                        <div class="form-group  col-12 col-sm-12">
                                            <label>Video of the lesson</label>
                                            <input type="file" id="Video" name="Video" class="form-control-file file" value="Choose Files"/>
                                        </div>
                                        <div class="form-group col-12 col-sm-12">
                                            <label>Description of the lesson</label>
                                            <form:input path="lessonDescription" value="${lesson.lessonDescription}" cssClass="form-control" placeholder="Enter description course....." />
                                        </div>
                                        <c:if test=${empty lesson.id}>
	                                        <div class="form-group col-12 col-sm-12">
	                                            <a type="button" class="btn btn-primary btn-lg" id="btnEdit">Insert</a>
	                                        </div>
                                        </c:if>
                                        <c:if test=${not empty lesson.id}>
	                                        <div class="form-group col-12 col-sm-12">
	                                            <a type="button" class="btn btn-primary btn-lg" id="btnEdit">Update</a>
	                                        </div>
                                        </c:if>
                                        <form:hidden path="id" value="${lesson.id}" />
                                </form:form>
                            </div>
                        </div>
                        </div>
                    </div>
                </div>
        </div>
    </div>
</div>
</body>
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
           url : "${LessonAPI}",
           type : "POST",
           contentType: "application/json",
           data: JSON.stringify(data),
           dataType: "json",
           success: function (result){
        	   window.location.href = "${LessonURL}";
           },
           error: function (error){
        	   window.location.href = "${LessonURL}";
           },
        });
    }
    function updateItem(data){
        $.ajax({
           url : "${LessonAPI}",
           type : "PUT",
           contentType: "application/json",
           data: JSON.stringify(data),
           dataType: "json",
           success: function (result){
        	   window.location.href = "${LessonURL}";
           },
           error: function (error){
        	   window.location.href = "${LessonURL}";
           },
        });
    }
});
</script>
</html>