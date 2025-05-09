package com.example.form;

import com.example.domain.user.model.Department;

import lombok.Data;

@Data
public class UserListForm {

	private String userId;
	private String userName;
	private Department department;
	
}
