package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.RegDAO;
import com.model.LoginVo;
import com.model.RegVO;

import sun.util.logging.resources.logging;

@Controller
public class RegController {

	@Autowired
	private RegDAO regDAO;


	@RequestMapping(value = "load.html", method = RequestMethod.GET)
	public ModelAndView load() {

		return new ModelAndView("Registration", "RegVO", new RegVO());

	}

	@RequestMapping(value = "insert.html", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute RegVO regVo) {

		LoginVo vo = regVo.getLoginVo();
		regDAO.insert(vo);
		regDAO.insert(regVo);
		return new ModelAndView("redirect:/search.html");

	}

	@RequestMapping(value = "search.html", method = RequestMethod.GET)
	public ModelAndView search() {

		List<RegVO> searchList = regDAO.search();
		return new ModelAndView("Search", "SearchList", searchList);

	}

	@RequestMapping(value = "delete.html", method = RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute RegVO regVO, @RequestParam int id,@RequestParam int lid) {

		regVO.setId(id);
		
		LoginVo vo = new LoginVo();
		
//		LoginVo vo = regVo.getLoginVo();
		
		vo.setId(lid);
		
		regDAO.delete(regVO);
		regDAO.delete(vo);

		return new ModelAndView("redirect:/search.html");

	}

	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public ModelAndView edit( @ModelAttribute RegVO regVO, @RequestParam int id) {

		regVO.setId(id);
		List<RegVO> editList = regDAO.edit(regVO);

		return new ModelAndView("Registration", "RegVO", editList.get(0));

	}

}
