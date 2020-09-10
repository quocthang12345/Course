package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.entity.CourseEntity;

public interface ICourseService {
	List<CourseDTO> findList();
	CourseDTO findOne(Long id);
	CourseDTO Update(CourseDTO course);
	CourseEntity findOneById(Long id);
	void Delete(Long[] ids);
}
