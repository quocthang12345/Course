package com.SpringMVC.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping(value = "/trang-chu" , method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}
	
	@RequestMapping(value = "/khoa-hoc" , method = RequestMethod.GET)
	public ModelAndView coursePage() {
		ModelAndView mav = new ModelAndView("web/list-course/list-course");
		return mav;
	}
	
	@RequestMapping(value = "/mon-hoc" , method = RequestMethod.GET)
	public ModelAndView lessonPage() {
		ModelAndView mav = new ModelAndView("web/lesson/lesson");
		return mav;
	}
	
	@RequestMapping(value = "/video-mon-hoc" , method = RequestMethod.GET)
	public ModelAndView videoPage() {
		ModelAndView mav = new ModelAndView("web/video-lesson/video-lesson");
		return mav;
	}
	
	@RequestMapping(value = "/dang-nhap" , method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("web/login/login");
		return mav;
	}
	
	@RequestMapping(value = "/dang-ky" , method = RequestMethod.GET)
	public ModelAndView registerPage() {
		ModelAndView mav = new ModelAndView("web/register/register");
		return mav;
	}
	
	
	
}
