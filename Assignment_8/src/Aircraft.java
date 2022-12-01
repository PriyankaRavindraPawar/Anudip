import java.util.*;
public class Aircraft {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          
          System.out.println("Enter  Total Row = ");
          int n=sc.nextInt();
           int sum=0;
          int a[]=new int[n];
          System.out.println("Enter row value =");
          for(int i=0;i<n;i++)
          {
            a[i]=sc.nextInt();
          
        	sum+=a[i];
        	 if(a[i]<0)
        	 {
               	System.out.println("Invalid Input");
              }
       //  String result=(n>0)?"Positive":"Negative";
         //        System.out.println(result);
          }
          System.out.println("Real prime numbers : " + Arrays.toString(a));
          System.out.println(sum);
        }
}