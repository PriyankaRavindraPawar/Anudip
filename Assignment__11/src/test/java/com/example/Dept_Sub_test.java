package com.example;
import static org.junit.Assert.assertTrue;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.edu.After;
import com.edu.App;
import com.edu.Before;


public class Dept_Sub_test
{
	
		 private static Session session;
		 @BeforeClass
		    public static void setup() {
		         
		    }
		  
		 @AfterClass
		    public static void tearDown() {
		        if (session != null) session.close();
		        System.out.println("Session destroyed");
		    }
		   
		    @Test
		    public void testGet() {
		    }
		     
		    @Test
		    public void testList() {
		    	
		    }   
		
		
		    
		 /*  @Test
		     public void testCreate() {
		    	Subjects s = new Subjects(2,"Python Programming",12);
		    	    Integer Sub_id = (Integer) session.save(s);
		    	     
		    	    session.getTransaction().commit();
		    	     
		    	    assertTrue(Sub_id > 0);
		    }
		    */
		     

}
