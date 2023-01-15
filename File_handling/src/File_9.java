import java.util.regex.*;
public class File_9 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("..s");
		Matcher m=p.matcher("ass");
		boolean b=m.matches();
		System.out.println(b);

        boolean b1=Pattern.compile(".s").matcher("as").matches();
        System.out.println(b);
	}

}
