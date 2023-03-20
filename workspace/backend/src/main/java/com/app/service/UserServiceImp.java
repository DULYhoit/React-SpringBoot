package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entity.Register;
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

	@Override
	public String getId(String id) {
		String checkid = userDao.getId(id);
		return checkid;
	}

	@Override
	public String getEmail(String email) {
		String checkemail = userDao.getEmail(email);
		return checkemail;
	}


	@Override
	public int insertMember(Register register) {
		int count = userDao.insertMember(register);
		return count;
	}

}
