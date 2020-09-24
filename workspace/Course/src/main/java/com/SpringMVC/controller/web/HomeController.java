package com.SpringMVC.controller.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.model.dto.ReviewDTO;
import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.ILessonService;
import com.SpringMVC.service.IReviewService;
import com.SpringMVC.service.IUserService;
import com.SpringMVC.util.MessageUtils;
import com.SpringMVC.util.SecurityUtils;


@Controller
public class HomeController {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private ICourseService courseService;
	@Autowired
	private ILessonService lessonService;
	@Autowired
	private IReviewService reviewService;

	@RequestMapping(value = "/trang-chu" , method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		UserDTO user = userService.findByUsername(SecurityUtils.getPrincipal().getUsername());
		mav.addObject("user",user);
		return mav;
	}
	
	@RequestMapping(value = "/khoa-hoc" , method = RequestMethod.GET)
	public ModelAndView coursePage() {
		ModelAndView mav = new ModelAndView("web/list-course/list-course");
		mav.addObject("listCourseJava",courseService.findList("Java "));
		mav.addObject("listCourseJavaScript",courseService.findList("JavaScript"));
		return mav;
	}
	
	@RequestMapping(value = "/mon-hoc" , method = RequestMethod.GET)
	public ModelAndView lessonPage(@RequestParam(value="id",required = false) Long id) {
		ModelAndView mav = new ModelAndView("web/lesson/lesson");
		mav.addObject("listReview",reviewService.findAllByCourse(courseService.findOneById(id)));
		mav.addObject("course",courseService.findOne(id));
		mav.addObject("user",userService.findByUsername(SecurityUtils.getPrincipal().getUsername()));
		mav.addObject("listLesson",lessonService.findListByCourseID(id));		 
		mav.addObject("review",new ReviewDTO());
		return mav;
	}
	
	
	@RequestMapping(value = "/video-mon-hoc" , method = RequestMethod.GET)
	public ModelAndView videoPage(@RequestParam(value="id",required = false)Long id) {
		ModelAndView mav = new ModelAndView("web/video-lesson/video-lesson");	
		mav.addObject("nextLessonID",lessonService.getNextIdLesson(id));
		mav.addObject("lesson",lessonService.findOne(id));
		mav.addObject("lastLessonID",lessonService.getLastIdLesson());
		return mav;
	}
	
	@RequestMapping(value = "/dang-nhap" , method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("web/login/login");
		return mav;
	}
	
	@RequestMapping(value = "/dang-ky" , method = RequestMethod.GET)
	public ModelAndView registerPage(@RequestParam(value= "message" , required = false ) String messages, HttpServletRequest request) {
		UserDTO user = new UserDTO();
		ModelAndView mav = new ModelAndView("web/register/register");
		MessageUtils.ShowMessage(request);
		mav.addObject("user", user);
		return mav;
	}
	
	@RequestMapping(value = "/thoat", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/trang-chu");
	}
	
	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public ModelAndView accessDenied() {
		return new ModelAndView("redirect:/dang-nhap?accessDenied");
	}
	
	@RequestMapping(value = "/profile" , method = RequestMethod.GET)
	public ModelAndView profilePage(@RequestParam(value="id", required = false)Long id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("profile/profile");
		UserDTO user = userService.findById(id);
		MessageUtils.ShowMessage(request);
		mav.addObject("profile", user);
		return mav;
	}
	
	
	
}
