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
                                <p class="name-course">Java Enterprise for Beginner</p>
                                <h2 class="title-lesson">Lesson 01: Prepare skills to learn Java</h2>
                                <p class="short-lesson">Instructions for preparing tools for the course</p>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-7 col-lg-7">
                            <div class="video-lesson">
                                <iframe src="<c:url value='https://www.youtube.com/embed/Hl-zzrqQoSE'/>" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
        <div class="row mr-3 float-right">
            <div class="col-12 col-sm-12 col-lg-12 col-md-12 ">
                <div class="btn-next">
                    <a href="#" class="btn btn-primary">Next Lesson</a>
                </div>
            </div>
        </div>
    </div>

</body>
</html>