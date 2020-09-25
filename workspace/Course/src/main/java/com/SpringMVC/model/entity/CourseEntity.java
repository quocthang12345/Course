package com.SpringMVC.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class CourseEntity extends BaseEntity {
	
	@Column(name = "name")
	private String courseName;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "description")
	private String courseDescription;
	
	@Column(name = "content")
	private String courseContent;
	
	@Column(name = "totaltime")
	private Date totalTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private List<LessonEntity> lessons;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "major_id" ,nullable = false, 
	        foreignKey = @ForeignKey(name = "fk_course_major"))
	private MajorEntity major;
    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "course_user", 
        joinColumns = { @JoinColumn(name = "course_id", nullable = false, updatable = false) }, 
        inverseJoinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) })
    private List<UserEntity> users;
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courseReview")
    private List<ReviewEntity> reviews;
    

 

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

	public Date getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(Date totalTime) {
		this.totalTime = totalTime;
	}

	public List<LessonEntity> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonEntity> lessons) {
		this.lessons = lessons;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	public List<ReviewEntity> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewEntity> reviews) {
		this.reviews = reviews;
	}

	public MajorEntity getMajor() {
		return major;
	}

	public void setMajor(MajorEntity major) {
		this.major = major;
	}
	

}
