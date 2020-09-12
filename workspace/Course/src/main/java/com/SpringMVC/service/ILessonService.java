package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.model.entity.LessonEntity;

public interface ILessonService {
	List<LessonDTO> findAll();
	LessonDTO Insert(LessonDTO lesson);
	LessonDTO findOne(Long id);
	LessonEntity findById(Long id);
	LessonDTO Update(LessonDTO lesson);
	void Delete(Long[] ids);
	List<LessonDTO> findByCourseID(Long courseID);
}
