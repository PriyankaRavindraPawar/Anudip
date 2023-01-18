package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Groceries;
import com.example.Service.GroceriesService;

//create RESTful web services using Spring MVC.
@RestController
public class GroceriesController {
	
	//connection with GroceriesService
	@Autowired
	GroceriesService groceriesService;
	
	//POST requests onto specific handler methods.
	@PostMapping("/groceries")
	public Groceries createGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.createGroceries(groceries);
		
	}

	//mapping HTTP GET requests onto specific handler methods
	@GetMapping("/groceries")
	List<Groceries> findAllGroceries()
	{
		return groceriesService.findAllGroceries();
		
	}
	
	//DELETE requests onto specific handler methods.
	@DeleteMapping("/groceries/{id}")
	public String deleteGroceries(@PathVariable int id)
	{
		groceriesService.deleteGroceries(id);
		return "Groceries deleted";
		
	}
	@PutMapping("/groceries")
	public Groceries updateGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.updateGroceries(groceries);
		
	}
	
    @GetMapping("/groceries/id/{id}")
	public List<Groceries> findByid(@PathVariable int id)
	{
		return groceriesService.findByid(id);
	}
	@GetMapping("/groceries/name/{name}")
	public List<Groceries> findByname(@PathVariable String name)
	{
		return groceriesService.findByname(name);
	}
}