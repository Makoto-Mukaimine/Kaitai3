package com.example.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.repository.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public void signup(MUser user) {
		user.setDepartmentId(1);// 部署
		user.setRole("ROLE_GENERAL");// ロール
		mapper.insertOne(user);
	}
	
	@Override
	public MUser getUserOne(String userId) {		
		MUser user = mapper.findOne(userId);
		return user;
	}
	
	@Override
	public List<MUser> getUsers(MUser user) {		
		return mapper.findMany(user);
	}
	
	@Override
	public void updateUserOne(String userId, String password, String userName) {
		mapper.updateOne(userId, password, userName);
	}
	
	@Override
	public void deleteUserOne(String userId) {
		int count = mapper.deleteOne(userId);
	}
	
}