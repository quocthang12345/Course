package com.SpringMVC.model.dto;

public class UserDTO extends AbstractDTO<UserDTO> {
	private String userName;
	private String passWord;
	private String avatar;
	private String fullName;
	private Long roleId;
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
