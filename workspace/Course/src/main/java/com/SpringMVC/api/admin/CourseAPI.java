package com.SpringMVC.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IUserService;
import com.SpringMVC.util.SecurityUtils;

@RestController(value = "CourseApiOfAdmin")
public class CourseAPI {
	@Autowired
	private ICourseService courseService;
	@Autowired
	private IUserService userService;
	
	@GetMapping(value = "/api/course")
	public CourseDTO ReadCourse(){
		return null;
		
	}
	
	@PostMapping(value = "/api/course")
	public CourseDTO InsertCourse(@RequestBody CourseDTO courseDto){
		return courseService.Update(courseDto);
	}
	
	@PutMapping(value = "/api/course")
	public CourseDTO UpdateCourse(@RequestBody CourseDTO courseDto){
		return courseService.Update(courseDto);	
	}
	
	@PutMapping(value = "/api/course/{id}")
	public CourseDTO AddUserInCourse(@PathVariable("id") Long courseid){
		/*thay đổi method get user bằng get id trên presentation xuongs và call service thực hiện, và nên truyền 2 entity xuống*/
		UserDTO user = userService.findByUsername(SecurityUtils.getPrincipal().getUsername());
		CourseDTO course = courseService.findOne(courseid);
		return courseService.addUserInCourse(user, course);	
	}
	
	@DeleteMapping(value = "/api/course")
	public void DeleteCourse(@RequestBody Long[] ids){
		courseService.Delete(ids);
	}
}
