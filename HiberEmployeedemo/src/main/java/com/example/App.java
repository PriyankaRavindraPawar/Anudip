package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
   
public static void main( String[] args )
{
/*	public static Session getCurrentSession()        //create currunt session to connect mysql
	
	{
		 // Hibernate 5.4 SessionFactory example without XML
		  Map<String, String> settings = new HashMap<String, String>();
		  settings.put("connection.driver_class", "com.mysql.jdbc.Driver");
		  settings.put("dialect", "org.hibernate.dialect.MySQL8Dialect");
		  settings.put("hibernate.connection.url","jdbc:mysql://localhost:3306/anudip");     //giving database
		  settings.put("hibernate.connection.username", "root");
		  settings.put("hibernate.connection.password", "7028047582");          //giving passwode of database
		  settings.put("hibernate.current_session_context_class", "thread");
		  settings.put("hibernate.show_sql", "true");
		  settings.put("hibernate.format_sql", "true");

		  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		                                    .applySettings(settings).build();

		  MetadataSources metadataSources = new MetadataSources(serviceRegistry);
		   metadataSources.addAnnotatedClass(Student.class);
		  Metadata metadata = metadataSources.buildMetadata();

		  // here we build the SessionFactory (Hibernate 5.4)
		  SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		  Session session = sessionFactory.getCurrentSession();
		  return session;
 		}
	Session ss=getCurrentSession();
*/
	Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
   SessionFactory sf=con.buildSessionFactory();
    Session ss=sf.openSession();
    Transaction T=ss.beginTransaction();
    Employee e1=new Employee();
    Employee e2=new Employee();
    e1.setE_id(101);
    e1.setE_name("Pooja");
    e1.setDept("Hr");
    E_address ad1=new E_address();
    
    ad1.setHname("Gokuldham");
    ad1.setArea("Chinchwad");
    ad1.setCity("Pune");
    ad1.setPincode(240034);
    
    e2.setE_id(102);
    e2.setE_name("Poonam");
    e2.setDept("AI");
    E_address ad2=new E_address();
   
    
    ad2.setHname("Saisrusti");
    ad2.setArea("darvi");
    ad2.setCity("Mumbai");
    ad2.setPincode(240034);
   
    e1.setE_address(ad1);
    e2.setE_address(ad2);
    ss.save(e1);
    ss.save(e2);
    T.commit();
	
	
}



}