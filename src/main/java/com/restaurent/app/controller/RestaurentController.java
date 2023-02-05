package com.restaurent.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurent.app.restaurents.Restaurents;
import com.restaurent.app.service.RestaurentServices;

@RestController
public class RestaurentController {

	@Autowired
	public RestaurentServices restaurentServices;
	
	@GetMapping("/restaurent")
	public List<Restaurents> getRestaurent(){
		
		return this.restaurentServices.getRestaurents();
	}
	
	@GetMapping("/restaurent/{id}")
	public Restaurents getRestaurentId(@PathVariable("id") int id) {
		return this.restaurentServices.getRestaurent(id);
	}
	
	@PostMapping("/restaurent")
	public String addRestaurent(@RequestBody Restaurents data) {
		this.restaurentServices.addRestaurent(data);
		return "Succesfully added";
	}
	
	
	@DeleteMapping("/restaurent/{id}")
	public String deleteRestaurent(@PathVariable("id") int id) {
		try {
			
			return this.restaurentServices.deleteRestaurent(id);
		}catch (Exception e) {
			// TODO: handle exception
			return "Not Found";
		}
	}
}
