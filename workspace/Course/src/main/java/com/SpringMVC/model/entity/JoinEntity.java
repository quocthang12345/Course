package com.SpringMVC.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_join_course")
public class JoinEntity extends BaseEntity {
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, 
        foreignKey = @ForeignKey(name = "fk_user_course"))
    private UserEntity userCourse;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false, 
        foreignKey = @ForeignKey(name = "fk_course_user"))
    private CourseEntity courseUser;

	public UserEntity getUserCourse() {
		return userCourse;
	}

	public void setUserCourse(UserEntity userCourse) {
		this.userCourse = userCourse;
	}

	public CourseEntity getCourseUser() {
		return courseUser;
	}

	public void setCourseUser(CourseEntity courseUser) {
		this.courseUser = courseUser;
	}
	
	
}
