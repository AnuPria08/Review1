package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.home;
import com.example.demo.service.homeservice;

@RestController
public class homecontroller {

		@Autowired
		homeservice service;
		
		@CrossOrigin
		@PostMapping("/home")
		public String add(@RequestBody home b)
		{
			return service.addHome(b);
		}
		
		@CrossOrigin
		@GetMapping("/home")
		public List<home> get()
		{
			return service.getHome();
		}
		
		@CrossOrigin
		@PutMapping("/home")
		public String update(@RequestBody home b)
		{
			return service.updateHome(b);
		}
		
		@CrossOrigin
		@DeleteMapping("/home")
		public String deleteInfo(@RequestParam ("id") int id) {
			service.deleteHomeById(id);
			return "Deleted";
		}
}