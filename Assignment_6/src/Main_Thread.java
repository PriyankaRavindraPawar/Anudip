import java.util.*;
import java.lang.*;
public class Main_Thread implements Runnable
{
	
	public static void main(String[] args)
	{
		
	Runnable obj=new Runnable() 
	{
	public void run()
	{
		
	    int sum=0;
	    float avg=0;
		for(int i=1;i<=50;i++)
		{
			sum+=i;
			
			avg=(sum/50);
			
		}
		System.out.println("Average ="+avg);
	 }
	};
	Runnable obj1=()->
	{
	   int array[]= {10,15,20,25,30};
		
		for(int i=0;i<array.length;i++)
		{
		   int sqr=array[i]*array[i];
			System.out.println("\nSquare of "+array[i]+"="+sqr);
		}
		
	};
	
	
	 new Thread(obj).start();
	 Thread t1=new Thread(obj1);
	 t1.start();
	
	}	
	public void run()
	{
		
	}
	

}   


