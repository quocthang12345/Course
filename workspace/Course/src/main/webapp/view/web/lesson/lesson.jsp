<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lesson</title>
</head>
<body>
	<div class="section-detail mt-5">
        <div class="container">
            <div class="row">
                <div class="col-md-5 col-lg-4 wrap-detail">  
                    <div class="img-detail">
                        <img src="<c:url value='https://via.placeholder.com/290' />" alt="lesson" />
                    </div>
                </div>
                <div class="description-detail col-md-7 col-lg-8">
                    <ul class="label-detail d-flex flex-row">
                        <li class="fact-1">SEO</li>
                        <li class="fact-2">Design</li>
                    </ul>
                    <div class="header-detail">
                        <h2 class="title-detail">${course.courseName}</h2>
                        <ul class="info-detail d-flex flex-row">
                            <li><i class="far fa-clipboard"></i> 10 - 20 weeks</li>
                            <li class="mr-5 ml-5"><i class="fab fa-google-play"></i> 102 Lectures</li>
                            <li><i class="fas fa-user"></i> 502 Student Enrolled</li>
                        </ul>
                    </div>
                    <p class="content-detail">
                        ${course.courseDescription }
                    </p>
                    <div class="review-detail d-flex flex-row">
                        <div class="star-review">
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star"></span>
                            <span class="fa fa-star"></span>
                        </div>
                        <div class="counter-review ml-3">3572 Reviews</div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="section-content">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-lg-8">
                    <div class="overview">
                        <div class="content-overview">
                            <h4 class="title">Course Overview</h4>
                            <p>${course.courseContent }</p>
                        </div>
                        <div class="content-overview">
                            <h4 class="title">Requirements</h4>
                            <ul class="list-require">
                                <li>Students voluntarily learn knowledge related to the course</li>
                                <li>At vero eos et accusamus et iusto odio dignissimos ducimus</li>
                                <li>At vero eos et accusamus et iusto odio dignissimos ducimus</li>
                                <li>At vero eos et accusamus et iusto odio dignissimos ducimus</li>
                            </ul>
                        </div>
                    </div>
                    <div class="course-circullum">
                        <h3 class="title">Course Circullum</h3>
                        <div class="accordion">
                            <div class="collapse-lesson">
                                <div class="card">
                                    <div class="card-header">
                                        <h2 class="mb-0">
                                            <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#chapter-1" >
                                            Part 01: How to Learn Web Designing Step by Step
                                            </button>
                                        </h2>
                                    </div>
                                
                                    <div id="chapter-1" class="collapse">
                                        <div class="card-body">
                                            <ul class="lesson" >
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 01</div>
                                                    <a href="<c:url value='/video-mon-hoc' />" class="title">Web Designing Beginer</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 02</div>
                                                    <a href="#" class="title">Startup Designing with HTML5 & CSS3</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 03</div>
                                                    <a href="#" class="title">How To Call Google Map iFrame</a>
                                                </li>
                                                <li class="none-border">
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 04</div>
                                                    <a href="#" class="title">Create Drop Down Navigation Using CSS3</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <div class="card">
                                    <div class="card-header">
                                        <h2 class="mb-0">
                                            <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#chapter-2" >
                                                Part 02: Learn Web Designing in Basic Level
                                            </button>
                                        </h2>
                                    </div>
                                
                                    <div id="chapter-2" class="collapse">
                                        <div class="card-body">
                                            <ul class="lesson" >
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 01</div>
                                                    <a href="#" class="title">Web Designing Beginer</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 02</div>
                                                    <a href="#" class="title">Startup Designing with HTML5 & CSS3</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 03</div>
                                                    <a href="#" class="title">How To Call Google Map iFrame</a>
                                                </li>
                                                <li class="none-border">
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 04</div>
                                                    <a href="#" class="title">Create Drop Down Navigation Using CSS3</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <div class="card">
                                    <div class="card-header">
                                        <h2 class="mb-0">
                                            <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#chapter-3" >
                                                Part 03: Learn Web Designing in Advance Level
                                            </button>
                                        </h2>
                                    </div>
                                
                                    <div id="chapter-3" class="collapse">
                                        <div class="card-body">
                                            <ul class="lesson" >
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 01</div>
                                                    <a href="#" class="title">Web Designing Beginer</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 02</div>
                                                    <a href="#" class="title">Startup Designing with HTML5 & CSS3</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 03</div>
                                                    <a href="#" class="title">How To Call Google Map iFrame</a>
                                                </li>
                                                <li class="none-border">
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 04</div>
                                                    <a href="#" class="title">Create Drop Down Navigation Using CSS3</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <div class="card">
                                    <div class="card-header">
                                        <h2 class="mb-0">
                                            <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#chapter-4" >
                                                Part 04: How To Become Succes in Designing & Development?
                                            </button>
                                        </h2>
                                    </div>
                                
                                    <div id="chapter-4" class="collapse">
                                        <div class="card-body">
                                            <ul class="lesson" >
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 01</div>
                                                    <a href="#" class="title">Web Designing Beginer</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 02</div>
                                                    <a href="#" class="title">Startup Designing with HTML5 & CSS3</a>
                                                </li>
                                                <li>
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 03</div>
                                                    <a href="#" class="title">How To Call Google Map iFrame</a>
                                                </li>
                                                <li class="none-border">
                                                    <div class="lecture"><i class="fas fa-forward mr-2"></i>Lecture: 04</div>
                                                    <a href="#" class="title">Create Drop Down Navigation Using CSS3</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="info-writer-course">
                            <div class="info-writer">
                                <div class="row">
                                    <div class="image col-md-12 col-sm-12 col-lg-4">
                                        <img src="<c:url value='/template/web/image/author-course1.jpg' />" alt="author" />
                                    </div>
                                    <div class="info col-md-12 col-sm-12 col-lg-8">
                                        <div class="name">Michael Russell</div>
                                        <ul class="list-info d-flex flex-row justify-content-start">
                                            <li class="mr-3"><i class="fas fa-video mr-1"></i>Videos</li>
                                            <li class="mr-3"><i class="fas fa-play mr-1"></i>Lectures</li>
                                            <li><i class="fas fa-user-alt mr-1"></i>Exp. 4 Year</li>
                                        </ul>
                                        <div class="content">
                                            At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium 
                                            voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi.
                                        </div>
                                        <ul class="list-contact d-flex flex-row justify-content-start">
                                            <li><a href="#" class="rounded fab fa-facebook-f mr-3"></a></li>
                                            <li><a href="#" class="fab fa-twitter mr-3 rounded"></a></li>
                                            <li><a href="#" class="fab fa-linkedin-in mr-3 rounded"></a></li>
                                            <li><a href="#" class="fab fa-instagram rounded"></a></li>
                                        </ul>
                                    </div>
                                </div>
                        </div>
                    </div>

                    <div class="submit-review">
                        <h4 class="title">Submit Reviews</h4>
                            <form >
                                <div class="row">
                                    <div class="col-md-6 col-lg-6 col-12 col-sm-12">
                                        <input type="text" class="submit-name p-3 mb-3" placeholder="Your Name" />
                                    </div>
                                    <div class="col-md-6 col-lg-6 col-12 col-sm-12">
                                        <input type="text" class="submit-email p-3" placeholder="Your Email" />
                                    </div>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-12 col-md-12 col-lg-12 col-sm-12">
                                        <textarea type="text" cols="10" rows="5" class="submit-content-review p-4" placeholder="Your Review"></textarea>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-12 col-md-12 col-lg-12 col-sm-12">
                                        <a href="#" class="btn btn-success">Submit-review</a>
                                    </div>
                                </div>
                            </form>
                    </div>
                    <div class="person-review">
                        <div class="other-review">
                            <div class="card">
                                <div class="row no-gutters">
                                    <div class="col-md-3 col-lg-3 col-12 col-sm-12">
                                        <img src="<c:url value='/template/web/image/author-course.jpg' />" alt="image" class="image-other-review m-5"/> 
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-12 col-sm-12">
                                        <div class="card-body">
                                            <ul class="title-review d-flex flex-row justify-content-between align-items-center">
                                                <li class="name-submit-review">Josaph Manrty</li>
                                                <li><i class="fas fa-calendar-alt mr-2"></i>27 Oct 2019</li>
                                            </ul>
                                            <div class="star mb-2">
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star"></span>
                                                <span class="fa fa-star"></span>
                                            </div>
                                            <div class="text-review">" Commodo est luctus eget. Proin in nunc laoreet justo volutpat blandit enim. Sem felis, ullamcorper vel aliquam non, varius eget justo. Duis quis nunc tellus sollicitudin mauris. "</div>
                                        </div>   
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="other-review">
                            <div class="card">
                                <div class="row no-gutters">
                                    <div class="col-md-3 col-lg-3 col-12 col-sm-12">
                                        <img src="<c:url value='/template/web/image/author-course.jpg' />" alt="image" class="image-other-review m-5"/> 
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-12 col-sm-12">
                                        <div class="card-body">
                                            <ul class="title-review d-flex flex-row justify-content-between align-items-center">
                                                <li class="name-submit-review">Josaph Manrty</li>
                                                <li><i class="fas fa-calendar-alt mr-2"></i>27 Oct 2019</li>
                                            </ul>
                                            <div class="star mb-2">
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star"></span>
                                                <span class="fa fa-star"></span>
                                            </div>
                                            <div class="text-review">" Commodo est luctus eget. Proin in nunc laoreet justo volutpat blandit enim. Sem felis, ullamcorper vel aliquam non, varius eget justo. Duis quis nunc tellus sollicitudin mauris. "</div>
                                        </div>   
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="none-border other-review">
                            <div class="card">
                                <div class="row no-gutters">
                                    <div class="col-md-3 col-lg-3 col-12 col-sm-12">
                                        <img src="<c:url value='/template/web/image/author-course.jpg' />" alt="image" class="image-other-review m-5"/> 
                                    </div>
                                    <div class="col-md-9 col-lg-9 col-12 col-sm-12">
                                        <div class="card-body">
                                            <ul class="title-review d-flex flex-row justify-content-between align-items-center">
                                                <li class="name-submit-review">Josaph Manrty</li>
                                                <li><i class="fas fa-calendar-alt mr-2"></i>27 Oct 2019</li>
                                            </ul>
                                            <div class="star mb-2">
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star checked"></span>
                                                <span class="fa fa-star"></span>
                                                <span class="fa fa-star"></span>
                                            </div>
                                            <div class="text-review">" Commodo est luctus eget. Proin in nunc laoreet justo volutpat blandit enim. Sem felis, ullamcorper vel aliquam non, varius eget justo. Duis quis nunc tellus sollicitudin mauris. "</div>
                                        </div>   
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                </div>
                <div class="col-md-4 col-lg-4">
                    <div class="box-author">
                        <div class="author-position">
                            <div class="image">
                                <img src="<c:url value='/template/web/image/author-course.jpg' />" alt="author" />
                            </div>
                            <div class="content">
                                <p class="name">
                                    Michael Russell</p>
                                <p class="position">Web Designer in Canada</p>
                            </div>
                        </div>
                        <div class="total-time">
                            <p>Acctual Time</p>
                            <p class="time">14h12p</p>
                        </div>
                        <div class="benefit-course">
                            <h4 class="title">Course Features</h4>
                            <ul class="list-benefit">
                                <li>Fully Programming</li>
                                <li>Help Code to Code</li>
                                <li>Free Trial 7 Days</li>
                                <li>Unlimited Videos</li>
                                <li>24x7 Support</li>
                            </ul>
                        </div>
                        <div class="contact-author d-flex flex-row justify-content-center">
                            <a href="#" class="btn btn-primary pl-5 pr-5 mb-2">Contact</a>
                        </div>
                    </div>

                    <div class="benefit">
                        <div class="title">Course Features</div>
                        <div class="row">
                                <div class="col-12 col-sm-12 col-md-12 col-lg-12">
                                    <ul class="convenient">
                                        <li><i class="fas fa-user"></i>Student Enrolled: <strong>1740</strong></li>
                                        <li><i class="far fa-file-alt"></i>lectures: <strong>10</strong></li>
                                        <li><i class="fas fa-gamepad"></i>Quizzes: <strong>4</strong></li>
                                        <li><i class="far fa-clock"></i>Duration: <strong>60 hours</strong></li>
                                        <li><i class="fas fa-ribbon"></i>Skill Level: <strong>Beginner</strong></li>
                                        <li><i class="far fa-flag"></i> Language: <strong>English</strong></li>
                                        <li><i class="far fa-sun"></i>Assessment: <strong>Yes</strong></li>
                                    </ul>
                                </div>
                        </div>
                        </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>