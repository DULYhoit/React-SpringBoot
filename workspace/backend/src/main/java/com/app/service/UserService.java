package com.app.service;

import java.util.List;

import com.app.entity.Register;
import com.app.entity.User;

public interface UserService {

	User getUser();

	String getId(String id);

	String getEmail(String email);

	int regMember(Register register);

	


	

}
