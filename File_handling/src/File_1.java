import java.io.*;
public class File_1
{

	public static void main(String[] args) throws IOException
	{
		
		File obj=new File("MyFile.txt");
		if(obj.createNewFile())
		{
			System.out.println("File is created ["+obj.getName()+"]\nPath ["+obj.getPath()+"]");
		}
		else
		{
			System.out.println("File is already exist");
		}

	}

}
