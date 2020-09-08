<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Lesson</title>
</head>
<body>
	<div class="container-fluid">
            <div class="edit-lesson">
                <div class="badge-lesson">
                    <nav>
                        <ol class="d-flex flex-row align-items-center" style="list-style:none;">
                            <li class="breadcrumb-1 mr-2"><a href="#">Admin-Home</a></li>
                            <li><i class="fas fa-chevron-right breadcrumb-2 mr-2"></i></li>
                            <li class="breadcrumb-3"><a href="#">Course</a></li>
                        </ol>
                    </nav>
                </div>
                <div class="list-lesson">
                    <div class="lesson-content">
                        <div class="row">
                            <ul class="col-12 col-md-9 col-lg-9 d-flex flex-row align-items-center justify-content-center" style="list-style:none;"s>
                                <div class="row">
                                    <li class="col-12 col-sm-12 col-md-12 col-lg-3 img-lesson"><img src="https://via.placeholder.com/220x250" alt="image-course"></li>
                                    <li class="col-12 col-sm-12 col-md-12 col-lg-9 pr-0 pl-3 description-lesson">
                                        <h3>Java for Beginner 2020</h3>
                                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Excepturi eius nam maxime dolore, 
                                        aspernatur quo commodi velit nesciunt iure mollitia nostrum, nisi ullam, adipisci tenetur culpa perferendis sequi similique fuga!</p>
                                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Excepturi eius nam maxime dolore, 
                                            aspernatur quo commodi velit nesciunt iure mollitia nostrum, nisi ullam, adipisci tenetur culpa perferendis sequi similique fuga!</p>
                                    </li>
                                </div>
                            </ul>
                        </div>
                    </div>
                    <div class="card pb-5">
                        <div class="card-header title">
                            <div class="row">
                                <div class="col-3">
                                    <p>Lesson</p>
                                </div>
                                <div class="col-9">
                                    <div class="btn-group float-right">
                                        <a class="btn btn-primary " data-toggle="tooltip" title='Insert Lesson' href="<c:url value='/admin-home/edit-lesson'/>">
                                            <span>	<i class="fa fa-plus-circle "></i> </span>
                                        </a>
                                        <button id="btnDelete" type="button" class="btn btn-warning" data-toggle="tooltip" title='Delete Lesson'>
                                            <span> <i class="fas fa-trash-alt"></i> </span>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card-body spacing pt-0">
                            <ul class="other-lesson">
                                <div class="row">
                                    <li>
                                        <div class="col-5 col-sm-4">Lecture 1: Prepare for Programming Web</div>
                                        <div class="col-7 col-sm-8">Description Lecture 1</div>
                                    </li>
                                </div>
                                <div class="row">
                                    <li>
                                        <div class="col-5 col-sm-4">Lecture 2: Overview</div>
                                        <div class="col-7 col-sm-8">Description Lecture 2</div>
                                    </li>
                                </div>
                                <div class="row">
                                    <li>
                                        <div class="col-5 col-sm-4">Lecture 3: Orient Object Programming</div>
                                        <div class="col-7 col-sm-8">Description Lecture 3</div>
                                    </li>
                                </div>
                                <div class="row">
                                    <li>
                                        <div class="col-5 col-sm-4">Lecture 4: Class/Object</div>
                                        <div class="col-7 col-sm-8">Description Lecture 4</div>
                                    </li>   
                                </div>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
    </div>
</body>
</html>