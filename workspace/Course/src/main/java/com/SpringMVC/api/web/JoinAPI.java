package com.SpringMVC.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.model.convert.joinConvert;
import com.SpringMVC.model.convert.userConvert;
import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.JoinDTO;
import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.JoinEntity;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IJoinService;
import com.SpringMVC.service.IUserService;
import com.SpringMVC.util.SecurityUtils;

@RestController(value = "JoinApiOfWeb")
public class JoinAPI {

	@Autowired
	private IUserService userService;
	@Autowired
	private ICourseService courseService;
	@Autowired
	private IJoinService joinService;
	@Autowired
	private userConvert userConverter;
	@Autowired
	private joinConvert joinConverter;
	
	@GetMapping(value = "/api/join")
	public JoinDTO ReadJoin(){
		return null;
	}
	
	@PostMapping(value = "/api/join")
	public JoinDTO InsertUserInCourse(@RequestBody JoinDTO join){
		return joinService.UserJoinCourse(joinConverter.toEntity(join));
	}
	
	
	@PostMapping(value = "/api/join/{id}")
	public JoinDTO InsertJoin(@PathVariable("id") Long courseid){
		UserDTO user = userService.findByUsername(SecurityUtils.getPrincipal().getUsername());
		CourseEntity course = courseService.findOneById(courseid);
		JoinEntity join = new JoinEntity();
		join.setCourseUser(course);
		join.setUserCourse(userConverter.toEntity(user));
		return joinService.UserJoinCourse(join);
	}
	
	@PutMapping(value = "/api/join")
	public JoinDTO UpdateJoin(@RequestBody JoinDTO joinDto){
		return null;	
	}
	
	@DeleteMapping(value = "/api/join")
	public void DeleteJoin(@RequestBody long id){

	}
}
