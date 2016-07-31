import java.util.Scanner;


public class egypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 long a=0,b=0,c=0;
	    while(true)
	    {
	    	 a = in.nextLong();
	    	 b = in.nextLong();
	    	 c = in.nextLong();
	        if(a == 0 && b == 0 && c == 0) break;
	        if(((a*a)+(b*b)==(c*c))||((a*a)+(c*c)==(b*b))||((b*b)+(c*c)==(a*a)))
	        	System.out.println("right");
	        else 
	        	System.out.println("wrong");
	    } 

	}

}
