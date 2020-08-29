package com.SpringMVC.model.dto;

import java.util.Date;
import java.util.List;

public class CourseDTO extends AbstractDTO<CourseDTO> {
	private String courseName;
	private String thumbnail;
	private String courseDescription;
	private String courseContent;
	private List<LessonDTO> lessons;
	private Date totalTime;
	private List<UserDTO> users;
	private List<ReviewDTO> reviews;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	public List<LessonDTO> getLessons() {
		return lessons;
	}
	public void setLessons(List<LessonDTO> lessons) {
		this.lessons = lessons;
	}
	public Date getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(Date totalTime) {
		this.totalTime = totalTime;
	}
	public List<UserDTO> getUsers() {
		return users;
	}
	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}
	public List<ReviewDTO> getReviews() {
		return reviews;
	}
	public void setReviews(List<ReviewDTO> reviews) {
		this.reviews = reviews;
	}
	
	
}
