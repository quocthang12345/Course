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
	public LessonDTO Insert(LessonDTO lesson) {
		CourseEntity course = courseRepo.findOne(lesson.getCourseId());
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
	@Transactional
	public LessonDTO Update(LessonDTO lesson) {
		LessonEntity newLesson = convertLesson.toEntity(lesson);
		return convertLesson.toDTO(lessonRepo.save(newLesson));
	}

	@Override
	@Transactional
	public void Delete(Long[] ids) {
		for(Long id : ids) {
			lessonRepo.delete(id);
		}
	}

	@Override
	public List<LessonDTO> findByCourseID(Long courseID,String keyword) {
		List<LessonDTO> rs = new ArrayList<>();
		if(keyword != null) {
			for(LessonEntity lessonFind : lessonRepo.search(keyword)) {
				rs.add(convertLesson.toDTO(lessonFind));
			}
			return rs;
		}
		for(LessonEntity lesson : lessonRepo.findByCourseId(courseID)) {
			rs.add(convertLesson.toDTO(lesson));
		}
		return rs;
	}


	@Override
	public List<LessonDTO> findListByCourseID(Long courseID) {
		List<LessonDTO> result = new ArrayList<LessonDTO>();
		for(LessonEntity lesson : lessonRepo.findByCourseId(courseID)) {
			result.add(convertLesson.toDTO(lesson));
		}
		return result;
	}

	@Override
	public Long getLastIdLesson() {
		return lessonRepo.getLastId();
	}

	@Override
	public Long getNextIdLesson(Long previousID) {
		return lessonRepo.getNextId(previousID);
	}

}
