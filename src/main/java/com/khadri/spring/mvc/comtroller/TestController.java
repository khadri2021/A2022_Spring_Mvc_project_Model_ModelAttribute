package com.khadri.spring.mvc.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khadri.spring.mvc.form.LoginForm;

@Controller
public class TestController {

//	@RequestMapping("/")
//	public String homePage(Model model) {
//		
//		LoginForm login = new LoginForm();
//		
//		model.addAttribute("loginForm", login); 
//		
//		return "index";
//	}
//	
//	
//	
//	@RequestMapping("/hit")
//	public String readData(LoginForm login, Model model) {
//
//		model.addAttribute("loginForm", login); 
//		 
//		return "result";
//	}

	@RequestMapping("/")
	public String homePage(@ModelAttribute("loginForm") LoginForm login) {
		return "index";
	}

	@RequestMapping("/hit")
	public String readData(@ModelAttribute("loginForm") LoginForm login) {

		return "result";
	}

}
