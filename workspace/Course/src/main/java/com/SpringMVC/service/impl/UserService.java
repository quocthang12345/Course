package com.SpringMVC.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.userConvert;
import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.model.entity.HistoryEntity;
import com.SpringMVC.model.entity.RoleEntity;
import com.SpringMVC.model.entity.UserEntity;
import com.SpringMVC.repository.HistoryRepository;
import com.SpringMVC.repository.RoleRepository;
import com.SpringMVC.repository.UserRepository;
import com.SpringMVC.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private userConvert userConverter;
	@Autowired
	private HistoryRepository historyRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private PasswordEncoder encoder;

	@Override
	@Transactional
	public UserDTO registerUser(UserDTO userDTO) {
		UserEntity checkUser = userRepo.findOneByUserNameAndStatus(userDTO.getUserName(), 1);
		if(checkUser != null) {
			return null;
		}
		RoleEntity role = roleRepo.findOneByRoleCode("USER");
		UserEntity user = userConverter.toEntity(userDTO);
		HistoryEntity history = historyRepo.save(new HistoryEntity());
		role.getUsers().add(user);
		user.setHistory(history);
		user.setPassword(encoder.encode(user.getPassword()));
		user.setStatus(1);
		user.getRoles().add(role);
		return userConverter.toDTO(userRepo.save(user));
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO) {
		UserEntity user = userConverter.toEntity(userDTO);
		return userConverter.toDTO(userRepo.save(user));
	}

	@Override
	public UserDTO findByUsername(String username) {
		return userConverter.toDTO(userRepo.findOneByUserNameAndStatus(username, 1));
	}

	@Override
	public UserDTO findById(Long id) {
		// TODO Auto-generated method stub
		return userConverter.toDTO(userRepo.findOne(id));
	}

}
