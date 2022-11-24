import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
public class File_1
{
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
		         
		    
				FileInputStream obj1 = new FileInputStream("D:\\Anudip\\File_3.txt");
				
				int i;
				String str1 = " ";
				
				while((i=obj1.read())!=-1)   // read data from text file
				{
					System.out.print((char)i);
				}
				
				obj1.close();	
			}
	     
		}
			 
			     
		}


