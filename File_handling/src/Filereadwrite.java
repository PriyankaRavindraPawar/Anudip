import java.io.*;
public class Filereadwrite
{

	public static void main(String[] args) throws IOException{
		
		FileWriter x=new FileWriter("D:\\Anudip\\input.txt");
				
		x.write("hi i am priyanka");
		x.write(  "i am student of anudip foundation");
		x.close();
				
		FileInputStream obj = new FileInputStream("D:\\Anudip\\input.txt");

	}

}
