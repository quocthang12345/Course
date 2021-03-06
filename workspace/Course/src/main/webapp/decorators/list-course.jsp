<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="List-Course" /></title>
<link rel="stylesheet" href="<c:url value='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'/>" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="<c:url value='https://use.fontawesome.com/releases/v5.7.0/css/all.css'/>" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link href="<c:url value='/template/web/css/list-courses.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/template/web/css/footers.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/template/web/css/emails.css'/>" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libss/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<%@include file="/common/web/header/header.jsp" %>
	
	<dec:body/>
	
	<%@include file="/common/web/email/email.jsp" %>
	
	<%@include file="/common/web/footer/footer.jsp" %>

<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="<c:url value='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js'/>" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="<c:url value='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js'/>" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>  
</body>
</html>