<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>        
<body>
			<!-- This is a start of the Banner Page -->
            <div class="container-fluid">
                <div class="row">
                    <s:url var="bg" value="/template/web/image/education.jpg" />
                    <div class="img-banner col-12 col-lg-12 col-md-12 col-sm-12" style="background-image:url(${bg})">
                        <div class="content-banner col-12 col-lg-4 col-md-4 col-sm-12 pb-4">
                            <div class="content">
                                <h1>
                                <br><p style="font-size:25px;font-weight:600;color:rgb(218,11,78);margin:0">Start Learning Daily
                                    New Thing</p></h1>
                            <p class="text-description">Study any topic, anytime. Choose from thousands of expert-led courses now.</p>
                            <input class="input-search" type="text" name="search" placeholder="What do you want to learn?" >
                            </div>            
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="content-course d-flex flex-row">
                            <div class="content-left col-4 col-lg-4 col-md-4 col-sm-4">
                                    <div class="description">
                                        <div class="row">
                                            <div class="icon-course col-12 col-sm-12 col-md-3 col-lg-3">
                                                <div class="icon-cmr">
                                                    <i class="fas fa-video"></i>
                                                </div>
                                            </div>
                                            <div class="short-description col-12 col-sm-12 col-md-9 col-lg-9">
                                                <p class="title-course">100,000 Online Courses</p>
                                                <p>Nor again is there anyone who loves or pursues or desires</p>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                            <div class="content-center col-4 col-lg-4 col-md-4 col-sm-4">
                                    <div class="description">
                                        <div class="row">
                                            <div class="icon-course col-12 col-sm-12 col-md-3 col-lg-3">
                                                <div class="icon-cmr">
                                                    <i class="fas fa-medal"></i>
                                                </div>
                                            </div>
                                            <div class="p-0 pr-4 short-description col-12 col-sm-12 col-md-9 col-lg-9">
                                                <p class="title-course">Expert Instruction</p>
                                                <p>Nam libero tempore, cum soluta and nobis est eligendi optio</p>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                            <div class="content-right col-4 col-lg-4 col-md-4 col-sm-4">
                                    <div class="description">
                                        <div class="row">
                                            <div class="icon-course col-12 col-sm-12 col-md-3 col-lg-3">
                                                <div class="icon-cmr">
                                                    <i class="fas fa-infinity"></i>
                                                </div>
                                            </div>
                                            <div class="short-description col-12 col-sm-12 col-md-9 col-lg-9">
                                                <p class="title-course">Lifetime Access</p>
                                                <p>These cases are perfectly simple and easy to distinguish</p>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                    </div>
                </div>
            </div>
            <!-- End Banner Page -->

            <!-- This is a start of the Feature Page -->
            <div class="container">
            <div class="section-feature">
                <div class="container-feature">
                    <div class="title-feature">
                        <div class="small-title">New & Trending</div>
                        <div class="big-title"><span style="color:rgb(218,11,78);">Featured</span> Courses By Professional Instructor</div>
                    </div>
                    <div class="content-feature">
                        <div class="row">
                        <div class="item-feature-1 col-12 col-md-4 col-lg-4 col-sm-12">
                            <div class="card content-feature-1">
                                <div class="card-header item-feature-img-1 p-0">
                                    <img src="<c:url value='/template/web/image/img-feature1.jpg'/>" alt="item-feature-1" />
                                </div>
                                <div class="card-body description-feature">
                                    <div class="wrap-feature">
                                        <div class="title"><h4>
                                            The Complete Financial Analyst Course 2020
                                        </h4></div>
                                        <div class="content">
                                                <ul class="temp">
                                                    <li class="label1" style="color:rgb(33,177,124)">Expert</li>
                                                    <li class="label2" style="color:rgb(255,118,0)">Professional</li>
                                                    <li class="label3" style="color:rgb(138,101,251)">Design</li> 
                                                </ul>
                                            <div class="detail-feature">
                                                <ul>
                                                    <li class="view">5,69684 Views</li>
                                                    <li class="time">5h 32min</li>
                                                </ul>
                                                <p class="price">$79.99</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer author">
                                    <div class="name-author">
                                        <div class="img-author">
                                            <img src="<c:url value='/template/web/image/img-author.jpg'/>" alt="author"/>
                                        </div>
                                        <p>Shaurya Preet</p>
                                    </div>
                                    <p class="Datetime">
                                        <i class="fas fa-calendar-alt"></i>
                                        1 days ago
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="item-feature-2 col-12 col-md-4 col-lg-4 col-sm-12">
                            <div class="card content-feature-2">
                                <div class="card-header item-feature-img-2 p-0">
                                    <img src="<c:url value='/template/web/image/img-feature2.jpg'/>" alt="item-feature-img-2" />
                                </div>
                                <div class="card-body description-feature-2">
                                    <div class="wrap-feature">
                                        <div class="title"><h4>
                                            The Complete Business Plan Course (Includes 50 Templates)
                                        </h4></div>
                                        <div class="content">
                                                <ul class="temp">
                                                    <li class="label1" style="color:rgb(33,177,124)">Expert</li>
                                                    <li class="label2" style="color:rgb(255,118,0)">Professional</li>
                                                    <li class="label3" style="color:rgb(138,101,251)">Design</li> 
                                                </ul>
                                            <div class="detail-feature">
                                                <ul>
                                                    <li class="view">75,1864 Views</li>
                                                    <li class="time">12h 40min</li>
                                                </ul>
                                                <p class="price">$139.99</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer author">
                                    <div class="name-author">
                                        <div class="img-author">
                                             <img src="<c:url value='/template/web/image/img-author1.jpg'/>" alt="author"/>
                                        </div>
                                        <p>Savitha Tripathi</p>
                                    </div>
                                    <p class="Datetime">
                                        <i class="fas fa-calendar-alt"></i>
                                        5 days ago
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="item-feature-3 col-12 col-md-4 col-lg-4 col-sm-12">
                            <div class="card content-feature-3">
                                <div class="card-header item-feature-img-3 p-0">
                                     <img src="<c:url value='/template/web/image/img-feature.jpg'/>" alt="item-feature-img-3" />
                                </div>
                                <div class="card-body description-feature-3">
                                    <div class="wrap-feature">
                                        <div class="title"><h4>
                                            An Entire MBA In 1 Course:Award Winning Business School Prof
                                        </h4></div>
                                        <div class="content">
                                                <ul class="temp">
                                                    <li class="label1" style="color:rgb(33,177,124)">Expert</li>
                                                    <li class="label2" style="color:rgb(255,118,0)">Professional</li>
                                                    <li class="label3" style="color:rgb(138,101,251)">Design</li> 
                                                </ul>
                                            <div class="detail-feature">
                                                <ul>
                                                    <li class="view">502,334 Views</li>
                                                    <li class="time">20h 16min</li>
                                                </ul>
                                                <p class="price">$179.99</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer author">
                                    <div class="name-author">
                                        <div class="img-author">
                                            <img src="<c:url value='/template/web/image/img-author2.jpg'/>" alt="author"/>
                                        </div>
                                        <p>Litha Maildick</p>
                                    </div>
                                    <p class="Datetime">
                                        <i class="fas fa-calendar-alt"></i>
                                        1 month ago
                                    </p>
                                </div>
                            </div>
                        </div>
                        </div>
                    </div>
                </div>
            </div>
            </div>
            <!-- End Feature Page -->


            <!-- This is a start of the Item Page -->
            <div class="container-fluid">
            <div class="container-item">
                <div class="wrap-item">
                    <div class="title-item">
                        <div class="small-title">Popular Category</div>
                        <div class="big-title"><span style="color:rgb(218, 11, 78)"> Hot & Popular</span> Category For Learn</div>
                    </div>
                    <div class="content-item">
                        <div class="row d-flex flex-row justify-content-center align-items-center">
                        <div class="item i-1 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-1"><img src="<c:url value='/template/web/icon/monitor.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-1">Development</p>
                                    <p class="class"><i class="fas fa-school"></i> 23 Classes</p></li>
                            </ul>
                        </div>
                        <div class="item i-2 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-2"><img src="<c:url value='/template/web/icon/briefcase.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-2">Business</p>
                                    <p class="class"><i class="fas fa-school"></i> 58 Classes</p>
                                </li>
                            </ul>
                        </div>
                        <div class="item i-3 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-3"><img src="<c:url value='/template/web/icon/growth.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-3">Accounting</p>
                                    <p class="class"><i class="fas fa-school"></i> 74 Classes</p>
                                </li>
                            </ul>
                        </div>
                        <div class="item i-4 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-4"><img src="<c:url value='/template/web/icon/python.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-4"> IT & Software</p>
                                    <p class="class"><i class="fas fa-school"></i> 65 Classes</p>
                                </li>
                            </ul>
                        </div>
                        <div class="item i-5 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-5"><img src="<c:url value='/template/web/icon/design.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-5"> Art & Design</p>
                                    <p class="class"><i class="fas fa-school"></i> 43 Classes</p>
                                </li>
                            </ul>
                        </div>
                        <div class="item i-6 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-6"><img src="<c:url value='/template/web/icon/speaker.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-6">Marketing</p>
                                    <p class="class"><i class="fas fa-school"></i> 82 Classes</p>  
                                </li>
                            </ul>
                        </div>
                        <div class="item i-7 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-7"><img src="<c:url value='/template/web/icon/sketch.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-7">Photography</p>
                                    <p class="class"><i class="fas fa-school"></i> 25 Classes</p>  
                                </li>
                            </ul>
                        </div>
                        <div class="item i-8 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-8"><img src="<c:url value='/template/web/icon/meditation.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-8">Health & Fitness</p>
                                    <p class="class"><i class="fas fa-school"></i> 43 Classes</p>    
                                </li>
                            </ul>
                        </div>
                        <div class="item i-9 col-12 col-sm-12 col-lg-3 col-md-3">
                            <ul>
                                <li class="img-item item-img-9"><img src="<c:url value='/template/web/icon/health.png'/>" /></li>
                                <li class="content">
                                    <p class="header-title title-item-9">Lifestyle</p>
                                    <p class="class"><i class="fas fa-school"></i> 38 Classes</p>  
                                </li>
                            </ul>
                        </div>
                    </div>
                    </div>
                </div>
            </div>
            </div>
            <!-- End Item Page -->

            <!-- This is a start of the Info Page -->
            <div class="container-fluid">
            <div class="section-info">
                <div class="container-info">
                    <div class="row align-items-center">
                    <div class="info">
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 d-flex flex-row justify-content-end pr-5">
                        <div class="info-left">
                            <div class="info-item">
                                <h2 class="info-title">Know About <span style="color:rgb(218,11,78);">E-Learn</span> Learning Platform</h2>
                                <div class="block-item ">
                                    <div class="img-info-1"><img src="<c:url value='/template/web/icon/screen.png'/>"/></div>
                                    <div class="info-content">
                                        <h4>Nemo Enim Ipsam Voluptatem Quia.</h4>
                                        <p>No one rejects, dislikes, or avoids pleasure itself, because it is pleasure</p>
                                    </div>
                                </div>
                                <div class="block-item">
                                    <div class="img-info-2"><img src="<c:url value='/template/web/icon/heart.png'/>"/>   </div>
                                    <div class="info-content">
                                        <h4>Nemo Enim Ipsam Voluptatem Quia.</h4>
                                        <p>No one rejects, dislikes, or avoids pleasure itself, because it is pleasure</p>
                                    </div>
                                </div>
                                <div class="block-item">
                                    <div class="img-info-3"><img src="<c:url value='/template/web/icon/server.png'/>"/>   </div>
                                    <div class="info-content">
                                        <h4>Nemo Enim Ipsam Voluptatem Quia.</h4>
                                        <p>No one rejects, dislikes, or avoids pleasure itself, because it is pleasure</p>
                                    </div>
                                </div>
                            </div>
                            <a href="#" class="btn-pink">Know More<span class="arrow"><i class="fas fa-arrow-right"></i></span></a>
                        </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6">
                        <div class="info-right">
                            <div class="info-img">
                                <img src="<c:url value='/template/web/image/img-info.jpg'/>" alt="info" />    
                            </div>
                        </div>
                        </div>
                    </div>
                    </div>
                </div>
            </div>
            </div>
            <!-- End Info Page -->

            <!-- This is a start of the Course Page -->
            <div class="background-feature">
            <div class="container">
            <div class="section-feature">
                <div class="container-feature">
                    <div class="title-feature">
                        <div class="small-title">New & Trending</div>
                        <div class="big-title"><span style="color:rgb(218,11,78);">Featured</span> Courses By Professional Instructor</div>
                    </div>
                    <div class="content-feature mt-2">
                        <div class="row">
                        <div class="item-feature-1 col-12 col-md-4 col-lg-4 col-sm-12">
                            <div class="card content-feature-1">
                                <div class="card-header item-course item-course-img-1 p-0">
                                    <img src="<c:url value='/template/web/image/img-course-1.jpg'/>" alt="course" />
                                    <span class="cost">$199</span></div>
                                <div class="card-body description-feature">
                                    <div class="wrap-feature">
                                        <div class="title"><h4>
                                            An Entire MBA in 1 Course:Award Winning Business School Prof
                                        </h4></div>
                                        <div class="content">
                                            <div class="note">
                                                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore. 
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer author">
                                    <div class="name-author">
                                        <div class="img-author">
                                            <img src="<c:url value='/template/web/image/img-author.jpg'/>" alt="author"/>
                                        </div>
                                        <p>Shaurya Preet</p>
                                    </div>
                                    <p class="Datetime">
                                        <i class="fas fa-calendar-alt"></i>
                                        1 week ago
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="item-feature-2 col-12 col-md-4 col-lg-4 col-sm-12">
                            <div class="card content-feature-2">
                                <div class="card-header item-course item-course-img-2 p-0">
                                    <img src="<c:url value='/template/web/image/img-course-2.jpg'/>" alt="course" />
                                    <span class="cost">$99</span></div>
                                <div class="card-body description-feature-2">
                                    <div class="wrap-feature">
                                        <div class="title"><h4>
                                            PMP Exam Prep Seminar - PMBOK Guide 6
                                        </h4></div>
                                        <div class="content">
                                            <div class="note">
                                                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore. 
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer author">
                                    <div class="name-author">
                                        <div class="img-author">
                                            <img src="<c:url value='/template/web/image/img-author1.jpg'/>" alt="author"/>
                                        </div>
                                        <p>Savitha Tripathi</p>
                                    </div>
                                    <p class="Datetime">
                                        <i class="fas fa-calendar-alt"></i>
                                        2 days ago
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="item-feature-3 col-12 col-md-4 col-lg-4 col-sm-12">
                            <div class="card content-feature-3">
                                <div class="card-header item-course item-course-img-3 p-0">
                                    <img src="<c:url value='/template/web/image/img-course-3.jpg'/>" alt="course" />
                                    <span class="cost">$79</span></div>
                                <div class="card-body description-feature-3">
                                    <div class="wrap-feature">
                                        <div class="title"><h4>
                                            The Complete Business Plan Course (Includes 50 Templates)
                                        </h4></div>
                                        <div class="content">
                                            <div class="note">
                                                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore. 
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer author">
                                    <div class="name-author">
                                        <div class="img-author">
                                            <img src="<c:url value='/template/web/image/img-author2.jpg'/>" alt="author"/>
                                        </div>
                                        <p>Litha Maildick</p>
                                    </div>
                                    <p class="Datetime">
                                        <i class="fas fa-calendar-alt"></i>
                                        1 week ago
                                    </p>
                                </div>
                            </div>
                        </div>
                        </div>
                    </div>
                </div>
            </div>
            </div>
            </div>
            <!-- End Course Page -->

            <!-- This is a start of the Review Page -->
            <div class="section-review">
                <div class="container-review">
                    <div class="title-review">
                        <div class="small-title">What People Say?</div>  
                        <div class="big-title"><span style="color:red;">Reviews</span> By Our Success & Top Students</div> 
                    </div>
                    <div class="content-review">
                        <div class="img-review">
                            <img src="<c:url value='/template/web/image/img-author.jpg'/>" alt="review" />
                        </div>
                        <p class="name-review">Adam Alloriam</p>
                        <p class="position">Web Developer</p>
                        <p class="review">
                            " Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem commodi eligendi facilis itaque minus non odio, 
                            quaerat ullam unde voluptatum eligendi facilis itaque minus non odio, quaerat ullam unde ? "
                        </p>
                    </div>
                </div>
            </div>
            <!-- End Review Page -->

</body>

</html>