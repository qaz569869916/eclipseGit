package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.User;

@Mapper
public interface UserMapper {
	public List<User> queryAll();
}
