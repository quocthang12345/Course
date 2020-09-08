package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.entity.CourseEntity;

@Component
public class courseConvert {
	@Autowired
	private ModelMapper modelMapper;
	
	public CourseDTO toDTO(CourseEntity courseEntity) {
		CourseDTO course = modelMapper.map(courseEntity,CourseDTO.class);
		return course;
	}
	
	public CourseEntity toEntity(CourseDTO courseDto) {
		CourseEntity course = modelMapper.map(courseDto, CourseEntity.class);
	    if (courseDto.getId() != null) {
//	    	UserEntity oldUser = postService.getPostById(postDto.getId());
//	        post.setRedditID(oldPost.getRedditID());
//	        post.setSent(oldPost.isSent());
	    }
	    return course;
	}
}
