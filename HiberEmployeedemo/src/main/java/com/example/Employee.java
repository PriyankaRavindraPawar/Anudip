package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee
{

	public Employee() 
	{
		super();
		
	}
	@Id
	private int E_id;
	private String E_name;
	private String Dept;

	private E_address address;

	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;

	}
	public E_address getAddress() {
		return address;
	}
	public void setE_address(E_address address) {
		this.address = address;
	}


}
