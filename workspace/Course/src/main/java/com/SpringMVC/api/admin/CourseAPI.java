package com.SpringMVC.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.service.ICourseService;

@RestController(value = "RestApiOfCourse")
public class CourseAPI {
	@Autowired
	private ICourseService courseService;
	@GetMapping(value = "/api/course")
	public CourseDTO ReadCourse(){
		return null;
		
	}
	
	@PostMapping(value = "/api/course")
	public CourseDTO InsertCourse(@RequestBody CourseDTO courseDto){
		return courseService.Insert(courseDto);
	}
	
	@PutMapping(value = "/api/course")
	public CourseDTO UpdateCourse(@RequestBody CourseDTO courseDto){
		return null;
		
	}
	
	@DeleteMapping(value = "/api/course")
	public void DeleteCourse(@RequestBody long[] ids){
		
	}
}
