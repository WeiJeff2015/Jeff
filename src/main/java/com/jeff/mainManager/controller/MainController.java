package com.jeff.mainManager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/main")
public class MainController {

	private String mainPage = "/jeff/main/main.jsp";

	@RequestMapping(value = "/toMainPage")
	public ModelAndView showMain(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName(mainPage);
		return mv;
	}
}
