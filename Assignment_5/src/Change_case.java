
public class Change_case {

	public static void main(String[] args) {
		  
        String a="HeLlo";
        String b="HeLlo";
        
        a=a.substring(0,5).toUpperCase();
		b=b.substring(0,1).toUpperCase()+b.substring(1,5).toLowerCase();
				 
		    
		  System.out.println(a+"\n"+b);


	}

}
