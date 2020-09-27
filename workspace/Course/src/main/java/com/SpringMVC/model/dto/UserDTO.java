package com.SpringMVC.model.dto;

import java.util.List;

public class UserDTO extends AbstractDTO<UserDTO> {
	private String userName;
	private String avatar;
	private String passWord;
	private String fullName;
	private int status;
	private Long roleId;
	List<CourseDTO> courses ;
	public List<CourseDTO> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseDTO> courses) {
		this.courses = courses;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	private Long HistoryId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getHistoryId() {
		return HistoryId;
	}
	public void setHistoryId(Long historyId) {
		HistoryId = historyId;
	}
	
	
}
