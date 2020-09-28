package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.UserEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
	
	@Query(value = "SELECT c FROM CourseEntity c WHERE c.courseName LIKE %?1%")
	List<CourseEntity> search(String keyword);
	
	@Query(value = "SELECT c.users FROM CourseEntity c WHERE c.id = ?1")
	List<UserEntity> getUserInCourse(Long courseID);

}
