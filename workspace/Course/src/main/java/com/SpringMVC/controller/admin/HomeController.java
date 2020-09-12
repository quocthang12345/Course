package com.SpringMVC.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.LessonDTO;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.ILessonService;
import com.SpringMVC.util.MessageUtils;

@Controller(value = "ControllerOfAdmin")
public class HomeController {

	@Autowired
	private ICourseService courseService;
	@Autowired
	private ILessonService lessonService;
	
	@RequestMapping(value = "/admin-home" , method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("listcourse", courseService.findList());
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/edit-course" , method = RequestMethod.GET)
	public ModelAndView editCoursePage(@RequestParam(value = "id", required = false) Long id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/edit/edit-course");
		CourseDTO course = new CourseDTO();
		if(id != null) {
			course = courseService.findOne(id);
		}
		MessageUtils.ShowMessage(request);
		mav.addObject("course", course);
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/edit-lesson" , method = RequestMethod.GET)
	public ModelAndView editLessonPage(@RequestParam(value = "id" ,required = false) Long id, HttpServletRequest request,@RequestParam(value = "courseid" ,required = false)Long courseID ) {
		ModelAndView mav = new ModelAndView("admin/add-lesson/edit-lesson");
		LessonDTO lesson = new LessonDTO();
		if(id != null) {
			lesson = lessonService.findOne(id);
		}
		lesson.setCourseId(courseID);
		MessageUtils.ShowMessage(request);
		mav.addObject("lesson",lesson);
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/add-lesson" , method = RequestMethod.GET)
	public ModelAndView addLessonPage(@RequestParam(value = "id",required = false) Long id) {
		ModelAndView mav = new ModelAndView("admin/add-lesson/add-lesson");
		CourseDTO courseInLesson = courseService.findOne(id);
		mav.addObject("listLesson", lessonService.findByCourseID(id));
		mav.addObject("courseLesson", courseInLesson);
		return mav;
	}
}
