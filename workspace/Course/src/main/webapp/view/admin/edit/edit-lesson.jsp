<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit-Lesson</title>
</head>
<body>
<div class="background-edit">
	<div class="container">
        <div class="row position-direct">
            <div class="box-edit col-12 col-sm-12 col-lg-6 col-md-6">
                    <div class="card">
                        <div class="card-body box-wrap">
                            <div class="box-form">
                                <div class="row">
                                <div class="text-center col-12 col-sm-12"><h3>Edit Page</h3></div>
                                <form class="form-edit">
                                        <div class="form-group col-12 col-sm-12">
                                            <label>Name of the lesson</label>
                                            <input type="text" class="form-control" placeholder="Enter name course....." />
                                        </div>
                                        <div class="form-group  col-12 col-sm-12">
                                            <label>Video of the lesson</label>
                                            <input type="file" class="form-control-file file" value="Choose Files"/>
                                        </div>
                                        <div class="form-group col-12 col-sm-12">
                                            <label>Description of the lesson</label>
                                            <input type="text" class="form-control" placeholder="Enter description course....." />
                                        </div>
                                        <div class="form-group  col-12 col-sm-12">
                                            <label>Content of the lesson</label>
                                            <textarea type="text" class="form-control" rows="5" ></textarea>
                                        </div>
                                        <div class="form-group col-12 col-sm-12">
                                            <button type="button" class="btn btn-primary btn-lg" >Submit</button>
                                        </div>

                                </form>
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