package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.model.dto.MajorDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.LessonEntity;
import com.SpringMVC.model.entity.MajorEntity;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.ILessonService;

@Component
public class majorConvert {
	@Autowired
	private ModelMapper modelMapper;
	
	public MajorDTO toDTO(MajorEntity majorEntity) {
		MajorDTO major = modelMapper.map(majorEntity,MajorDTO.class);
		return major;
	}
	
	public MajorEntity toEntity(MajorDTO majorDto) {
		MajorEntity major = modelMapper.map(majorDto, MajorEntity.class);
	    if (majorDto.getId() != null) {
//	    	MajorEntity result = lessonService.findById(majorDto.getId());
//	    	CourseEntity course = courseService.findOneById(lessonDto.getCourseId());
//			 result.setCourse(course);
//			 result.setDescriptionLesson(lessonDto.getLessonDescription());
//			 result.setLessonName(lessonDto.getLessonName());
//			 result.setVideo(lessonDto.getVideo());
//			 return result;
	    }
	    return major;
	}
}
