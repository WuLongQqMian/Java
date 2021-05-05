package cn.edu.xaut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/hello")
	public ModelAndView helloworld() {
		
		ModelAndView mv = new ModelAndView().addObject("msg", "helloworld");
		mv.setViewName("info");
		return mv;
		
	}
	
}
