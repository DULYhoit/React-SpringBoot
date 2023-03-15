package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entity.User;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User getUser() {
		
		User user = userDao.getUser();
		
		return user;
	}

}
