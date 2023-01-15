import java.util.*;
import java.io.*;

public class File_8
{
	public static void main(String[] args) throws IOException
	{
     File f=new File("D:\\Anudip\\File_3.txt");
    
     Scanner sc=new Scanner(f);
     
     while(sc.hasNextLine());
     {
    	 String data=sc.nextLine();
    	 String[] arr=data.split(" ");
    	 
          for(String word:arr)
       {
    	 if(word.length()<(5))
    	 {
    		 System.out.println(word);
    	 }
      }
    	
    }
    
  }
}