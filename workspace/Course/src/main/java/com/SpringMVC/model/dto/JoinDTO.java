package com.SpringMVC.model.dto;

public class JoinDTO extends AbstractDTO<JoinDTO> {
	private Long courseID;
	private Long userID;
	public Long getCourseID() {
		return courseID;
	}
	public void setCourseID(Long courseID) {
		this.courseID = courseID;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	
	
	
}
