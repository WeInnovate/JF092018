package org.weinnovate.jf092018.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.weinnovate.jf092018.spring.mvc.model.Customer;

@Controller
public class CustomerController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registrationForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-registration";
	}

	@PostMapping("/register")
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("customer") Customer concreteCustomer) {
		return "profile";
	}
}
