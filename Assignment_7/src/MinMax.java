import java.util.*;
public class MinMax
{
	public static void main(String args[])
		{
		    Scanner sc=new Scanner(System.in);
		   
		    System.out.println("Enter value = ");
		    int n=sc.nextInt();
		    int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
            	System.out.println("Enter your marks ="+a[i]);
                a[i]=sc.nextInt();
            }
            
		    int min=a[0],max=a[0];
		    for(int i=0;i<n;i++)
            {
              if(a[i]>max)
		      {
		          max=a[i];
		      }
		           
		      else if(a[i]<min)
			  {
			      min=a[i];
			   } 
		    }

		    System.out.println("Maximum ="+max+"\nMinimum="+min);
				
		}

}
