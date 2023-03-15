package com.app.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.app.entity.User;

@Mapper
public interface UserDao {
	@Select("SELECT * FROM MEMBER")
	User getUser();

}
