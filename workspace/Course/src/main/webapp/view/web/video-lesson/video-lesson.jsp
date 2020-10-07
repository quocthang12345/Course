<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video</title>
</head>
<body>
	<div class="lesson-wrapper">
        <div class="container-fluid">
                <div class="content-lesson">
                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-5 col-lg-5">
                            <div class="description-lesson">
                                <h2 class="title-lesson">${lesson.lessonName }</h2>
                                <p class="short-lesson">${lesson.lessonDescription }</p>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-7 col-lg-7">
                            <div class="video-lesson" style="height:420px;">
                                ${lesson.lessonVideo}
                            </div>
                        </div>
                    </div>
                </div>
        </div>
        <div class="row mr-3 float-right">
            <div class="col-12 col-sm-12 col-lg-12 col-md-12 ">
            <c:if test="${lesson.id >= lastLessonID}">
                <div class="btn-next">
                    <a href="<c:url value='/mon-hoc?id=${lesson.courseId}'/>" class="btn btn-primary">Finish Course</a>
                </div>
            </c:if>
            <c:if test="${lesson.id < lastLessonID}">
                <div class="btn-next">
                    <a href="<c:url value='/video-mon-hoc?id=${nextLessonID}'/>" class="btn btn-primary">Next Lesson</a>
                </div>
            </c:if>
            </div>
        </div>
    </div>

</body>
</html>