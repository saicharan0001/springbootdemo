package com.example.springbootdemosss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {
 @GetMapping("/hello")
 public String greet() {
	 return "welcome";
 }
}
