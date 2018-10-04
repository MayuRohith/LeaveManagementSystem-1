package com.sgic.hrm.leavesystem.service;

import java.util.List;

import com.sgic.hrm.leavesystem.entity.User;

public interface UserService {

	boolean addUser(User user);
	List<User> getUser();
	public String getUserDepartmentByUserId(Integer userId);
	boolean editUser(User user, Integer id);
}
