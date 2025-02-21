package com.prjFDQ.FDQ.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjFDQ.FDQ.dto.UserDTO;
import com.prjFDQ.FDQ.services.UserService;

@RestController
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/register")
	public void register(@RequestBody UserDTO userDTO) {
		userService.register(userDTO);
	}
	

}
