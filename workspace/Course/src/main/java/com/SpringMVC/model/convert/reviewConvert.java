package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.ReviewDTO;
import com.SpringMVC.model.entity.ReviewEntity;

@Component
public class reviewConvert {
	@Autowired
	private ModelMapper modelMapper;
	
	public ReviewDTO toDTO(ReviewEntity reviewEntity) {
		ReviewDTO review = modelMapper.map(reviewEntity,ReviewDTO.class);
		return review;
	}
	
	public ReviewEntity toEntity(ReviewDTO reviewDTO) {
		ReviewEntity review = modelMapper.map(reviewDTO, ReviewEntity.class);
	    if (reviewDTO.getId() != null) {
	    	
	    }
	    return review;
	}
}
