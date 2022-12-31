package com.example;


public class Agent {
	private int id;
	private String name;
	private int salary;
	
	public Agent(int id)
	{
		
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Agent(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Agent() 
	{
	
		// TODO Auto-generated constructor stub
	}
	
	

}