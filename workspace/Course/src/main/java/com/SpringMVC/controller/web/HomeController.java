package com.SpringMVC.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.model.dto.UserDTO;

import javassist.expr.NewArray;


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
	public ModelAndView registerPage(@RequestParam(value= "message" , required = false ) String messages) {
		UserDTO user = new UserDTO();
		String message = "";
		String alert = "";
		ModelAndView mav = new ModelAndView("web/register/register");
		if(messages != null && messages.equals("register_success")) {
			 message = "Congratulations on your successful registration!";
			 alert = "success";
		}else if(messages != null && messages.equals("register_error")) {
			 message = "Plese check username or password again!";
			 alert = "danger";
		}
		mav.addObject("message", message);
		mav.addObject("alert", alert);
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
	
	
	
}
