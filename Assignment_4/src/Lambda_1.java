
interface Addition
{
    public int add(int a, int b);
}
interface Upper_case
{
    public String text(String c);
}
class Lambda_1 
{
	public static void main(String args[])
	{
       Addition A=(x, y)->
       {
       return x+y; 
       };  
       Upper_case B=(tex)->
       {
    	  return (tex.toUpperCase());
       };
    System.out.println(A.add(10,20));
    System.out.println(B.text("hello world"));

	}

}
