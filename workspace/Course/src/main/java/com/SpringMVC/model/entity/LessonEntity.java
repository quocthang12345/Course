package com.SpringMVC.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "lesson")
public class LessonEntity extends BaseEntity {
	@Column(name = "name")
	private String lessonName;
	
	@Column(name = "decription")
	private String descriptionLesson;
	
	@Column(name = "video")
	private byte[] Video;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id" ,nullable = false, 
	        foreignKey = @ForeignKey(name = "fk_lesson_course"))
	private CourseEntity course;
	
	
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


	public byte[] getVideo() {
		return Video;
	}


	public void setVideo(byte[] video) {
		Video = video;
	}


	public void setCourse(CourseEntity course) {
		this.course = course;
	}


	
	
	
}
