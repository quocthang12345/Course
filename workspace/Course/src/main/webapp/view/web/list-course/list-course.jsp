<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List-Course</title>
</head>
<body>
	<div class="wrap-list-course">
        <div class="container-fluid">
            <nav>
                <ol class="breadcrumb direct-course">
                    <li class="breadcrumb-1"><a href="<c:url value='/trang-chu'/>">Home</a></li>
                    <li><i class="fas fa-chevron-right breadcrumb-2"></i></li>
                    <li class="breadcrumb-3"><a href="<c:url value='khoa-hoc'/>">Course</a></li>
                </ol>
            </nav>
            <div class="banner-course p-0">
                <div class="row">
                    <div class="col-md-12 col-lg-12 d-flex flex-row align-item-center">
                        <div class="description-banner col-12 col-sm-12 col-md-8 col-lg-8">
                            <div class="text-banner"><h2>Learning with <span style="color:blue">experts</span>,</h2>
                                <h3>Take a programming course to improve your skills!</h3></div>
                            <div class="search">
                                <input type="text" class="search-course mt-3" placeholder="Enter the course name!">
                                <button type="submit" class="searchButton">
                                    <i class="fa fa-search"></i>
                                 </button>
                            </div>
                        </div>
                        <div class="image-course col-md-4 col-lg-4 p-0">
                            <img src="<c:url value='/template/web/image/img-list-course.jpg'/>" alt="img-course" title="img-course"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block-course">
                <div class="title-block">Java Programming And Framework</div>
                <div class="list-course">
                    <div class="row">
                    <c:forEach var="i" items="${listCourseJava}">
                        <div class="col-12 col-sm-12 col-md-3 col-lg-3 mb-2">
	                        <div class="card course">
	                            <div class="card-header img-lesson p-0">
	                                <img src="<c:url value='https://via.placeholder.com/290'/>" alt="Java" />
	                            </div>
	                            <div class="card-body short-description-lesson">
	                                <h4><a href="<c:url value='/mon-hoc?id=${i.id}'/>">${i.courseName}</a></h4>
	                                <p>${i.courseDescription}</p>
	                                <div class="rating d-flex flex-row align-items-center justify-content-between">
	                                    <ul class="rate d-flex flex-row align-items-center">
	                                        <li class="mr-2"><i class="fas fa-desktop mr-1"></i>55</li>
	                                        <li><i class="fas fa-user-friends mr-1"></i>4990</li>
	                                    </ul>
	                                    <div class="star-review">
	                                        <span class="fa fa-star checked"></span>
	                                        <span class="fa fa-star checked"></span>
	                                        <span class="fa fa-star checked"></span>
	                                        <span class="fa fa-star"></span>
	                                        <span class="fa fa-star"></span>
	                                    </div>
	                                </div>
	                            </div>
	                        </div>
                        </div>
                     </c:forEach>
                    </div>
                </div>
            </div>

            <div class="block-course">
                <div class="title-block">Javascript Programming And Framework</div>
                <div class="list-course">
                    <div class="row">
                    <c:forEach var="j" items="${listCourseJavaScript}">
                        <div class="col-12 col-sm-12 col-md-3 col-lg-3 mb-2">
                        <div class="card course">
                            <div class="card-header img-lesson p-0">
                                <img src="<c:url value='https://via.placeholder.com/290'/>" alt="Java" />
                            </div>
                            <div class="card-body short-description-lesson">
                                <h4><a href="<c:url value='/mon-hoc?id=${j.id}'/>">${j.courseName }</a></h4>
                                <p>${j.courseDescription}</p>
                                <div class="rating d-flex flex-row align-items-center justify-content-between">
                                    <ul class="rate d-flex flex-row align-items-center">
                                        <li class="mr-2"><i class="fas fa-desktop mr-1"></i>55</li>
                                        <li><i class="fas fa-user-friends mr-1"></i>4990</li>
                                    </ul>
                                    <div class="star-review">
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star"></span>
                                        <span class="fa fa-star"></span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>
                       </c:forEach>
                    </div>
                </div>
            </div>

            <div class="block-course">
                <div class="title-block">C/C++ Programming for Beginners</div>
                <div class="list-course">
                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-3 col-lg-3 mb-2">
                        <div class="card course">
                            <div class="card-header img-lesson p-0">
                                <img src="<c:url value='/template/web/image/java.jpg'/>" alt="Java" />
                            </div>
                            <div class="card-body short-description-lesson">
                                <h4><a href="#">Java for Beginners 2020 </a></h4>
                                <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. 
                                    accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore.
                                     veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                                <div class="rating d-flex flex-row align-items-center justify-content-between">
                                    <ul class="rate d-flex flex-row align-items-center">
                                        <li class="mr-2"><i class="fas fa-desktop mr-1"></i>55</li>
                                        <li><i class="fas fa-user-friends mr-1"></i>4990</li>
                                    </ul>
                                    <div class="star-review">
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star"></span>
                                        <span class="fa fa-star"></span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>

                        <div class="col-12 col-sm-12 col-md-3 col-lg-3 mb-2">
                            <div class="card course">
                                <div class="card-header img-lesson p-0">
                                    <img src="<c:url value='/template/web/image/java.jpg'/>" alt="Java" />
                                </div>
                                <div class="card-body short-description-lesson">
                                    <h4><a href="#">Java for Beginners 2020 </a></h4>
                                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. 
                                        accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore.
                                         veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                                    <div class="rating d-flex flex-row align-items-center justify-content-between">
                                        <ul class="rate d-flex flex-row align-items-center">
                                            <li class="mr-2"><i class="fas fa-desktop mr-1"></i>55</li>
                                            <li><i class="fas fa-user-friends mr-1"></i>4990</li>
                                        </ul>
                                        <div class="star-review">
                                            <span class="fa fa-star checked"></span>
                                            <span class="fa fa-star checked"></span>
                                            <span class="fa fa-star checked"></span>
                                            <span class="fa fa-star"></span>
                                            <span class="fa fa-star"></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </div>

                            <div class="col-12 col-sm-12 col-md-3 col-lg-3 mb-2">
                                <div class="card course">
                                    <div class="card-header img-lesson p-0">
                                        <img src="<c:url value='/template/web/image/java.jpg'/>" alt="Java" />
                                    </div>
                                    <div class="card-body short-description-lesson">
                                        <h4><a href="#">Java for Beginners 2020 </a></h4>
                                        <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. 
                                            accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore.
                                             veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                                        <div class="rating d-flex flex-row align-items-center justify-content-between">
                                            <ul class="rate d-flex flex-row align-items-center">
                                                <li class="mr-2"><i class="fas fa-desktop mr-1"></i>55</li>
                                                <li><i class="fas fa-user-friends mr-1"></i>4990</li>
                                            </ul>
                                            <div class="star-review">
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star"></span>
                                                <span class="fa fa-star"></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                </div>

                                <div class="col-12 col-sm-12 col-md-3 col-lg-3 mb-2">
                                    <div class="card course">
                                        <div class="card-header img-lesson p-0">
                                            <img src="<c:url value='/template/web/image/java.jpg'/>" alt="Java" />
                                        </div>
                                        <div class="card-body short-description-lesson">
                                            <h4><a href="#">Java for Beginners 2020 </a></h4>
                                            <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. 
                                                accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore.
                                                 veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                                            <div class="rating d-flex flex-row align-items-center justify-content-between">
                                                <ul class="rate d-flex flex-row align-items-center">
                                                    <li class="mr-2"><i class="fas fa-desktop mr-1"></i>55</li>
                                                    <li><i class="fas fa-user-friends mr-1"></i>4990</li>
                                                </ul>
                                                <div class="star-review">
                                                    <span class="fa fa-star checked"></span>
                                                    <span class="fa fa-star checked"></span>
                                                    <span class="fa fa-star checked"></span>
                                                    <span class="fa fa-star"></span>
                                                    <span class="fa fa-star"></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                  </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</body>
</html>