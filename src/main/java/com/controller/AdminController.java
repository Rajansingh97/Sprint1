package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminController {
	@GetMapping("/Admin")
	public String getMessage() {
		return "welcome to admin";
	}
	

}
