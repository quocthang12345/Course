package com.SpringMVC.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class ReviewEntity extends BaseEntity {

	@Column(name = "review")
	private String contentReview;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, 
        foreignKey = @ForeignKey(name = "fk_review_user"))
    private UserEntity userReview;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false, 
        foreignKey = @ForeignKey(name = "fk_review_course"))
    private CourseEntity courseReview;

	public String getContentReview() {
		return contentReview;
	}

	public void setContentReview(String contentReview) {
		this.contentReview = contentReview;
	}

	public UserEntity getUserReview() {
		return userReview;
	}

	public void setUserReview(UserEntity userReview) {
		this.userReview = userReview;
	}

	public CourseEntity getCourseReview() {
		return courseReview;
	}

	public void setCourseReview(CourseEntity courseReview) {
		this.courseReview = courseReview;
	}
	
	
	
	
}
