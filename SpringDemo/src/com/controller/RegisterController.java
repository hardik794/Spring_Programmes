package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {


	@RequestMapping(value="reg.html", method = RequestMethod.GET)
	public ModelAndView register()
	{
		return new ModelAndView("reg");
	}
	

	
	@RequestMapping(value="display.html", method = RequestMethod.POST)
	public ModelAndView display(HttpServletRequest request){
		
		String fn = request.getParameter("fn") ;
		String ln = request.getParameter("ln") ;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display");
		mv.addObject("fn", fn);
		mv.addObject("ln", ln);
		return mv;
		
	}
	
	@RequestMapping(value="login.html",method= RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request){
		String s1=request.getParameter("fn");
		String s2=request.getParameter("ln");
		String s3=request.getParameter("un");
		String s4=request.getParameter("pass");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("username", s3);
		hs.setAttribute("password", s4);
		hs.setAttribute("firstname", s1);
		hs.setAttribute("lastname", s2);
		return new ModelAndView("Login");
	}
	
	@RequestMapping(value="check.html",method= RequestMethod.POST)
	public ModelAndView check(HttpServletRequest request){
		String s1=request.getParameter("login_un");
		String s2=request.getParameter("login_pass");
		
		HttpSession hs=request.getSession();
		ModelAndView mv=new ModelAndView();
		if(s1.equals(hs.getAttribute("username")) && s2.equals(hs.getAttribute("password"))){
			mv.addObject("fn", hs.getAttribute("firstname"));
			mv.addObject("ln", hs.getAttribute("lastname"));
			mv.setViewName("Display");
		}
		else
		{
			mv.setViewName("Login");
		}
		return mv;
		
	}

}
