import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fileread_7 {

	
		public static void main(String[] args)throws IOException
		{
		     File obj=new File("D:\\Anudip\\File_3.txt");
		    Scanner sc=new Scanner(obj);
		    int count=0;
	
		     
		     while(sc.hasNextLine())
		     {
		    	 String str=sc.nextLine();
		    	 String []arr=str.split(" ");
	             count +=arr.length;
		     }
		     System.out.println(count);
		
         }

}
