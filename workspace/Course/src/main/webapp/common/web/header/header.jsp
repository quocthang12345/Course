<%@ page import="com.SpringMVC.util.SecurityUtils" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<header class="fixed-top">
            <div class="row">
                <div class="col-lg-12">
                    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
                        <a class="navbar-brand" href="#">TNT<span class="fab fa-telegram-plane"></span></a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#menu">
                            <span class="icon-bar"></span>
                            </button>
                        <div class="collapse navbar-collapse" id="menu">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                                <li class="nav-item"><a class="nav-link" href="<c:url value='/khoa-hoc'/>">Courses</a></li>
                                <li class="nav-item"><a class="nav-link" href="#">Mentor</a></li>
                                <li class="nav-item"><a class="nav-link" href="#" data-toggle="tab">Contact</a></li>
                            </ul>
                                <form class="form-inline my-2 my-lg-0">
                                <security:authorize access = "isAnonymous()">
                                      <div class="form-group ">
                                          <a href="<c:url value='/dang-nhap'/>" type="button" class="btn btn-outline-success form-control mr-lg-2 pr-4 pl-4" >Sign in</a>
                                          <a href="<c:url value='/dang-ky'/>"  type="button" class="btn btn-primary form-control pr-4 pl-4" href="#"> Sign up</a>
                                      </div>
                                </security:authorize>
                                <security:authorize access = "isAuthenticated()">
	                                <!-- Dropdown - Messages -->
			               			<ul class="navbar-nav ml-auto">
			               				<li class="nav-item dropdown no-arrow mx-1">
							              <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							                <i class="fas fa-envelope fa-fw"></i>
							                <span class="badge badge-danger badge-counter">4</span>
							              </a>
							              <!-- Dropdown - Messages -->
							              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="messagesDropdown">
							                <h6 class="dropdown-header">
							                  Message
							                </h6>
							                <a class="dropdown-item d-flex align-items-center" href="#">
							                  <div class="dropdown-list-image mr-3">
							                    <img class="rounded-circle" src="https://via.placeholder.com/30.jpg" alt="">
							                    <div class="status-indicator bg-success"></div>
							                  </div>
							                  <div class="font-weight-bold">
							                    <div class="text-truncate">Text</div>
							                    <div class="small text-gray-500">Time</div>
							                  </div>
							                </a>
							                <a class="dropdown-item d-flex align-items-center" href="#">
							                  <div class="dropdown-list-image mr-3">
							                    <img class="rounded-circle" src="https://via.placeholder.com/30.jpg" alt="">
							                    <div class="status-indicator"></div>
							                  </div>
							                  <div>
							                    <div class="text-truncate">Text</div>
							                    <div class="small text-gray-500">Time</div>
							                  </div>
							                </a>
							                <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>
							              </div>
							            </li>
							            <div class="topbar-divider d-none d-sm-block"></div>
			               				<li class="form-group nav-item dropdown no-arrow mx-1">
	                                          <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								                <span class="mr-2 d-none d-lg-inline text-gray-600 small"><%=SecurityUtils.getPrincipal().getFullName()%></span>
								                <img class="img-profile rounded-circle" src="https://via.placeholder.com/30.jpg" />
								              </a>
							              <!--User Information -->
							              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
								                <a class="dropdown-item" href="#">
								                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
								                  Profile
								                </a>
								                <a class="dropdown-item" href="#">
								                  <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
								                  Activity Log
								                </a>
								                <div class="dropdown-divider"></div>
								                <a class="dropdown-item" href="<c:url value='/thoat'/>">
								                  <span class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></span>
								                  Logout
								                </a>
							              </div>
                                      </li>
			               			</ul>
                                </security:authorize>
                                </form>
                        </div>
                    </nav>
                </div>	
            </div>
        </header>
</body>
</html>