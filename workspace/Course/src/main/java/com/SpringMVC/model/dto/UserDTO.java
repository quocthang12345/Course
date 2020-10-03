package com.SpringMVC.model.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class UserDTO extends AbstractDTO<UserDTO> {
	private String userName;
	private MultipartFile avatar;
	private String passWord;
	private String fullName;
	private int status;
	private Long roleId;
	private List<JoinDTO> joinCourse ;
	private List<ReviewDTO> userReview;
	

	public List<ReviewDTO> getUserReview() {
		return userReview;
	}
	public void setUserReview(List<ReviewDTO> userReview) {
		this.userReview = userReview;
	}
	public List<JoinDTO> getJoinCourse() {
		return joinCourse;
	}
	public void setJoinCourse(List<JoinDTO> joinCourse) {
		this.joinCourse = joinCourse;
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
	
	public MultipartFile getAvatar() {
		return avatar;
	}
	public void setAvatar(MultipartFile avatar) {
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
