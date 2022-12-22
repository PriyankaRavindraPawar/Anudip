package com.example;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private int T_id;
  private String T_name;
  private String dept;
  
  @OneToMany
  private List<Subjects> Ti;

public List<Subjects> getTi() {
	return Ti;
}
public void setTi(List<Subjects> Ti) {
	this.Ti = Ti;
}

public int getT_id() {
	return T_id;
}
public void setT_id(int t_id) {
	T_id = t_id;
}
public String getT_name() {
	return T_name;
}
public void setT_name(String t_name) {
	T_name = t_name;
}

public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Teacher() {

// TODO Auto-generated constructor stub
}

}

