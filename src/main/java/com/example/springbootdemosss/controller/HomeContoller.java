package com.example.springbootdemosss.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemosss.model.User;

@RestController
public class HomeContoller {
 @GetMapping("/hello")
 public String greet() {
	 return "welcome";
 }
 @GetMapping("/users")
 public List users() {
	 List<User> u = new ArrayList<User>();
	 u.add(new User(1,"sai","head"));
	 u.add(new User(2,"charan","head"));
	 u.add(new User(3,"abhi","head"));
	 u.add(new User(4,"hello","head"));
	 u.add(new User(5,"sai","head"));
	 return u;
 }
}
