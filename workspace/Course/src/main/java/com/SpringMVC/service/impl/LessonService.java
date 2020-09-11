package com.SpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.lessonConvert;
import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.LessonEntity;
import com.SpringMVC.repository.CourseRepository;
import com.SpringMVC.repository.LessonRepository;
import com.SpringMVC.service.ILessonService;

@Service
public class LessonService implements ILessonService {
	
	@Autowired
	private lessonConvert convertLesson;
	@Autowired
	private LessonRepository lessonRepo;
	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public List<LessonDTO> findAll() {
		List<LessonDTO> result = new ArrayList<>();
		for(LessonEntity lesson : lessonRepo.findAll()) {
			result.add(convertLesson.toDTO(lesson));
		}
		return result;
	}

	@Override
	@Transactional
	public LessonDTO Insert(LessonDTO lesson,Long courseID) {
		CourseEntity course = courseRepo.findOne(courseID);
		LessonEntity lessonEntity = convertLesson.toEntity(lesson);
		lessonEntity.setCourse(course);
		return convertLesson.toDTO(lessonRepo.save(lessonEntity));
	}
	

	@Override
	public LessonDTO findOne(Long id) {
		return convertLesson.toDTO(lessonRepo.findOne(id));
	}

	@Override
	public LessonEntity findById(Long id) {
		return lessonRepo.findOne(id);
	}

	@Override
	public LessonDTO Update(LessonDTO lesson) {
		LessonEntity newLesson = convertLesson.toEntity(lesson);
		return convertLesson.toDTO(lessonRepo.save(newLesson));
	}
}
