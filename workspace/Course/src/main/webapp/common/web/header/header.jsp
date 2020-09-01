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
                                <security:authorize access = "isAnonymous()">
                                      <div class="form-group ">
                                          <a class="nav-link">Wellcome <%=SecurityUtils.getPrincipal().getFullName()%></a>
                                          <a class="nav-link" href="<c:url value='/thoat'/>">Thoát</a>
                                      </div>
                                </security:authorize>
                                </form>
                        </div>
                    </nav>
                </div>	
            </div>
        </header>
</body>
</html>