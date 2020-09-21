package com.SpringMVC.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.model.dto.ReviewDTO;
import com.SpringMVC.service.IReviewService;

@RestController(value = "ReviewApiOfWeb")
public class ReviewAPI {
	
	@Autowired
	private IReviewService reviewService;
	
	@GetMapping(value = "/api/review")
	public ReviewDTO ReadReview(){
		return null;
	}
	
	@PostMapping(value = "/api/review")
	public ReviewDTO InsertReview(@RequestBody ReviewDTO reviewDto){
		return reviewService.InsertReview(reviewDto);
	}
	
	@PutMapping(value = "/api/review")
	public ReviewDTO UpdateReview(@RequestBody ReviewDTO userDto){
		return null;	
	}
	
	@DeleteMapping(value = "/api/review")
	public void DeleteReview(@RequestBody long[] ids){
		
	}
}
