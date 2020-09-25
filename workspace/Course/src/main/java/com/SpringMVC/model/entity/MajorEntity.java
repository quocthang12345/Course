package com.SpringMVC.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "major")
public class MajorEntity extends BaseEntity {
	@Column(name = "name")
	private String majorName;
	
	@Column(name = "code")
	private String majorCode;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "major")
    private List<CourseEntity> courseMajor;
	
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

	public List<CourseEntity> getCourseMajor() {
		return courseMajor;
	}

	public void setCourseMajor(List<CourseEntity> courseMajor) {
		this.courseMajor = courseMajor;
	}


	


}

