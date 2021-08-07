package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vo.RegVo;

@Controller
public class RegController {

	@RequestMapping(value = "form.html", method = RequestMethod.GET)
	public ModelAndView load() {

		return new ModelAndView("form", "RegVO", new RegVo());

	}
	
	@RequestMapping(value = "login.html", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute RegVo regVo,HttpServletRequest request) {

		HttpSession hs=request.getSession();
		hs.setAttribute("vo", regVo);
		hs.setAttribute("username", regVo.getUn());
		hs.setAttribute("password", regVo.getPass());
		
		return new ModelAndView("login","data",new RegVo());

	}
	
	@RequestMapping(value = "check.html", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute RegVo regVo,HttpServletRequest request) {

		HttpSession hs=request.getSession();
		hs.getAttribute("vo");
		
		if(regVo.getUn().equals(hs.getAttribute("username")) && regVo.getPass().equals(hs.getAttribute("password"))){
			return new ModelAndView("display","data",hs.getAttribute("vo"));
		}
		else{
			return new ModelAndView("login","data",new RegVo());
		}

	}

}
