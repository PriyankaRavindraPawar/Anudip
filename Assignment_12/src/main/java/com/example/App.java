package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

  	  ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
        AgentDao Dao=(AgentDao)ap.getBean("e");
        
        //add agent data
        System.out.println(Dao.saveAgent(new Agent(1,"Priyanka",20000)));  
        System.out.println(Dao.saveAgent(new Agent(2,"Maddy",35000)));  
        System.out.println(Dao.saveAgent(new Agent(3,"Shweta",78000)));  
        System.out.println(Dao.saveAgent(new Agent(4,"Poonam",50000)));  
        System.out.println(Dao.saveAgent(new Agent(5,"Pooja",60000)));  
	
        
       System.out.println(Dao.updateAgent(new Agent(2,"Madhavi",50000)));   // update method call
        
       
       System.out.println(Dao.deleteAgent(new Agent(1)));      // delete method call
        
        System.out.println( "Hello World!" );
    }

}