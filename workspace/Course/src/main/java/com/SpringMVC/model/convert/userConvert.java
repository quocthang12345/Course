package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.model.entity.UserEntity;
import com.SpringMVC.service.IUserService;

@Component
public class userConvert {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private IUserService userService;
	@Autowired
	private PasswordEncoder encoder;
	
	public UserDTO toDTO(UserEntity userEntity) {
		UserDTO user = modelMapper.map(userEntity,UserDTO.class);
		return user;
	}
	
	public UserEntity toEntity(UserDTO userDTO) {
		UserEntity user = modelMapper.map(userDTO, UserEntity.class);
	    if (userDTO.getId() != null) {
	    	UserEntity result = userService.findOne(userDTO.getId());
	    	result.setFullname(userDTO.getFullName());
	    	result.setAvatar(userDTO.getAvatar());
	    	if(userDTO.getPassWord() != null) {
	    		result.setPassword(encoder.encode(userDTO.getPassWord()));
	    	}
	    	return result;
	    }
	    return user;
	}

}
