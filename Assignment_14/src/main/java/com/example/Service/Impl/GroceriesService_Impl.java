package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Groceries;
import com.example.Repository.GroceriesRepository;
import com.example.Service.GroceriesService;

//to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository
public class GroceriesService_Impl implements GroceriesService {
	
	//connection with groceriesrepository
	@Autowired
	GroceriesRepository groceriesRepository;
	
	//all method of GroceriesService implemented by this class
	@Override
	
	//create Groceries
	public Groceries createGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		return groceriesRepository.save(groceries) ;
	}

	@Override
	
	//find the all Groceries
	public List<Groceries> findAllGroceries() {
		// TODO Auto-generated method stub
		return groceriesRepository.findAll();
	}

	@Override
	
	//delete the Groceries
	public void deleteGroceries(int id) {
		// TODO Auto-generated method stub
		groceriesRepository.deleteById(id);
		
	}

	@Override
	
	//update the Groceries
	public Groceries updateGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		Groceries _groceries=groceriesRepository.findById(groceries.getId()).get();
		_groceries.setName(groceries.getName());
		_groceries.setPrice(groceries.getPrice());
		_groceries.setQuantity(groceries.getQuantity());
		return groceriesRepository.save(_groceries) ;
	}

	@Override
	
	//find the groceries by id
	public List<Groceries> findByid(int id) {
		// TODO Auto-generated method stub
		return groceriesRepository.findByid(id);
	}

	@Override
	
	//find the Groceries by name
	public List<Groceries> findByname(String name) {
		// TODO Auto-generated method stub
		return groceriesRepository.findByname(name);
	}

}

