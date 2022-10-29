import java.io.*;
class Area
{
	static final double PI = Math.PI;
	
		void triangle(double l,double b)
		    {
		        double area = (l*b)/2;
		        System.out.println("Area of the Triangle= "+area);
		    }
		 
		 void circle(double r)
		    {
		        double area= PI*r*r;
		        System.out.println("\nArea of the Circle= "+area);
		    }
}
public class Shape
{
	public static void main(String[] args)
	{

	        Area obj = new Area();
	        obj.triangle(4,4);
	        obj.circle(4);
	        
	        
	   }
	
}


