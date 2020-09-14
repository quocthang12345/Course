package com.SpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.courseConvert;
import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.repository.CourseRepository;
import com.SpringMVC.service.ICourseService;

@Service
public class CourseService implements ICourseService {

	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private courseConvert courseConvert;
	
	@Override
	public List<CourseDTO> findList(String key) {
		List<CourseDTO> result = new ArrayList<CourseDTO>();
		if(key != null) {
			for(CourseEntity course : courseRepo.search(key)) {
				result.add(courseConvert.toDTO(course));
			}
			return result;
		}
		for(CourseEntity course : courseRepo.findAll()) {
			result.add(courseConvert.toDTO(course));
		}
		return result;
	}

	@Override
	public CourseDTO findOne(Long id) {
		return courseConvert.toDTO(courseRepo.findOne(id));
	}

	@Override
	@Transactional
	public CourseDTO Update(CourseDTO course) {
		if(course.getId() != null) {
			CourseEntity newCourse = courseConvert.toEntity(course);
			return courseConvert.toDTO(courseRepo.save(newCourse));
		}
		return courseConvert.toDTO(courseRepo.save(courseConvert.toEntity(course)));
	}

	@Override
	public CourseEntity findOneById(Long id) {
		return courseRepo.findOne(id);
	}

	@Override
	@Transactional
	public void Delete(Long[] ids) {
		for(Long id : ids) {
			courseRepo.delete(id);
		}	
	}

}
