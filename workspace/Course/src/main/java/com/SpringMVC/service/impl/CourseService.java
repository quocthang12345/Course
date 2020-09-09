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
	public List<CourseDTO> findList() {
		List<CourseDTO> result = new ArrayList<CourseDTO>();
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
	public CourseDTO Insert(CourseDTO course) {
		return courseConvert.toDTO(courseRepo.save(courseConvert.toEntity(course)));
	}

}
