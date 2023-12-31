package net.jt.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home" , "/index" } )
	public ModelAndView index() 	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		return mv;
	}

//	
//	@RequestMapping(value = "/test" )
//	public ModelAndView test(@RequestParam("greeting") String greeting) 
//	{
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		
//		return mv;
//	}
	
//	@RequestMapping(value = "/test/{path}" )
//	public ModelAndView test(@PathVariable("path") String path) 
//	{
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", path);
//		
//		return mv;
//	}

}
