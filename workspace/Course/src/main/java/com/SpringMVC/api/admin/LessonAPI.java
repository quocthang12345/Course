package com.SpringMVC.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.service.ILessonService;

@RestController(value = "RestApiOfLesson")
public class LessonAPI {
	
	@Autowired
	private ILessonService lessonService;
	
	@GetMapping(value = "/api/lesson")
	public List<LessonDTO> GetLesson() {
		return null;	
	}
	@PostMapping(value = "/api/lesson")
	public LessonDTO InsertLesson(@RequestBody LessonDTO lesson) {
		return lessonService.Insert(lesson);	
	}
	@PutMapping(value = "/api/lesson")
	public LessonDTO UpdateLesson(@RequestBody LessonDTO lesson) {
		return lessonService.Update(lesson);	
	}
	@DeleteMapping(value = "/api/lesson")
	public void DeleteLesson(@RequestBody Long[] ids) {
		lessonService.Delete(ids);
	}

}
