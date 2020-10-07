package com.SpringMVC.model.dto;

public class LessonDTO extends AbstractDTO<LessonDTO> {

	private String lessonName;
	private String lessonDescription;
	private Long courseId;
	private String lessonVideo;
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
	public String getLessonVideo() {
		return lessonVideo;
	}
	public void setLessonVideo(String lessonVideo) {
		this.lessonVideo = lessonVideo;
	}
	
	
	
	
}
