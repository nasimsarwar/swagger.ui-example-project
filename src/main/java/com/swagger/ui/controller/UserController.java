package com.swagger.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "Hello User Method";
	}

	@PostMapping
	public String createUser() {
		return "Hello User Method";
	}

	@PutMapping
	public String updateUser() {
		return "Hello User Method";
	}

	@DeleteMapping
	public String deleteeUser() {
		return "Hello User Method";
	}
}
