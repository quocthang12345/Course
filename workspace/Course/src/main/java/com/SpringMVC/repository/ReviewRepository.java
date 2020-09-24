package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
	  
	  @Query(value = "SELECT r FROM ReviewEntity r WHERE r.courseReview = ?1 ORDER BY r.id DESC")
	  List<ReviewEntity> findByCourseReview(CourseEntity course);
}
