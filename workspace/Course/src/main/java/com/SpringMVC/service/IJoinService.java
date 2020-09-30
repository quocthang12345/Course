package com.SpringMVC.service;

import com.SpringMVC.model.dto.JoinDTO;
import com.SpringMVC.model.entity.JoinEntity;

public interface IJoinService {
	
	JoinDTO UserJoinCourse(JoinEntity join);
	JoinEntity findOneById(Long id);
}
