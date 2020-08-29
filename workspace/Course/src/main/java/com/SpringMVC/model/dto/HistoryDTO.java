package com.SpringMVC.model.dto;

import java.util.Date;

public class HistoryDTO extends AbstractDTO<HistoryDTO> {
	private String nameLessonStudy;
	private Date timeToFinish;
	public String getNameLessonStudy() {
		return nameLessonStudy;
	}
	public void setNameLessonStudy(String nameLessonStudy) {
		this.nameLessonStudy = nameLessonStudy;
	}
	public Date getTimeToFinish() {
		return timeToFinish;
	}
	public void setTimeToFinish(Date timeToFinish) {
		this.timeToFinish = timeToFinish;
	}
	
}
