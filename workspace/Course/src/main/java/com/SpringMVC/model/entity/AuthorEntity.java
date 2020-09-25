package com.SpringMVC.model.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class AuthorEntity extends BaseEntity {
	
	@Column(name = "name")
	private String authorName;
	
	@Column(name = "avatar")
	private String authorAvatar;
	
	@Column(name = "position")
	private String authorPosition;
	
	@Column(name = "description")
	private String authorDescription;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<CourseEntity> courseAuthor;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorAvatar() {
		return authorAvatar;
	}

	public void setAuthorAvatar(String authorAvatar) {
		this.authorAvatar = authorAvatar;
	}

	public String getAuthorPosition() {
		return authorPosition;
	}

	public void setAuthorPosition(String authorPosition) {
		this.authorPosition = authorPosition;
	}

	public String getAuthorDescription() {
		return authorDescription;
	}

	public void setAuthorDescription(String authorDescription) {
		this.authorDescription = authorDescription;
	}

	public List<CourseEntity> getCourseAuthor() {
		return courseAuthor;
	}

	public void setCourseAuthor(List<CourseEntity> courseAuthor) {
		this.courseAuthor = courseAuthor;
	}


	

}
