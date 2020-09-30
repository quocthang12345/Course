package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.JoinEntity;
import com.SpringMVC.model.entity.UserEntity;

public interface JoinRepository extends JpaRepository<JoinEntity, Long> {

	@Query(value = "SELECT j.userCourse FROM JoinEntity j WHERE j.courseUser = ?1")
	List<UserEntity> getUserJoinInCourse(CourseEntity course);
}
