<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@page import="com.SpringMVC.util.SecurityUtils" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin-home</title>
</head>
<body>
<div id="wrapper">
    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href='<c:url value='/admin-home' />'>
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Trang Quản Trị </div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href='<c:url value='/admin-home' />'>
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Danh sách khóa học</span></a>
      </li>


      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-2 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

		  <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>
     	<!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Dropdown - Messages -->
			<li class="nav-item dropdown no-arrow mx-1 pt-3">
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
	            	<li class="form-group nav-item dropdown no-arrow mx-1 pt-3">
	                      <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			                <span class="mr-2 d-none d-lg-inline text-gray-600 small"><%=SecurityUtils.getPrincipal().getFullName()%></span>
			                <img class="img-profile rounded-circle" src="https://via.placeholder.com/60.jpg" />
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

        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Danh sách khóa học </h6>
            </div>
            <div class="card-body">
					<form action="<c:url value='/admin-home'/>" method="get" id="formSubmit">
	               		<div class="row">
	                		<div class="col-3">
	                			<input type="search" class="form-control" style="margin:5px;" placeholder="Tìm kiếm khóa học">
	                		</div>
	                		<div class="col-9 ">
	                			<div class="btn-group float-right">
									<a class="btn btn-primary " data-toggle="tooltip" title='Thêm khóa học' href="<c:url value='/admin-home/edit-course' />">
										<span>	<i class="fa fa-plus-circle "></i> </span>
									</a>
									<button id="btnDelete" type="button" class="btn btn-warning" data-toggle="tooltip" title='Xóa khóa học'>
										<span> <i class="fas fa-trash-alt"></i> </span>
									</button>
								</div>
							</div>
	                	</div>
	                	
	              <div class="row">
	                <div class="col-sm-12">
	                	  <table class="table table-bordered dataTable" id="dataTable" width="100%" cellspacing="0" role="grid" aria-describedby="dataTable_info" style="width: 100%;">
			                  <thead>
			                    <tr role="row">
			                      <th class="sorting_asc" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-sort="ascending" style="width: 98px;"></th>
				                    <th class="sorting_asc" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-sort="ascending" style="width: 98px;">NameCourse</th>
				                    <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" style="width: 153px;">Thumbnail</th>
				                    <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" style="width: 69px;">ShortDecription</th>
				                    <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" style="width: 31px;">Content</th>
				                    <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" style="width: 69px;"></th>
				                    <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" style="width: 69px;"></th>
				                </tr>
			                  </thead>
	       
			                   <tbody>
			                   <c:forEach var="i" items="${listcourse}">
				                  <tr role="row" class="odd">
				                  <td><input type="checkbox"/></td>
				                      <td class="sorting_1">${i.courseName}</td>
				                      <td>${i.thumbnail}</td>
				                      <td>${i.courseDescription}</td>
				                      <td>${i.courseContent}</td>
				                      <td>
								      	<a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip" title="Update Course" 
								      	href='<c:url value='/admin-home/edit-course?id=${i.id}' />'>
								      		<i class="fas fa-edit" aria-hidden="true"></i></a>
							      	</td>
							      	<td>
								      	<a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip" title="Add Lesson" 
								      	href='<c:url value='/admin-home/add-lesson?id=${i.id}' />'>
								      		<i class="fas fa-folder-plus"></i></a>
							      	</td>
				                  </tr>
				               </c:forEach>
			                   </tbody>
	                		</table>
	               		</div>
	                </div>
		          	</form>
				</div>
			</div>
  	
			</div>
        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->
      </div>

  <!-- End of Page Wrapper -->


<script type="text/javascript">

</script>
</body>
</html>