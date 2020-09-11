package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.model.entity.LessonEntity;

@Component
public class lessonConvert {
	@Autowired
	private ModelMapper modelMapper;
	
	public LessonDTO toDTO(LessonEntity lessonEntity) {
		LessonDTO lesson = modelMapper.map(lessonEntity,LessonDTO.class);
		return lesson;
	}
	
	public LessonEntity toEntity(LessonDTO lessonDto) {
		LessonEntity lesson = modelMapper.map(lessonDto, LessonEntity.class);
	    if (lessonDto.getId() != null) {
			/*
			 * CourseEntity result = courseService.findOneById(courseDto.getId());
			 * result.setCourseContent(courseDto.getCourseContent());
			 * result.setCourseDescription(courseDto.getCourseDescription());
			 * result.setCourseName(courseDto.getCourseName());
			 * result.setThumbnail(courseDto.getThumbnail()); return result;
			 */
	    }
	    return lesson;
	}
}
