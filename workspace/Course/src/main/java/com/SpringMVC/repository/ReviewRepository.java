package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
	
	  List<ReviewEntity> findByCourseReview(CourseEntity course);
}
