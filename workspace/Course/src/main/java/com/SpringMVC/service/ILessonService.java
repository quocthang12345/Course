package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.LessonDTO;

public interface ILessonService {
	List<LessonDTO> findAll();
	LessonDTO Insert(LessonDTO lesson);
	LessonDTO findOne(Long id);
}
