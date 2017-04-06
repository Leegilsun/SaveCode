package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		//data와 jsp페이지를 지정
		mav.addObject("greeting", "HelloWord");//req, setAttribute라고 생각하면됨
		//페이지를지정
		mav.setViewName("hello");
		return mav;
	}
}
