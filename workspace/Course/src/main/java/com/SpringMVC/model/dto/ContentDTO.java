package com.SpringMVC.model.dto;

public class ContentDTO extends AbstractDTO<ContentDTO> {
	private String video;
	private Long lessonId;
	
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Long getLessonId() {
		return lessonId;
	}
	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}
	
	
}
