package org.weinnovate.jf092018.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("helllo");
		return "index";
	}
}
