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
	
	//mapping HTTP POST requests onto specific handler methods.
	@PostMapping("/groceries")
	public Groceries createGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.createGroceries(groceries);
		
		//create table Groceries
		
		/*+----+-----------+-------+----------+
          | id | name      | price | quantity |
          +----+-----------+-------+----------+
          |  1 | Sugar     |    40 |        2 |
          |  2 | moongdal  |   110 |        1 |
		  |  3 | Termaric  |    10 |        3 |
          |  5 | Groundnut |   120 |        1 |
          +----+-----------+-------+----------+*/
	}

	//mapping HTTP GET requests onto specific handler methods
	@GetMapping("/groceries")
	List<Groceries> findAllGroceries()
	{
		return groceriesService.findAllGroceries();
		
		//All are find using getmapping(localhost:1010/groceries)
		/*[
    {
        "id": 1,
        "name": "Sugar",
        "price": 40,
        "quantity": 2
    },
    {
        "id": 2,
        "name": "moongdal",
        "price": 110,
        "quantity": 1
    },
    {
        "id": 3,
        "name": "Termaric",
        "price": 10,
        "quantity": 3
    },
    {
        "id": 4,
        "name": "Groundnut",
        "price": 120,
        "quantity": 1
    }
]*/
	}
	
	
	// maps HTTP DELETE requests onto specific handler methods.
	@DeleteMapping("/groceries/{id}")
	public String deleteGroceries(@PathVariable int id)
	{
		groceriesService.deleteGroceries(id);
		return "Groceries deleted";
		
		//After deleting Groceries table
		/*+----+----------+-------+----------+
          | id | name     | price | quantity |
          +----+----------+-------+----------+
          |  1 | Sugar    |    40 |        2 |
          |  2 | Ghee     |   600 |        1 |
          |  3 | Termaric |    10 |        3 |
          +----+----------+-------+----------+*/
	}
	
	//mapping HTTP PUT requests onto specific handler methods
	@PutMapping("/groceries")
	public Groceries updateGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.updateGroceries(groceries);
		
		//update Groceries table
		/*+----+-----------+-------+----------+
          | id | name      | price | quantity |
          +----+-----------+-------+----------+
          |  1 | Sugar     |    40 |        2 |
          |  2 | Ghee      |   600 |        1 |
          |  3 | Termaric  |    10 |        3 |
          |  4 | Groundnut |   120 |        1 |
          +----+-----------+-------+----------+*/
	}
	
	
	@GetMapping("/groceries/id/{id}")
	public List<Groceries> findByid(@PathVariable int id)
	{
		return groceriesService.findByid(id);
		
		//retrive data by id using getmapping(localhost:1010/groceries/id/1)
		/*[
    {
        "id": 1,
        "name": "Sugar",
        "price": 40,
        "quantity": 2
    }
]*/
	}
	
	
	@GetMapping("/groceries/name/{name}")
	public List<Groceries> findByname(@PathVariable String name)
	{
		return groceriesService.findByname(name);
		
		//retrive data by name using getmapping(localhost:1010/groceries/name/moongdal)
		/*[
    {
        "id": 2,
        "name": "moongdal",
        "price": 110,
        "quantity": 1
    }
]*/
	}
}