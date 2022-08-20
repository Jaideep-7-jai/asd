package com.c3.g4.response;

import java.util.List;

import com.c3.g4.entity.User;


public class UserListResponse {
	
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
