package com.appsecurity.demo.controller;

import com.appsecurity.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AuthController {

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "You have been logged out successfully";
	}

}
