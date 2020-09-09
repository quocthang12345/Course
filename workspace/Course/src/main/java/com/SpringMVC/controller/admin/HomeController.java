package com.SpringMVC.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.service.ICourseService;

@Controller(value = "ControllerOfAdmin")
public class HomeController {

	@Autowired
	private ICourseService courseService;
	
	@RequestMapping(value = "/admin-home" , method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("listcourse", courseService.findList());
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/edit-course" , method = RequestMethod.GET)
	public ModelAndView editCoursePage(@RequestParam(value = "id", required = false) Long id) {
		ModelAndView mav = new ModelAndView("admin/edit/edit-course");
		CourseDTO course = new CourseDTO();
		if(id != null) {
			course = courseService.findOne(id);
		}
		mav.addObject("course", course);
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/edit-lesson" , method = RequestMethod.GET)
	public ModelAndView editLessonPage() {
		ModelAndView mav = new ModelAndView("admin/edit/edit-lesson");
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/add-lesson" , method = RequestMethod.GET)
	public ModelAndView addLessonPage() {
		ModelAndView mav = new ModelAndView("admin/add-lesson/add-lesson");
		return mav;
	}
}
