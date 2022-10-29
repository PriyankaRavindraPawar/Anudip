import java.util.*;
public class Prime_no {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting value =");
	 	int a=sc.nextInt();
	 	System.out.println("Enter Starting value =");
	 	int b=sc.nextInt();
	
		for(int i=a;i<=b;i++)
		{
		    if(checkPrime(i))
		    {
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int num)
	{
	    if(num<2)
	    {
	        return false;
	    }
	    else
	    {
	        int x= num/2;
	        for(int i=2;i<x;i++)
	        {
	            if(num%i==0)
	            {
	               return false;
	            }
	        }
	    }
	    return true;	

	}

}
