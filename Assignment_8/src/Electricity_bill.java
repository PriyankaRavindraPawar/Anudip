import java.util.*;
public class Electricity_bill
{

	public static void main(String[] args)
	{
	  	Scanner sc=new Scanner(System.in);
	  	;
	  	System.out.println("\nEnter your unit =");
		int unit=sc.nextInt();
		
      
        double money;
     
    	 
    	 if(unit>0 && unit<=100)
         {
          System.out.println("Charges =1.20rs.perunit");
          money=unit*1.20;
          System.out.println("Total Charges="+money);
         }
        
    	 else if(unit>100 && unit<=300)
         {
          System.out.println("Charges =2rs.perunit");
          money=unit*2.0;
          System.out.println("Total Charges="+money);
         }
   
         else if(unit>300)
         {
          System.out.println("Charges =3rs.perunit");
          money=unit*3.0;
          System.out.println("Total Charges="+money);
         }
         else 
         {
        	
             System.out.println("Sorry not Available");
         }
	}

}
