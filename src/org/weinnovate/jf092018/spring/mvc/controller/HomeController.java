package org.weinnovate.jf092018.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("helllo");
		return "index";
	}

	@GetMapping(value = "/greet")
	public @ResponseBody String greet() {
		return "Hello there!!!";
	}

	@GetMapping(value = "/greetMe")
	public @ResponseBody String greetMe(HttpServletRequest request) {
		return "Hello " + request.getParameter("name") + "!!!";
	}

	@GetMapping(value = "/greetMeRequestParam")
	public @ResponseBody String greetMeRequestParam(@RequestParam("name") String myName) {
		return "Hello " + myName + "!!!";
	}

	@GetMapping(value = "/greetMePathParam/{name}")
	public @ResponseBody String greetMePathParam(@PathVariable("name") String myName) {
		return "Hello " + myName + "!!!";
	}

	@GetMapping(value = "/customerOrder/{customerId}/{orderId}")
	public @ResponseBody String customerOrder(@PathVariable("customerId") String customerId,
			@PathVariable("orderId") String orderId) {
		return "Hello " + customerId + " Your order number is " + orderId + "!!!";
	}
	
	@GetMapping(value = "/modelExample")
	public String modelExample(Model model) {
		model.addAttribute("name", "Prateek Kumar");
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pine Apple");
		fruits.add("Guava");
		
		model.addAttribute("fruits", fruits);
		
		return "model-example";
	}
}
