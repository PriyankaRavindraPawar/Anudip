
public class Matrix {

	public static void main(String[] args) {

		        int [][]a={{1,2},{4,5},{8,9}};
		         int tra[][]=new int[3][2];
		         System.out.println("Matrix 'A':\n");
		      for(int i=0;i<3;i++)
		         {
		            for(int j=0;j<2;j++)
		            {
		                System.out.print(a[i][j]+" ");
		            
		            }    
		                System.out.println(" ");
		        }
		      
		         System.out.println("Matrix 'A' Transpose:\n");
		        for(int i=0;i<2;i++)
		         {
		            for(int j=0;j<3;j++)
		            {
		                tra[j][i]=a[j][i];
		              System.out.print(tra[j][i]+" ");
		            
		            }    
		                System.out.println(" ");
		       }
 	 }

}

	


