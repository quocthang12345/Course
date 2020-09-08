package com.SpringMVC.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "ControllerOfAdmin")
public class HomeController {

	@RequestMapping(value = "/admin-home" , method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		return mav;
	}
	
	@RequestMapping(value = "/admin-home/edit-course" , method = RequestMethod.GET)
	public ModelAndView editCoursePage() {
		ModelAndView mav = new ModelAndView("admin/edit/edit-course");
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
