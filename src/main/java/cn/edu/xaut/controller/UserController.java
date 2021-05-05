package cn.edu.xaut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.xaut.entity.User;
import cn.edu.xaut.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping("/hello")
	public ModelAndView helloworld() {
		
		ModelAndView mv = new ModelAndView().addObject("msg", "helloworld");
		mv.setViewName("info");
		return mv;
		
	}
	
	@RequestMapping("/count")
	public String count(Model model) {
		
		List<User> users = this.userService.getAllUsers();
		model.addAttribute("msg", users.size());
		return "info";
		
	}
	
}
