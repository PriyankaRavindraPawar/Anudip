package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
    	Configuration con1=new Configuration().configure().addAnnotatedClass(Subjects.class);
       SessionFactory sf=con.buildSessionFactory();
        Session ss=sf.openSession();
    	//Session ss=getCurrentSession();
        Transaction T=ss.beginTransaction();
        
        Subjects s1=new Subjects();     //Subject Attribute
        s1.setSub_id(1);
        s1.setSub_name("Java Programming");
        s1.setTime(10);
        
        Subjects s2=new Subjects();
        s2.setSub_id(2);
        s2.setSub_name("Python Programming");
        s2.setTime(12);
        
        Subjects s3=new Subjects();
        s3.setSub_id(3);
        s3.setSub_name("Angular Programming");
        s3.setTime(2);
        
        Teacher t1=new Teacher();       //teacher Attribute
        t1.setT_name("Mrunali");
        t1.setT_id(101);
        t1.setDept("Technology");
        
        List<Subjects> Ti=new ArrayList<>();
        Ti.add(s1);
        Ti.add(s2);
        Ti.add(s3);
        t1.setTi(Ti);;
        s1.setTeacher(t1);
        s2.setTeacher(t1);
        s2.setTeacher(t1);
        
        ss.persist(T);
        ss.persist(t1);
        T.commit();
        ss.close();

    	
        System.out.println( "Hello World!" );
    }
}
