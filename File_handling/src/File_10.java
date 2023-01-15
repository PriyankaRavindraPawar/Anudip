import java.io.*;
public class File_10 {

	public static void main(String[] args) throws IOException
	{
	   FileInputStream obj=new FileInputStream("D:\\Anudip\\File_3.txt");
	   FileOutputStream fw=new FileOutputStream("D:\\Anudip\\output.txt"); 
       int i;
       String str="";
       while((i=obj.read())!=-1)
       {
    	   str=str+(char)i;
           System.out.println(str);
           
           fw.write((char)i);
       }
       fw.close();
       obj.close();
	}

}
