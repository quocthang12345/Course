package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.ReviewDTO;
import com.SpringMVC.model.entity.CourseEntity;

public interface IReviewService {
	 ReviewDTO InsertReview(ReviewDTO reviewDTO);
	 List<ReviewDTO> findAllByCourse(CourseEntity Course);
	 void DeleteReview(Long id);
}
