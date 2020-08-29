package com.SpringMVC.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "lesson")
public class LessonEntity extends BaseEntity {
	@Column(name = "name")
	private String lessonName;
	
	@Column(name = "decription")
	private String descriptionLesson;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id" ,nullable = false, 
	        foreignKey = @ForeignKey(name = "fk_lesson_course"))
	private CourseEntity course;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "contentlesson_id", foreignKey = @ForeignKey(name = "fk_lesson_content"))
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	ContentEntity content;


	public String getLessonName() {
		return lessonName;
	}


	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}


	public String getDescriptionLesson() {
		return descriptionLesson;
	}


	public void setDescriptionLesson(String descriptionLesson) {
		this.descriptionLesson = descriptionLesson;
	}


	public CourseEntity getCourse() {
		return course;
	}


	public void setCourse(CourseEntity course) {
		this.course = course;
	}


	public ContentEntity getContent() {
		return content;
	}


	public void setContent(ContentEntity content) {
		this.content = content;
	}
	
	
	
	
}
