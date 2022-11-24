import java.util.*;
import java.util.stream.Collectors;

public class Student_API 
{
	
	private int id;
	private String name;
	private int age;
	private int m;

public Student_API (int id,String name,int age,int m)
{

		super();

		this.id=id;
		this.name=name;
		this.age=age;
		this.m=m;
		
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


		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getM() {
			return m;
		}

		public void setM(int m) {
			this.m = m;
		}

	@Override
		public String toString() {
			return "Student_API [id=" + id + ", name=" + name + ", age=" + age + ", m=" + m + "]";
		}


	public static void main(String[] args)
	{   
		  System.out.println("Marka between 60 to 80");
		     
	     List<Student_API >l1=new ArrayList<>();
	     l1.add(new Student_API (101,"Priyanka",22,65));
	     l1.add(new Student_API (102,"Pooja",21,75));
	     l1.add(new Student_API (103,"Poonam",21,35));
	     l1.add(new Student_API (104,"Maddy",21,90));
	     l1.add(new Student_API (105,"Shweta",21,79));
	     l1.add(new Student_API (106,"sonu",21,59));
	    
	     l1.stream().filter(s->s.getM()>60 && s.getM()<=80).forEach(s-> System.out.println(s));
	     
	     
	 /*	for(Student_API  s:l1)
		{
			if(s.getM()>60 && s.getM()<=80 )
			{
				  System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getM());
			}
		}*/
  
	}
}

			

		



