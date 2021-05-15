package com.flyhub.ideams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;

import com.flyhub.ideams.services.PrefixService;

@Controller
public class PrefixController {
	
	@Autowired
	private PrefixService prefixService;
	
//	@GetMapping

}
