
package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subjects")
public class Subjects{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sub_id;
	private String sub_name;
	private int time;
	
	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
    
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Subjects(){     // 
		
		// TODO Auto-generated constructor stub
	}

	@OneToMany                 //create One to Many relation 
	@JoinColumn(name="T_id")
	private Teacher teacher;
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	

}
