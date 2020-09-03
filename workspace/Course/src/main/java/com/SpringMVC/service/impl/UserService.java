package com.SpringMVC.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.userConvert;
import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.repository.UserRepository;
import com.SpringMVC.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private userConvert userConverter;
	

	@Override
	public UserDTO registerUser(UserDTO user) {
		UserDTO checkUser = userConverter.toDTO(userRepo.findOneByUserNameAndStatus(user.getUserName(), 1));
		if(checkUser != null) {
			return null;
		}
		return userConverter.toDTO(userRepo.save(userConverter.toEntity(user)));
	}

}
