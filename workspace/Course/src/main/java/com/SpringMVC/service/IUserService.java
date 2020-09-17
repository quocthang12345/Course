package com.SpringMVC.service;

import com.SpringMVC.model.dto.UserDTO;

public interface IUserService {
	UserDTO registerUser(UserDTO user);
	UserDTO updateUser(UserDTO user);
	UserDTO findByUsername(String username);
	UserDTO findById(Long id);
}
