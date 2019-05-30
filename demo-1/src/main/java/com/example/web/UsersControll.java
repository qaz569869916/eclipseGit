package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Service.UserService;
import com.example.pojo.User;

@Controller
public class UsersControll {
	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping("queryAll")
	public List<User> queryAll(){
		return userService.queryAll();
	}
}
