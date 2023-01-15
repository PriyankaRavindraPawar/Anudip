import java.io.*;
import java.util.*;
public class File_3 {

	public static void main(String[] args)throws IOException 
	{
	File obj=new File("D:\\Anudip\\File_3.txt");
	Scanner sc=new Scanner(obj);
	int count=0;
	while(sc.hasNextLine())
	{
		count++;
		String str=sc.nextLine();
		System.out.println(str+"\n");
	}
      System.out.println("Total Line = "+count);
	}

}
