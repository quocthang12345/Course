package com.SpringMVC.service;

import java.util.List;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.JoinDTO;
import com.SpringMVC.model.entity.JoinEntity;

public interface IJoinService {
	
	JoinDTO UserJoinCourse(JoinEntity join);
	JoinEntity findOneById(Long id);
	List<CourseDTO> getTopCourse(int count);
}
