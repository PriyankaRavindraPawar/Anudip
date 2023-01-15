import java.util.*;
import java.io.*;
public class File_6 
{
	public static void main(String[] args) 
	{
		File obj=null;
		boolean b=false;
		obj=new File("D:\\Anudip1");
		b=obj.mkdir();
		if(b)
		{
			System.out.println("Directory is creaed");
		}
		else
		{
			System.out.println("Directory is not created");
		}
		if(obj.delete())
		{
			System.out.println("Folder is deleted");
		}

	}

}
