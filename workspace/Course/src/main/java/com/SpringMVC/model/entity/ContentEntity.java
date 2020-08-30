package com.SpringMVC.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "content_lesson")
public class ContentEntity extends BaseEntity {

	@Column(name = "video")
	private String video;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "content", cascade = CascadeType.ALL)
    private LessonEntity lesson;

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public LessonEntity getLessonEntity() {
		return lesson;
	}

	public void setLessonEntity(LessonEntity lessonEntity) {
		this.lesson = lessonEntity;
	}

}
