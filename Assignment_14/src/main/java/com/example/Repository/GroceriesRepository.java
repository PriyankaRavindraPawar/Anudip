package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Groceries;
//This repository extends JpaRepository interface 
public interface GroceriesRepository extends JpaRepository<Groceries,Integer>{
	
			//Custom method
			List<Groceries> findByid(int id);
			List<Groceries> findByname(String name);
}