import java.util.ArrayList;
import java.util.Collections;

class Agent_2 implements Comparable<Agent_2>
{
	private int id;
	private String name;
	private String area;
	public Agent_2(int id, String name, String area) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public int compareTo(Agent_2 a) {
		
			return this.area.compareTo(a.area);
		
	}
}
public class Agent{

	public static void main(String[] args) 
	{
		ArrayList<Agent_2> data = new ArrayList<>();
		data.add(new Agent_2(5,"Priyanka","Jammu"));
		data.add(new Agent_2(3,"Shweta","Pune"));
		data.add(new Agent_2(1,"Pooja","Mumbai"));
		data.add(new Agent_2(2,"Madhavi","Nagpur"));
		data.add(new Agent_2(4,"poonam","Delhi"));
		Collections.sort(data);
		for (Agent_2 i:data)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getArea());
		}

	}

}