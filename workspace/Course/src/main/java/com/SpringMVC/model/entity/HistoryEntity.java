package com.SpringMVC.model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class HistoryEntity extends BaseEntity {
	@Column(name = "namelesson")
	private String nameStudyLesson;
	
	@Column(name = "timetofinish")
	private Date timetofinish;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "history", cascade = CascadeType.ALL)
	private UserEntity user;

	public String getNameStudyLesson() {
		return nameStudyLesson;
	}

	public void setNameStudyLesson(String nameStudyLesson) {
		this.nameStudyLesson = nameStudyLesson;
	}

	public Date getTimetofinish() {
		return timetofinish;
	}

	public void setTimetofinish(Date timetofinish) {
		this.timetofinish = timetofinish;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
}
