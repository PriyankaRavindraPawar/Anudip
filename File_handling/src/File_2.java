import java.io.*;
import java.util.*;
public class File_2 {

	public static void main(String[] args)throws IOException
	{
		 FileWriter obj=new FileWriter("D:\\Anudip\\File_2.txt");	
	     obj.write("This is File_2 Filehandaling ex.");
	     obj.write("\nThis is fullstack java training");
	     List<String>color=new ArrayList<>();
	    color.add("Red");
	    color.add("Yellow");
	    color.add("Blue");
	    color.add("Orange");
	    color.add("White");
	    for(String s:color)
	    {
	    	obj.write(s);
	    	obj.write("\n");
	    }
         obj.close();
	}

}

    	  

