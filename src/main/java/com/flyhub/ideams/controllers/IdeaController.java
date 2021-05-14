package com.flyhub.ideams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.flyhub.ideams.services.IdeaService;

@Controller
public class IdeaController {
	
	@Autowired
	private IdeaService ideaService;
	
	@GetMapping("/ideas")
	public String showIdeas(Model model) {
		
		model.addAttribute("ideas", ideaService.getIdeas());
		ideaService.getIdeas();
		return "idea_home";
	}

}
