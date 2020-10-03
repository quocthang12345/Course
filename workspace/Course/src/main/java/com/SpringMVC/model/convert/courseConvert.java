package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.MajorEntity;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IMajorService;

@Component
public class courseConvert {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ICourseService courseService;
	
	public CourseDTO toDTO(CourseEntity courseEntity) {
		CourseDTO course = modelMapper.map(courseEntity,CourseDTO.class);
		return course;
	}
	
	public CourseEntity toEntity(CourseDTO courseDto) {
		CourseEntity course = modelMapper.map(courseDto, CourseEntity.class);
	    if (courseDto.getId() != null) {
	    	CourseEntity result = courseService.findOneById(courseDto.getId());
	    	result.setCourseContent(courseDto.getCourseContent());
	    	result.setCourseDescription(courseDto.getCourseDescription());
	    	result.setCourseName(courseDto.getCourseName());
//	    	result.setThumbnail(courseDto.getThumbnail());
	    	return result;
	    }
	    return course;
	}
}
