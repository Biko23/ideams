package com.flyhub.ideams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.flyhub.ideams.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("users")
	public String showUsers(Model model) {
		
		model.addAttribute("users", userService.getUsers());
		return "users";
	}

}
