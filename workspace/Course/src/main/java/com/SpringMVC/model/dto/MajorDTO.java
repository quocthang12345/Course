package com.SpringMVC.model.dto;

import java.util.List;

public class MajorDTO extends AbstractDTO<MajorDTO> {

	private String majorName;
	private String majorCode;
	private List<CourseDTO> course ;
	
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	public List<CourseDTO> getCourse() {
		return course;
	}
	public void setCourse(List<CourseDTO> course) {
		this.course = course;
	}
	
	
}
