package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Groceries;

//this annotation  marke this interface has service provider
@Service
public interface GroceriesService {
	
	//all are unimplemented method
	Groceries createGroceries(Groceries groceries);
	List<Groceries> findAllGroceries();
	void deleteGroceries(int id);
	Groceries updateGroceries(Groceries groceries);
	List<Groceries> findByid(int id);
	List<Groceries> findByname(String name);

}

