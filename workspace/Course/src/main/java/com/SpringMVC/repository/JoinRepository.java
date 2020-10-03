package com.SpringMVC.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.JoinEntity;
import com.SpringMVC.model.entity.UserEntity;

public interface JoinRepository extends JpaRepository<JoinEntity, Long> {

	@Query(value = "SELECT j.userCourse FROM JoinEntity j WHERE j.courseUser = ?1")
	List<UserEntity> getUserJoinInCourse(CourseEntity course);
	
	@Query(value = "SELECT course_id FROM user_join_course GROUP BY course_id ORDER BY COUNT(user_id) DESC LIMIT ?1",nativeQuery = true)
	List<BigInteger> getTopCourse(int count);
	
	@Query(value = "SELECT course_id FROM user_join_course GROUP BY course_id ORDER BY COUNT(user_id) DESC", nativeQuery = true)
	List<BigInteger> getTopCourseInJava();
}
