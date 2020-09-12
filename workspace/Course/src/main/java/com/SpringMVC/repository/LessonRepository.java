package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.model.entity.LessonEntity;

public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
	List<LessonEntity> findByCourseId(Long courseID);
}
