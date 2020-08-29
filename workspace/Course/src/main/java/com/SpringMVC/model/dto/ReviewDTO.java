package com.SpringMVC.model.dto;

import java.util.List;

public class ReviewDTO extends AbstractDTO<ReviewDTO> {
	private String reviewContent;
	private List<UserDTO> users;
	private List<CourseDTO> courses;
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public List<UserDTO> getUsers() {
		return users;
	}
	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}
	public List<CourseDTO> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseDTO> courses) {
		this.courses = courses;
	}
	
}
