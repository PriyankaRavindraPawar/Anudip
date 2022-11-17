import java.util.*;
public class Hashmap {

	public static void main(String[] args)
	{
	    HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=1;i<=15;i++)
        {
        	int sqr=i*i;
        	
        	h1.put(i,sqr);
        
        }
    	System.out.println(h1);
	}

}
