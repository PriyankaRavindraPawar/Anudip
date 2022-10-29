public class Pattern {

	public static void main(String[] args) 
    {

		for (int i=0;i<5;i++)
		{
		   System.out.print("* ");	
		   for (int j=1;j<5;j++)
		   {
		  
	      	if(i==5-1)
	      	{
		       System.out.print("* ");
		    }
		    else 
		    {
		       System.out.print(" ");
		    }
		  }
		System.out.println("\n");
	  }
	
	}
}


