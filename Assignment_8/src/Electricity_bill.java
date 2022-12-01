import java.util.*;
public class Electricity_bill
{

	public static void main(String[] args)
	{
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("If units are up to 100 == choose 1");
	  	System.out.println("\nIf units are up to 100 to 300 == choose 2");
	  	System.out.println("\n\nEnter your choice =");
		int ch=sc.nextInt();
		
    
     switch(ch)
     {
     case 1:
    	 for(int i=1;i<=100;i++ );
         {
          System.out.println("Charges =1.20rs.perunit");
         }
         break;
     case 2:
    	 for(int i=100;i<=300;i++ );
         {
          System.out.println("Charges =2rs.perunit");
         }
         break;
     default :    
         for(int i=1;i<=300;i++ );
         {
          System.out.println("Charges =3rs.perunit");
         }
     }
	}

}
