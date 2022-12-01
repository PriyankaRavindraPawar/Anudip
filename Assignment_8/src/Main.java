

class Circle
{
	static final double pi = Math.PI;
	

	public void Area(double r,double r1)
	{
		double area=pi*r*r;
		System.out.println("Area of circle_1="+area);
		
		double area1=pi*r1*r1;
		System.out.println("Area of circle_2="+area1);
	}
}
public class Main
{ 
    public static void main(String[] args)
    {
		
		Circle A=new Circle();
		A.Area(4,20);
		}

	}


