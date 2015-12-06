import java.util.Scanner;


public class TavasAndNavas {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String unos[] = 
			{
			    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
			};

		String[] dieces = 
			{
			    "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
			};
		int a = in.nextInt();

	    if (a < 20) 
	        System.out.println(unos[a]);
	    
	    else if (a % 10 == 0) 
	    	System.out.println( dieces[a/10]);
	    
	    else 
	    	System.out.println( dieces[a/10] + "-" + unos[a%10]);
	    
	}

}
