package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
	@GetMapping("/Customer")
	public String getMessage() {
		return "welcome to customer";
	}
	

}
