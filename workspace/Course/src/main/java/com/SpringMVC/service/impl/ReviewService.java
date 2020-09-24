package com.SpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.reviewConvert;
import com.SpringMVC.model.dto.ReviewDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.ReviewEntity;
import com.SpringMVC.repository.ReviewRepository;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IReviewService;
import com.SpringMVC.service.IUserService;

@Service
public class ReviewService implements IReviewService {

	@Autowired
	private ICourseService courseService;
	@Autowired
	private IUserService userService;
	@Autowired
	private reviewConvert reviewConverter;
	@Autowired
	private ReviewRepository reviewRepo;

	@Override
	public ReviewDTO InsertReview(ReviewDTO reviewDTO) {
		ReviewEntity reviewEntity = new ReviewEntity();
		reviewEntity.setContentReview(reviewDTO.getReviewContent());
		reviewEntity.setCourseReview(courseService.findOneById(reviewDTO.getCourseID()));
		reviewEntity.setUserReview(userService.findOne(reviewDTO.getUserID()));
		return reviewConverter.toDTO(reviewRepo.save(reviewEntity));
	}

	@Override
	public List<ReviewDTO> findAllByCourse(CourseEntity Course) {
		List<ReviewDTO> result = new ArrayList<ReviewDTO>();
		
		 for(ReviewEntity review : reviewRepo.findByCourseReview(Course)) {
			 ReviewDTO reviewDTO = reviewConverter.toDTO(review);
			 reviewDTO.setUserName(userService.getNameOfUserById(reviewDTO.getUserID()));
			 result.add(reviewDTO); 
		 }
		 
		return result;
	}

	@Override
	public void DeleteReview(Long id) {
		reviewRepo.delete(id);
	}

}
