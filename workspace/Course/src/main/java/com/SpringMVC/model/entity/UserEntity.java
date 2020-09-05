package com.SpringMVC.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Column(name = "username")
	private String userName;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "password")
	private String passWord;
	
	@Column(name = "fullname")
	private String fullName;
	
	@Column(name = "status")
	private int status;
	

    public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<CourseEntity> courses;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", 
        joinColumns = { @JoinColumn(name = "user_id")}, 
        inverseJoinColumns = { @JoinColumn(name = "role_id")})
    private List<RoleEntity> roles;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "history_id", foreignKey = @ForeignKey(name = "fk_user_history"))
	private	HistoryEntity history;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userReview")
    private List<ReviewEntity> reviews;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	public String getFullname() {
		return fullName;
	}

	public void setFullname(String fullname) {
		this.fullName = fullname;
	}

	public List<CourseEntity> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseEntity> courses) {
		this.courses = courses;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public HistoryEntity getHistory() {
		return history;
	}

	public void setHistory(HistoryEntity history) {
		this.history = history;
	}

	public List<ReviewEntity> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewEntity> reviews) {
		this.reviews = reviews;
	}
    
    
	
}
