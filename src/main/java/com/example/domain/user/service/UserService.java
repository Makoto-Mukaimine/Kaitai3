package com.example.domain.user.service;

import java.util.List;

import com.example.domain.user.model.MUser;

public interface UserService {
	
	public void signup(MUser user);
	
	public MUser getUserOne(String userId);
	
	public List<MUser> getUsers(MUser user);
	
	public void updateUserOne(String userId, String password, String userName);
	
	public void deleteUserOne(String userId);
	
}