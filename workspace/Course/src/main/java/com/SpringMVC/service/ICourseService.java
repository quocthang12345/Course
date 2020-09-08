package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.CourseDTO;

public interface ICourseService {
	List<CourseDTO> findList();
}
