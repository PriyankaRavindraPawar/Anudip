import java.util.*;
public class Triangle
{

	public static void main(String[] args)
	{
	         Scanner sc=new Scanner(System.in);
		     System.out.println("Enter angle A =");
		       int   a=sc.nextInt();
		  
		      System.out.println("Enter angle B = ");
		         int   b=sc.nextInt();
		  
		      System.out.println("Enter angle C =");
		         int   c=sc.nextInt();
		         
		        int n=a+b+c;
		      if(n ==180)
		       {
		          if(a<90 || b<90 || c<90)
		          {
		        	  System.out.println("1st Prize");
		          }
		          else if(a==90 || b==90 || c==90)
		          {
		        	  System.out.println("2nd Prize");
		          } 
		          else if(a==60 || b==60 || c==60)
		          {
		        	  System.out.println("3rd Prize");
		          } 
		       }
		        else 
		         {
		           System.out.println("Not a Prize");
		         }    
		     
    	}
}
		

