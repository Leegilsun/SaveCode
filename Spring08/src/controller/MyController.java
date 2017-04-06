package controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("hello.do")
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("greeting", "Hello");
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
}
