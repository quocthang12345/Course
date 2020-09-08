package com.SpringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.model.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

}
