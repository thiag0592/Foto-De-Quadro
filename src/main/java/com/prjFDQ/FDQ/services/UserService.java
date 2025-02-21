package com.prjFDQ.FDQ.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjFDQ.FDQ.dto.UserDTO;
import com.prjFDQ.FDQ.entities.User;
import com.prjFDQ.FDQ.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void register(UserDTO dto) {
		User user = new User(dto);
		userRepository.save(user);
	}
	
}
