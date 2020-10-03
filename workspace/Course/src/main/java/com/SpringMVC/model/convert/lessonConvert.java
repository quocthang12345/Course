package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.LessonEntity;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.ILessonService;

@Component
public class lessonConvert {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ILessonService lessonService;
	@Autowired
	private ICourseService courseService;
	
	public LessonDTO toDTO(LessonEntity lessonEntity) {
		LessonDTO lesson = modelMapper.map(lessonEntity,LessonDTO.class);
		return lesson;
	}
	
	public LessonEntity toEntity(LessonDTO lessonDto) {
		LessonEntity lesson = modelMapper.map(lessonDto, LessonEntity.class);
	    if (lessonDto.getId() != null) {
	    	LessonEntity result = lessonService.findById(lessonDto.getId());
	    	CourseEntity course = courseService.findOneById(lessonDto.getCourseId());
			 result.setCourse(course);
			 result.setDescriptionLesson(lessonDto.getLessonDescription());
			 result.setLessonName(lessonDto.getLessonName());
//			 result.setVideo(lessonDto.getVideo());
			 return result;
	    }
	    return lesson;
	}
}
