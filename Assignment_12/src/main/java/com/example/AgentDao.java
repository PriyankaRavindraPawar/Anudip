package com.example;
import org.springframework.jdbc.core.JdbcTemplate;

//crud operation
public class AgentDao // create class


{
	JdbcTemplate jdbcTemplate;
	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) //JdbcTemplate method/connection
	{
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	public int saveAgent(Agent a) // save/Insert  method
	{
		String query="insert into Agent_Details values('"+a.getId()+"','"+a.getName()+"','"+a.getSalary()+"')";
		return jdbcTemplate.update(query);
		
	}
	
	public int updateAgent(Agent a) // update method
	{
		String query="update Agent_Details set salary='"+a.getSalary()+"'where id='"+a.getId()+"'";
		return jdbcTemplate.update(query);
	}
	public int deleteAgent(Agent a)  // delete method
	{
		String query="delete from Agent_Details where id='"+a.getId()+"'";
		return jdbcTemplate.update(query);
		
		
		
	}
	
	

}