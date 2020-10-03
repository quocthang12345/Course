package com.SpringMVC.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class LessonDTO extends AbstractDTO<LessonDTO> {

	private String lessonName;
	private String lessonDescription;
	private Long courseId;
	private MultipartFile Video;
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getLessonDescription() {
		return lessonDescription;
	}
	public void setLessonDescription(String lessonDescription) {
		this.lessonDescription = lessonDescription;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public MultipartFile getVideo() {
		return Video;
	}
	public void setVideo(MultipartFile video) {
		Video = video;
	}
	
	
	
}
