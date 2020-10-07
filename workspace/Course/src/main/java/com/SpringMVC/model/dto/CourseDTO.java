package com.SpringMVC.model.dto;

import java.util.Date;
import java.util.List;

public class CourseDTO extends AbstractDTO<CourseDTO> {
	private String courseName;
	private String thumbnail;
	
	private String base64;
	
	private String courseDescription;
	private String courseContent;
	private List<LessonDTO> lessons;
	private Date totalTime;
	private List<JoinDTO> joinCourse;
	private List<ReviewDTO> reviewCourse;
	private Long majorId;
	private String majorCode;
	
	public List<ReviewDTO> getReviewCourse() {
		return reviewCourse;
	}
	public void setReviewCourse(List<ReviewDTO> reviewCourse) {
		this.reviewCourse = reviewCourse;
	}
	public Long getMajorId() {
		return majorId;
	}
	public void setMajorId(Long majorId) {
		this.majorId = majorId;
	}
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
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
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
	public List<JoinDTO> getJoinCourse() {
		return joinCourse;
	}
	public void setJoinCourse(List<JoinDTO> joinCourse) {
		this.joinCourse = joinCourse;
	}
	public Date getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(Date totalTime) {
		this.totalTime = totalTime;
	}
	/**
	 * @return the majorCode
	 */
	public String getMajorCode() {
		return majorCode;
	}
	/**
	 * @param majorCode the majorCode to set
	 */
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	
	
}
