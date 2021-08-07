package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping(value="hello.html", method = RequestMethod.GET)
	public ModelAndView Load()
	{
		String s = "This is Spring Example...";
		return new ModelAndView("Demo","msg",s);
	}
	
//	@RequestMapping(value="display.html", method = RequestMethod.POST)
//	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		String fn = request.getParameter("fn") ;
//		String ln = request.getParameter("ln") ;
//		String un_reg = request.getParameter("reg_un") ;
//		String pass_reg = request.getParameter("reg_pass") ;
//		String un_login = request.getParameter("login_un") ;
//		String pass_login = request.getParameter("login_pass") ;
//		
//if(un_reg.equals(un_login) && pass_reg.equals(pass_login)){
//	ModelAndView mv = new ModelAndView();
//	mv.setViewName("Display");
//	mv.addObject("fn", fn);
//	mv.addObject("ln", ln);
//	return mv;
//}
//else{
//	ModelAndView mv = new ModelAndView();
//	mv.setViewName("Login");
//	mv.addObject("fn", fn);
//	mv.addObject("ln", ln);
//	mv.addObject("un", un_reg);
//	mv.addObject("pass", pass_reg);
//	return mv;
//}
//		
//		
//	}
	
	
//	@RequestMapping(value="reg.html",method= RequestMethod.GET)
//	public ModelAndView reg(){
//		return new ModelAndView("reg");
//	}
//	
//	@RequestMapping(value="login.html",method= RequestMethod.POST)
//	public ModelAndView Login(HttpServletRequest request){
//		String s1=request.getParameter("fn");
//		String s2=request.getParameter("ln");
//		String s3=request.getParameter("un");
//		String s4=request.getParameter("pass");
//		
//		HttpSession hs=request.getSession();
//		hs.setAttribute("username", s3);
//		hs.setAttribute("password", s4);
//		hs.setAttribute("firstname", s1);
//		hs.setAttribute("lastname", s2);
//		return new ModelAndView("Login");
//	}
	
	
//	@RequestMapping(value="check.html",method= RequestMethod.POST)
//	public ModelAndView check(HttpServletRequest request)throws IOException,ServletException{
//		String s1=request.getParameter("login_un");
//		String s2=request.getParameter("login_pass");
//		
//		HttpSession hs=request.getSession();
//		ModelAndView mv=new ModelAndView();
//		if(s1.equals(hs.getAttribute("username")) && s2.equals(hs.getAttribute("password"))){
//			mv.addObject("fn", hs.getAttribute("firstname"));
//			mv.addObject("ln", hs.getAttribute("lastname"));
//			mv.setViewName("Display");
//		}
//		else
//		{
//			mv.setViewName("Login");
//		}
//		return mv;
//		
//	}
	
}
