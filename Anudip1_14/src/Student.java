import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
			  

				Scanner sc=new Scanner(System.in);
				System.out.println("Enter roll no = ");
				int n=sc.nextInt();
				if(n%4==1)
				{
					System.out.println("Emerald Group"); //1,5,9,13......
				}
				else if(n%4==2)
				{
				    System.out.println("Ruby Group"); //2,6,10,14......
				}
				else if(n%4==3)
				{
					System.out.println("Perl Group"); //3,7,11,15.......
				}
				else if(n%4==0)
				{
					System.out.println("Saphire Group"); //4,8,12,16......
				}
				else
				{
					System.out.println("Invalid Input"); 
				}
			}

		}

