package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringMVC.model.entity.LessonEntity;

public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
	List<LessonEntity> findByCourseId(Long courseID);	
	
	@Query(value = "SELECT l FROM LessonEntity l WHERE l.lessonName LIKE %?1%")
	List<LessonEntity> search(String keyword);
}
