import java.util.*;
class Shape
{
	static final double PI = Math.PI;
	public void getArea()
	{
		 System.out.println("\nArea of the Circle and Square : ");
	}
}
class Circle extends Shape
{
	
	   public void getArea(double r)
	  {
		
		 double area= PI*r*r;
		 System.out.println("\nArea of the Circle= "+area);
      }
}
class Square extends Shape
{
	void getArea(double s)
    {
        double area = s*s;
        System.out.println("Area of the Square= "+area);
 	
    }
}


public class Main {

	public static void main(String[] args) {
		Circle obj = new Circle();
	    Square obj2 = new Square();
		obj.getArea(6);
	    obj2.getArea(4);
	}

}
