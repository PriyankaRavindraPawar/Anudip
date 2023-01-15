import java.io.*;
public class File_11 {

	public static void main(String[] args) throws IOException
	{
	   FileInputStream obj=new FileInputStream("D:\\Anudip\\File_3.txt");
       int i;
       while((i=obj.read())!=-1)
       {
    	   System.out.println((char)i);
       }
	}

}
