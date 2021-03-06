package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.MajorEntity;

public interface ICourseService {
	List<CourseDTO> findList(String key);
	List<CourseEntity> findListEntity(MajorEntity major);
	CourseDTO findOne(Long id);
	CourseDTO Update(CourseDTO course);
	CourseEntity findOneById(Long id);
	void Delete(Long[] ids);
}
