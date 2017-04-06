package controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("hello.do")
	public ModelAndView hello(HttpServletRequest req, HttpServletResponse resp, @RequestParam(required=false, value="name")String n, @RequestParam(defaultValue="0")int age){
		ModelAndView mav = new ModelAndView();
		mav.addObject("greeting", "Hello");
		mav.addObject("yourIP", req.getRemoteAddr());
		mav.addObject("yourName", n);
		mav.addObject("yourAge", age);
		mav.setViewName("hello.jsp");
		return mav;
	}
	
	@RequestMapping("whatTime.do")
	public ModelAndView whatTime(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("time", new Date());
		mav.setViewName("whatTime.jsp");
		return mav;
	}
	@RequestMapping("goToNaver.do")
	public ModelAndView goToNaver(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:http://www.naver.com");
		return mav;
	}
}
