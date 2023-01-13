import java.util.*;

public class Array_PerfectSquare 
{
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = new int[4];
	        
	        System.out.println("Enter 4 numbers");
	        for (int i = 0; i < arr.length; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("Perfect Squares are:");
	        for (int i = 0; i < arr.length; i++)
	        {
	            double sr = Math.sqrt(arr[i]);
	            if ((sr - Math.floor(sr)) == 0)
	                System.out.print(arr[i] + ", ");
	        }
	    
	    }

}

/*
output
Enter 4 numbers
16
144
169
224
Perfect Squares are:
16, 144, 169, 
*/