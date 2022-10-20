import java.util.*;
public class Assending {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in); 
		  System.out.println("Enter String:"); 
		  String str=sc.nextLine(); 
		  String[] str1=str.split("\\s"); 
		  for(int i=0;i<str1.length;i++) 
		  { 
		  for(int j=i+1;j<str1.length;j++) 
		  { 
		  if(str1[i].length()>str1[j].length()) 
		  { 
		  String temp= str1[i]; 
		  str1[i]=str1[j]; 
		  str1[j]=temp; 
		  } 
		  } 
		   } 
		  for(int i=0;i<str1.length;i++) 
		  { 
		  System.out.println(str1[i]+" ");  
		  } 

	}

}
