package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.JoinDTO;
import com.SpringMVC.model.entity.JoinEntity;
import com.SpringMVC.service.IJoinService;

@Component
public class joinConvert {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private IJoinService joinService;
	
	public JoinDTO toDTO(JoinEntity joinEntity) {
		JoinDTO join = modelMapper.map(joinEntity,JoinDTO.class);
		return join;
	}
	
	public JoinEntity toEntity(JoinDTO joinDTO) {
		JoinEntity join = modelMapper.map(joinDTO, JoinEntity.class);
	    if (joinDTO.getId() != null) {
	    	JoinEntity joinEntity = joinService.findOneById(joinDTO.getId());
	    	joinEntity.setCourseUser(join.getCourseUser());
	    	joinEntity.setUserCourse(join.getUserCourse());
	    	return joinEntity;
	    }
	    return join;
	}
}
