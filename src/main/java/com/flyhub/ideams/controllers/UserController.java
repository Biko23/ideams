package com.flyhub.ideams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.flyhub.ideams.models.User;
import com.flyhub.ideams.repositories.GenderRepository;
import com.flyhub.ideams.services.CountryService;
import com.flyhub.ideams.services.GenderService;
//import com.flyhub.ideams.repositories.UserRepository;
import com.flyhub.ideams.services.PrefixService;
import com.flyhub.ideams.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private PrefixService prefixService;
	@Autowired
	private GenderService genderService;
	@Autowired
	private CountryService countryService;
	
	@GetMapping("users")
	public String showUsers(Model model) {
		
		model.addAttribute("users", userService.getUsers());
		model.addAttribute("prefixes", prefixService.getPrefixes());
		return "users";
	}
	
	@GetMapping("user_registration")
	public String registrationForm(Model model) {
		
//		model.addAttribute("users", userService.addUsers(user));
		model.addAttribute("prefixes",prefixService.getPrefixes());
		model.addAttribute("genders", genderService.getGenders());
		model.addAttribute("countries", countryService.getCountries());
		
		return "add_user";
	}
	
	@PostMapping("user_registration")
	public String registerUser(User user, Model model) {
		
		model.addAttribute("user", userService.addUsers(user));
		
		return "redirect:users";
		
	}

}
